package order;

import interfaces.order.Order;

import javax.jws.WebService;

@WebService
public class OrderImpl implements Order {

  @Override
  public String getProfile(String access_token) {

    return null;
  }
}
