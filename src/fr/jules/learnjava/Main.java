package fr.jules.learnjava;

public class Main {

    public static void main(String[] args) {

        Character Fred = new Character("Fred", 23, 50, 3);
        Fred.showStatus();

        Character Agathe = new Character("Agath", 23, 50, 10);
        Agathe.showStatus();

        Event.battle(Agathe, Fred);
        Fred.showStatus();

        Tool.Bandages bandageFivePV = new Tool.Bandages(5);
        Tool.applyBandages(Fred, bandageFivePV, 2);

        Fred.showStatus();

        Tool.Swords ironSword = new Tool.Swords("Iron Sword", 3, 40);
        Fred.displayInfo();
        Fred.getInventory().addItem(1, ironSword);
        Fred.displayInfo();
    }
}