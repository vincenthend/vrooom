package user;
import interfaces.user.Profile;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService()
public class ProfileImpl implements Profile {
  @Override
  public String getProfile(String access_token) {
    // Check Access Token to Identity Service

    // Access database, get profile

    return null;
  }
}