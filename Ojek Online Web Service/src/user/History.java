package user;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService()
public class History {
    @WebMethod
    public Object getHistory(int userId) {
        //implementasi
        return userId;
    }
}
