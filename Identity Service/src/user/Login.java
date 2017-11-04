package user;

import db.Database;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Random;

@WebServlet(name = "user.Login")
public class Login extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        try {
            Database db = new Database();
            db.openConnection();
            ArrayList<ArrayList<String>> result = db.select("SELECT * FROM user WHERE username='" + username + "' AND password='" + password + "'");

            Token token = new Token();
            JSONObject return_json;

            if(result.size() == 1) {
                String id = result.get(0).get(0);
                return_json = token.generateToken(id, username);

                // Write token and expiry to db
                String token_value = return_json.getJSONObject("login_token").getString("token");
                long unix_time = System.currentTimeMillis() / 1000L;
                long expiry_time = unix_time + 900; // expiry time 15 minutes
                db.update("UPDATE user SET token='" + token_value + "', expiry=" + expiry_time + " WHERE id=" + id);
            }
            else {
                return_json = token.getEmptyToken();
            }

            db.closeConnection();

            // Write response
            PrintWriter out = response.getWriter();
            response.setContentType("application/json");
            out.println(return_json.toString());
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}