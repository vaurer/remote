package va.CC;

public class Main {

    public static void main(String[] args) {

        Battery battery1 = new Battery(90);
        Keyboard keyboard1 = new Keyboard();

        System.out.println("Battery status: " + battery1.getChargingStatus());
        System.out.println(keyboard1.powerButtonIsOn);
        keyboard1.setPowerButtonIsOn(false);
        if (keyboard1.powerButtonIsOn==true){
            System.out.println("TV os ON");
        } else System.out.println("TV is OFF");

    }
}
