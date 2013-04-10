package javaadapterpattern;

/**
 *
 * Target Class
 */
public class TVSet implements ElectronicDevice {

    /**
     * Request method implementation for standard device
     */
    @Override
    public void plugIn() {
        System.out.println("TV is working");
    }
}