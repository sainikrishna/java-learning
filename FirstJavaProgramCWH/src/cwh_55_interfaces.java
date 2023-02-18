interface Bicycle {
    int a = 45;
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface HornCycle {
    void blowHornK3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornCycle {
    void blowHorn(){
        System.out.println("Pee pee, Po po");
    }

    public void applyBreak(int decrement) {
        System.out.println("Applying break");
    };
    public void speedUp(int increment){
        System.out.println("Applying Speed Up");
    };

    public void blowHornK3g(){
        System.out.println("Kabhi khushi kabhi gum, pee pee po po");
    };
    public void blowHornmhn(){
        System.out.println("Main hu na, pee pee po po");
    };
}
public class cwh_55_interfaces {
    public static void main(String[] args) {
        AvonCycle avonCycle = new AvonCycle();
        avonCycle.applyBreak(4);
        avonCycle.blowHornK3g();
        avonCycle.blowHornmhn();

        // You can create properties in Interfaces
        System.out.println(avonCycle.a);

        // You cannot modify the properties in Interfaces as they are final
//        avonCycle.a = 30;
    }
}
