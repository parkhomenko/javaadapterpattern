package javaadapterpattern;

/**
 *
 * Client Class
 */
public class JavaAdapterPattern {
    
    public static void main(String[] args) {
        
        //Standard devices
        ElectronicDevice tvSet = new TVSet();
        ElectronicDevice radio = new Radio();
        
        //Specific device (adapted)
        ElectronicDevice hairDryer = new HairDryerAdapter();
        
        //All devices are now using the same method
        tvSet.plugIn();
        radio.plugIn();
        hairDryer.plugIn();
    }
}