package za.co.fnb.nav.car.core;

import java.util.*;

public class Customer {
    public final List<Asset> listOfAssets;
    public final String name;
    public final String lastName;

    public Customer(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.listOfAssets = new ArrayList<>();
    }
}