/*
* The program displays information based on multiple classes.
*
* @author  Rodas Nega
* @version 1.0
* @since   2022-11-03
*
* This is a Vehicle program
*/

/**
 * This is the main class.
 */
final class Main {

    /**
    * This is a constant for the value of 10.
    */
    public static final int TEN = 10;

    /**
    * This is a constant for the value of 15.
    */
    public static final int FIFTEEN = 15;

    /**
     * This is newSpeed.
     */
    public static final String NEWSPEED = "New speed: ";

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");

    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        // Create Motorcycle
        // System.out.println("Created Motorcycle.");
        // final Vehicle motorcycle = new Vehicle(160, "Black");
        // System.out.println("\nMax Speed: "
        // + motorcycle.getMaxSpeed() + "\n");

        // final Bicycle bmx = new Bicycle("Red", 40);
        // System.out.println("Created Bmx bike.\nStatus:\n");
        // bmx.status();

        System.out.println("\nSet the cadence to 10");
        bmx.accelerate(TEN);
        bmx.status();

        System.out.println("\nAccelerate By 15:");
        bmx.accelerate(FIFTEEN);
        bmx.status();

        System.out.println("\nRing Bell.");
        bmx.ringBell();

        final Truck bigTruck = new Truck("Grey", "HGC-3456F", 200);
        System.out.println("\nCreated a Truck. \nStatus:\n");
        bigTruck.status();

        System.out.println("\nAccelerating, 10 of power for ten seconds:");
        bigTruck.accelerate(TEN, TEN);
        System.out.println(NEWSPEED + bigTruck.getSpeed());

        System.out.println("\nBreaking, 10 of power for 10 sec.");
        bigTruck.accelerate(TEN, TEN);
        System.out.println(NEWSPEED + bigTruck.getSpeed());

        System.out.println("\nApplied air pressure of 10:");
        bigTruck.provideAir(TEN);
        System.out.println(NEWSPEED + bigTruck.getSpeed());

        System.out.println("\nDone.");
    }
}
