package order;

import interfaces.order.Order;

import javax.jws.WebService;

@WebService
public class OrderImpl implements Order {
    @Override
    public String makeOrder(String access_token) {
        //Check token, make Order
        return null;
    }
}
