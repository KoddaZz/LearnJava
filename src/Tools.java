public class Tools {

    public static class Bandages{

        int numberPV;

        public Bandages(int numberPV){
            this.numberPV = numberPV;
        }

        public int getNumberPV(){
            return numberPV;
        }


    }

    public static void applyBandages(Characters receiver, Bandages bandage, int amountTimes){
        for(int i = 0; i < amountTimes; i++) {
            if (receiver.maxHealth() == receiver.getHealth()) {
                System.out.println("You can't use a bandage. Your health is full !");
            } else {
                int newHealth = receiver.getHealth() + (bandage.getNumberPV() * amountTimes);
                receiver.setHealth(newHealth);
                System.out.println(receiver.getName() + " applied" + amountTimes + " bandage(s) and regained : " + newHealth + " PV !");
            }
        }
    }

    public static class Swords implements Item {
        String name;
        int attack_point;
        int durability;

        public Swords(String name, int attack_point, int durability){
            this.name = name;
            this.attack_point = attack_point;
            this.durability = durability;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public String getDescription() {
            return "Attack points : " + attack_point + " durability : " + durability;
        }

        @Override
        public String toString() {
            return "Sword: " + name + " (Attack: " + attack_point + ", Durability: " + durability + ")";
        }
    }

    public static void hitSword(Swords sword, Characters attacker,Characters defenser){


        int newHealth = defenser.getHealth() - sword.attack_point;
        defenser.setHealth(newHealth);
        System.out.println(defenser.getName() + " was attacked by " + attacker.getName() +  " with " + sword.name + " and lost " + sword.attack_point + " HP !");

    }
}
