package interfaces.user;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService()
public interface History {
  @WebMethod
  String getDriverHistory(String access_token);

  @WebMethod
  String getOrderHistory(String access_token);
}
