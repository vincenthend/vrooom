package user;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class PreferredLocation {

  @WebMethod
  public String addPrefLoc(String accessToken, String location){
    // Check Token

    //
    return null;
  }

  @WebMethod
  public String deletePrefLoc(String accessToken, String location){
    // Check Token

    //
    return null;
  }

  @WebMethod
  public String editPrefLoc(String accessToken, String oldLocation, String newLocation){
    // Check Token

    // Access database
    return null;
  }

}
