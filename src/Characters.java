import java.util.HashMap;
import java.util.Map;

public class Characters {

    String name;
    int age;
    int health;
    int attack;
    int maxhealth;

    Map<Integer, String> inventory = new HashMap<>();


    public Characters(String name, int age, int health, int attack) {

        this.name = name;
        this.age = age;
        this.health = health;
        this.attack = attack;
        this.maxhealth = health;

        for(int i = 1; i < 10; i++){
            inventory.put(i, null);

        }
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
        return maxhealth;
    }

    public void showStatus(){

        System.out.println( name + " - Health : " + health);
    }

    public void putInventory(int key, String value){
        if (key >= 10){
            System.out.println(name + " - This slot is currently unavailable... ");
        }
        else {
            if (inventory.get(key) != null){
                System.out.println("This slot in your inventory is already taken !");
            }
            else{
                inventory.put(key, value);
            }
        }
    }

    public void showInventory() {
        for (Map.Entry<Integer, String> entry : inventory.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " | Item: " + entry.getValue());
        }
    }

    public void getSlotInInventory(int slot){
        System.out.println("- Slot " + slot + " : " + inventory.get(slot));

    }

}
