package seedu.addressbook.data.person;
// Creates a Street Class to take in Street variable from input
public class Street {

    private static String street;

    public Street(String newStreet){

        this.street = newStreet;
    }

    public static String getStreet() {
        return street;
    }

    public static void setStreet(String street) {
        Street.street = street;
    }
}