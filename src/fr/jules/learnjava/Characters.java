package fr.jules.learnjava;

public class Characters {

    String name;
    int age;
    int health;
    int attack;
    int maxHealth;
    private final Inventory inventory;


    public Characters(String name, int age, int health, int attack) {

        this.name = name;
        this.age = age;
        this.health = health;
        this.attack = attack;
        this.maxHealth = health;
        this.inventory = new InventoryImpl();

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int maxHealth() {
        return maxHealth;
    }

    public void showStatus() {

        System.out.println(" - Name : " + name);
        System.out.println(" - Age : " + age);
        System.out.println(" - Health : " + health + " / " + maxHealth);
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void displayInfo() {
        System.out.println("Character: " + name + " | Health: " + health + "/" + maxHealth);
        inventory.displayInventory();  // Affiche l'inventaire du personnage
    }


//    public void putInventory(int key, String value){
//        if (key >= 10){
//            System.out.println(name + " - This slot is currently unavailable... ");
//        }
//        else {
//            if (inventory.get(key) != null){
//                System.out.println("This slot in your inventory is already taken !");
//            }
//            else{
//                inventory.put(key, value);
//            }
//        }
//    }

//    public void showInventory() {
//        for (Map.Entry<Integer, String> entry : inventory.entrySet()) {
//            System.out.println("ID: " + entry.getKey() + " | fr.jules.learnjava.Item: " + entry.getValue());
//        }
//    }
//
//    public void getSlotInInventory(int slot){
//        System.out.println("- Slot " + slot + " : " + inventory.get(slot));
//
//    }

}
