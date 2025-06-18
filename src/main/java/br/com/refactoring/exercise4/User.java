package br.com.refactoring.exercise4;

public class User {
    private final String name;
    private final String email;
    private final AddressCollection addresses;

    public User(String name, String email, AddressCollection addresses) {
        if (name == null) {
            throw new IllegalArgumentException("Name must not be null.");
        }
        if (email == null) {
            throw new IllegalArgumentException("Email must not be null.");
        }
        if (addresses == null) {
            throw new IllegalArgumentException("Addresses must not be null.");
        }
        this.name = name;
        this.email = email;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public AddressCollection getAddresses() {
        return addresses;
    }
}
