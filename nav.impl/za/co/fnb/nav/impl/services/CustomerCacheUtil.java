package za.co.fnb.nav.impl.services;

import java.util.*;

import za.co.fnb.nav.car.core.*;
import za.co.fnb.nav.car.core.services.*;

class CustomerCacheUtil {
    static List<Customer> getCustomers() {
        var list = new ArrayList<Customer>();
        for (String name: new String[]{"Thulani","Malose","Tshepo","Mohammed","Vardy"}) {
            for (String lastName:new String[]{"Matang","Mbatha","Segoe","Lorgat","Stroop","Andrews"}) {
                Customer customer = new Customer(name, lastName);
                list.add(customer);
            }
        }

        return list;
    }

    static Customer getCustomer() {
        var list = getCustomers();
        return list.get(new Random().nextInt(list.size()));
    }
}