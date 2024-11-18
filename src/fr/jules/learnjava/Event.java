package fr.jules.learnjava;

public class Event {

    public static void battle(Character attacker, Character defender) {

        System.out.println(attacker.getName() + " attacks " + defender.getName());
        int newHealth = defender.getHealth() - attacker.attack;
        defender.setHealth(newHealth);
        System.out.println(defender.getName() + " lost " + attacker.attack + " hits points by the attack of " + attacker.getName());
    }

    public static void heal(Character attacker, Character defender) {

        System.out.println(attacker.getName() + " healed " + defender.getName() + " of ");
    }

}
