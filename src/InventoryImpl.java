import java.util.HashMap;
import java.util.Map;

public class InventoryImpl implements Inventory {
    private final Map<Integer, Item> inventory = new HashMap<>();

    @Override
    public void addItem(Integer slot, Item item) {
        inventory.put(slot, item);
        System.out.println("Item added : " + item.toString());
    }

    @Override
    public void DelItem(Integer slot) {
        Item item = inventory.remove(slot);
        if (item != null) {
            System.out.println("Item deleted : " + item.toString());
        } else {
            System.out.println("No items found in this slot :  " + slot);
        }
    }

    @Override
    public void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Your inventory is empty");
        } else {
            System.out.println(" Your inventory is: : ");
            for (Map.Entry<Integer, Item> entry : inventory.entrySet()) {
                System.out.println("Slot : " + entry.getKey() + ", " + entry.getValue().toString());
            }
        }
    }

    @Override
    public Item getItem(Integer slot) {
        return inventory.get(slot);
    }
}