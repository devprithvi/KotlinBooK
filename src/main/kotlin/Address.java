import java.util.Objects;

public class Address {

    private String street = "";
    private String city = "";
    private int zip;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return zip == address.zip && street.equals(address.street) && city.equals(address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, city, zip);
    }
}
