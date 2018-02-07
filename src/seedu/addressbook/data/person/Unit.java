package seedu.addressbook.data.person;
// Creates a Unit Class to take in Unit variable from input
public class Unit {

    private static String units;

    public Unit(String newUnit){

        this.units = newUnit;
    }

    public static String getUnit() {
        return units;
    }

    public static void setUnit(String unit) {
        Unit.units = unit;
    }
}
