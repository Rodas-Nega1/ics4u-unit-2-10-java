/*
* This program has information about the bike class.
*
* @author  Rodas Nega
* @version 1.0
* @since   2022-11-03
*/

/**
 * This is the Bicycle class.
 */

public class Bicycle extends Vehicle {
    /**
     * This is the cadence.
     */
    private int cadence;

    /**
     * This is the constructor for Bicycle.
     *
     * @param color this is the color.
     * @param maxSpeed this is the maxSpeed.
     *
     */
    public Bicycle(String color, int maxSpeed) {
        super(color, maxSpeed);
    }

    /**
     * This sets the appliedPower.
     *
     * @param appliedPower this is the new variable.
     */
    public void accelerate(int appliedPower) {
        this.cadence = this.cadence + appliedPower;
        super.setSpeed(this.cadence * 2);
    }

    /**
     * This is the cadence.
     *
     * @return this returns the cadence.
     */
    public int getCadence() {
        return this.cadence;
    }

    /**
     * This is the ringbell.
     */
    public void ringBell() {
        System.out.println("Ding ding!");
    }

    /**
     * This is the status function.
     */
    public void status() {
        super.status();
        System.out.println(" ---> Cadence: " + this.getCadence());
    }
}
