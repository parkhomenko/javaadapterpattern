package javaadapterpattern;

/**
 *
 * Adapter Class
 */
public class HairDryerAdapter extends HairDryer implements ElectronicDevice {

    /**
     * Adapts Specific Request to a standard device Request
     */
    @Override
    public void plugIn() {
        plugInEuro();
    }
}