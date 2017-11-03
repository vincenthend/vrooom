package interfaces.user;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService()
public interface Profile {
  @WebMethod
  String getProfile(String access_token);
}