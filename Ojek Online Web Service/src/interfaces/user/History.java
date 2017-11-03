package interfaces.user;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService()
public interface History {
    /**
     * Mengembalikan daftar history sebagai driver.
     * @param access_token accessToken user yang sedang login
     * @return
     */
    @WebMethod
    String getDriverHistory(String access_token);

    /**
     * Mengembalikan daftar history sebagai user.
     * @param access_token accessToken user yang sedang login
     * @return
     */
    @WebMethod
    String getOrderHistory(String access_token);
}
