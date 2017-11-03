package user;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService()
public class History {
  @WebMethod
  public String getDriverHistory(String access_token) {
    // Check Access Token to Identity Service

    // Access database, get history

    return null;
  }

  @WebMethod
  public String getOrderHistory(String access_token) {
    // Check Access Token to Identity Service

    // Access database, get history

    return null;
  }
}
