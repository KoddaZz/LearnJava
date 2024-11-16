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
}
