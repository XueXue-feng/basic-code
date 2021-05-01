package cn.itcast.dayweb.demo.demo17WaitAndNotify.BaoZi;

public class Test<psv> {
    public static void main(String[] args) {
        Resource resource = new Resource();
        Customer customer = new Customer();
        Restaurant restaurant = new Restaurant();
        Thread threadA = new Thread(restaurant);
        restaurant.resource = resource;
        //restaurant.customer = customer;

        Thread threadB = new Thread(customer);
        customer.resource = resource;
        //customer.restaurant = restaurant;
        threadA.start();
        threadB.start();


    }
}
