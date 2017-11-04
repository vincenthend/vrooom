package user;

import db.Database;
import jdk.nashorn.internal.objects.NativeJSON;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;

@WebServlet(name = "user.Validator")
public class Validator extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        JSONObject auth_token = new JSONObject(request.getParameter("token"));
        boolean token_valid = false;

        // Validate token
        try {
            Database db = new Database();
            db.openConnection();
            ArrayList<ArrayList<String>> result = db.select("SELECT * FROM user WHERE id="+auth_token.getString("id"));

            if(result.size() == 1) {
                // Get token
                String user_token = result.get(0).get(4);
                if (user_token.equals(auth_token.getString("token"))) {
                    token_valid = true;
                }
            }

            db.closeConnection();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        // Write response
        JSONObject return_json = new JSONObject();
        return_json.put("status",token_valid);

        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        out.println(return_json.toString());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        JSONObject return_json = new JSONObject();
        return_json.put("status",false);

        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        out.println(return_json.toString());
    }
}
