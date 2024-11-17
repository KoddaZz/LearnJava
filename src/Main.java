
public class Main {

    public static void main(String[] args) {

        Characters Fred = new Characters("Fred", 23, 50,3);
        Fred.showStatus();

        Characters Agathe = new Characters("Agath", 23, 50,10);
        Agathe.showStatus();

        Events.battle(Agathe,Fred);
        Fred.showStatus();

        Tools.Bandages bandageFivePV = new Tools.Bandages(5);
        Tools.applyBandages(Fred,bandageFivePV,2);

        Fred.showStatus();

        Fred.putInventory(1,"Pomme");
        Fred.getSlotInInventory(1);
        Fred.showInventory();
    }
}