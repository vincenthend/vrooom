package interfaces.order;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Order {

  @WebMethod
  String getProfile(String access_token);
}
