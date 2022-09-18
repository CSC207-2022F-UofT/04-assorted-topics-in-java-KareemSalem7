/* TODO: Create a subclass of Trader named DrivableTrader
 * This class should be identical to Trader, except that it takes
 * only Drivable objects in its inventory, wishlist, etc.
 *
 * The sellingPrice returned should also be overridden. The selling price
 * should be equal to the:
 *     Object's price + Object's max speed
 * If the object is Tradable (and Tradable.MISSING_PRICE otherwise.)
 *
 * Look at DomesticatableTrader.java for an example.
 */

import java.util.ArrayList;
import java.util.List;

class DrivableTrader extends Trader{
    public DrivableTrader(List<Drivable> inventory, List<Drivable> wishlist, int money) {
        super(inventory, wishlist, money);
    }

    /* TODO: Add a new constructor that takes a single argument
     *       representing the Trader's money. Give the Trader
     *       empty ArrayLists for their inventory and wishlist.
     */
    public DrivableTrader(int money){
        super(money);
        ArrayList<Drivable> inventory = new ArrayList<Drivable>();
        ArrayList<Drivable> wishlist = new ArrayList<Drivable>();
    }

    public int getSellingPrice(Drivable item){
        if (item instanceof Tradable) {
            return ((Tradable) item).getPrice() + item.getMaxSpeed();
            // Object's price + Object's max speed
        }
        return Tradable.MISSING_PRICE;
    }

}
