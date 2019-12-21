package za.co.fnb.nav.car.core.services;

import java.util.*;
import za.co.fnb.nav.car.core.*;

public interface CustomerService {
    List<Customer> getCustomers();
    Customer getCustomer(String name, String lastName);
}