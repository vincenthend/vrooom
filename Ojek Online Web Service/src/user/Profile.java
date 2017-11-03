package user;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService()
public class Profile {
  @WebMethod
  public String getProfile(String access_token) {
    // Check Access Token to Identity Service

    // Access database, get profile

    return null;
  }
}