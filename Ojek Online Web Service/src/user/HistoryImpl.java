package user;

import interfaces.user.History;

import javax.jws.WebService;


@WebService()
public class HistoryImpl implements History{
  @Override
  public String getDriverHistory(String access_token) {
    // Check Access Token to Identity Service

    // Access database, get history

    return null;
  }

  @Override
  public String getOrderHistory(String access_token) {
    // Check Access Token to Identity Service

    // Access database, get history

    return null;
  }
}
