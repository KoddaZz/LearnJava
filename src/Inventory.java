public interface Inventory {
    void addItem(Integer id, Item item);
    void DelItem(Integer id);
    void displayInventory();
    Item getItem(Integer id);
}