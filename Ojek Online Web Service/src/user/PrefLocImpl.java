package user;

import interfaces.user.PrefLoc;

import javax.jws.WebService;

@WebService
public class PrefLocImpl implements PrefLoc {

    @Override
    public String addPrefLoc(String accessToken, String location) {
        // Check Token

        //
        return null;
    }

    @Override
    public String deletePrefLoc(String accessToken, String location) {
        // Check Token

        //
        return null;
    }

    @Override
    public String editPrefLoc(String accessToken, String oldLocation, String newLocation) {
        // Check Token

        // Access database
        return null;
    }

}
