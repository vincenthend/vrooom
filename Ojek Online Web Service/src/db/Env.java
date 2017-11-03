package db;

import java.io.File;
import java.util.Scanner;

public class Env {

    private String username;
    private String password;

    public Env() throws Exception {

        File file = new File(".env");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String data[] = line.split("=");

            if (data.length == 2) {
                if (data[0].equals("DB_USERNAME")) username = data[1];
                else if (data[0].equals("DB_PASSWORD")) password = data[1];
            } else {
                username = "root";
                password = "";
                break;
            }
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}