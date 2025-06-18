package br.com.refactoring.exercise4;

public class Address {
    private final String city;
    private final String state;
    private final String district;
    private final String streetName;
    private final String postalCode;
    private final String complement;

    public Address(String city, String state, String district, String streetName, String postalCode, String complement) {
        if (city == null) {
            throw new IllegalArgumentException("City must not be null.");
        }
        if (state == null) {
            throw new IllegalArgumentException("State must not be null.");
        }
        if (district == null) {
            throw new IllegalArgumentException("District must not be null.");
        }
        if (streetName == null) {
            throw new IllegalArgumentException("Street name must not be null.");
        }
        if (postalCode == null) {
            throw new IllegalArgumentException("Postal code must not be null.");
        }
        if (complement == null) {
            throw new IllegalArgumentException("Complement must not be null.");
        }
        this.city = city;
        this.state = state;
        this.district = district;
        this.streetName = streetName;
        this.postalCode = postalCode;
        this.complement = complement;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getDistrict() {
        return district;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getComplement() {
        return complement;
    }
}
