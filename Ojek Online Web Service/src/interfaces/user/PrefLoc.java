package interfaces.user;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface PrefLoc {

  @WebMethod
  String addPrefLoc(String accessToken, String location);

  @WebMethod
  String deletePrefLoc(String accessToken, String location);

  @WebMethod
  String editPrefLoc(String accessToken, String oldLocation, String newLocation);

}
