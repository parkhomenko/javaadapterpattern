package javaadapterpattern;

/**
 *
 * Target Class
 */
public class Radio implements ElectronicDevice {

    /**
     * Request method implementation for standard device
     */
    @Override
    public void plugIn() {
        System.out.println("Radio is working");
    }
}