import java.util.HashMap;
import java.util.Map;

public class Characters {

    String name;
    int age;
    int health;
    int attack;

    Map<Integer, String> inventory = new HashMap<>();

    public Characters(String name, int age, int health, int attack) {

        this.name = name;
        this.age = age;
        this.health = health;
        this.attack = attack;
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

    public void showStatus(){

        System.out.println( name + " - Health : " + health);
    }

    public void putInventory(int key, String value){
        inventory.put(key, value);
    }

    public String getInventory(int key){
        return inventory.get(key);
    }

}
