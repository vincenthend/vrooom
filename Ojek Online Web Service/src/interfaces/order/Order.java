package interfaces.order;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Order {

    /**
     * Membuat order
     * @param access_token accessToken user yang sedang login
     * @return
     */
    @WebMethod
    String makeOrder(String access_token);
}
