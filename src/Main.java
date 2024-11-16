
public class Main {

    public static void main(String[] args) {

        Characters Fred = new Characters("Fred", 23, 50,3);
        Fred.showStatus();

        Characters Agathe = new Characters("Agath", 23, 50,6);
        Agathe.showStatus();

        Events.battle(Agathe,Fred);
        Fred.showStatus();
    }
}