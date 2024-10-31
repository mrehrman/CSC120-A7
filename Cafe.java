/* The Cafe class extends the Building class. A Cafe can store an inventory, sell coffee, and restock its inventory. */
public class Cafe extends Building{

    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups; 
   
    /**
     * Creates an instance of the class Cafe.
     * @param name The name of the Cafe.
     * @param address The address of the Cafe.
     * @param nFloors The number of floors the Cafe has.
     * @param nCoffeeOunces The number of ounces of coffee in the Cafe's inventory.
     * @param nSugarPackets The number of sugar packets in the Cafe's inventory.
     * @param nCreams The number of creams in the Cafe's inventory.
     * @param nCups The number of cups in the Cafe's inventory.
     */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }
    
    /**
     * Allows the Cafe to sell coffee. If the Cafe does not have enough of an item in its inventory to sell, it restocks.
     * @param