package interfaces.user;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService()
public interface Profile {
    /**
     * Mengembalikan isi profile dari user yang sedang login.
     *
     * @param access_token access token user yang sedang login
     * @return
     */
    @WebMethod
    String getProfile(String access_token);

    /**
     * Menambahkan profile dari user baru.
     *
     * @param access_token access token user yang sedang login
     * @return
     */
    @WebMethod
    String addProfile(String access_token);

    /**
     * Melakukan update pada profile user.
     *
     * @param access_token access token user yang sedang login.
     * @return
     */
    @WebMethod
    String updateProfile(String access_token);

    /**
     * Mengambil nama semua user yang bekerja sebagai driver dengan nama yang sudah ditentukan.
     *
     * @param name
     * @return
     */
    @WebMethod
    String getDriver(String name);
}