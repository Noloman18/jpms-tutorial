package za.co.fnb.nav.car.core;

import java.time.LocalDate;

public class Asset {
    public String registrationNumber;
    public LocalDate expiryDate;

    public Asset(String registrationNumber, LocalDate expiryDate) {
        this.registrationNumber = registrationNumber;
        this.expiryDate = expiryDate;
    }
}