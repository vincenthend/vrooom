package user;

import interfaces.user.Profile;

import javax.jws.WebService;

@WebService()
public class ProfileImpl implements Profile {
    @Override
    public String getProfile(String access_token) {
        // Check Access Token to Identity Service

        // Access database, get profile

        return null;
    }

    @Override
    public String addProfile(String access_token) {
        return null;
    }

    @Override
    public String updateProfile(String access_token) {
        return null;
    }

    @Override
    public String getDriver(String name) {
        return null;
    }
}