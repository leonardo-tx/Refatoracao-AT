package br.com.refactoring.exercise4;

import java.util.ArrayList;
import java.util.List;

public class AddressCollection {
    private final List<Address> addresses = new ArrayList<>();

    public void addAddress(Address address) {
        if (address == null) {
            throw new IllegalArgumentException("The address must not be null.");
        }
        addresses.add(address);
    }
}
