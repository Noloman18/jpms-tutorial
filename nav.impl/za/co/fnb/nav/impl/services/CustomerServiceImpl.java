package za.co.fnb.nav.impl.services;

import java.util.*;

import za.co.fnb.nav.car.core.*;
import za.co.fnb.nav.car.core.services.*;

public class CustomerServiceImpl implements CustomerService {
    @Override
    public List<Customer> getCustomers() {
        return CustomerCacheUtil.getCustomers();
    }

    @Override
    public Customer getCustomer(String name, String lastName) {
        return CustomerCacheUtil.getCustomer();
    }
}