interface MyCamera2 {
    void takeSnap();
    void recordVideo();

    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording video in 4K");
    }
}

interface MyWifi2 {
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone2 {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    };

    void pickCall(){
        System.out.println("Connecting...");
    }
}

class MySmartphone2 extends MyCellPhone2 implements MyWifi2, MyCamera2 {
    public void takeSnap(){
        System.out.println("Taking snap");
    }
    public void recordVideo(){
        System.out.println("Recording Video");
    }

//    public void record4KVideo(){
//        System.out.println("Recording video in 4K in My Smartphone");
//    }

    public String[] getNetworks(){
        String[] networks = {"Airtel", "Jio", "Vi"};
        return networks;
    };
    public void connectToNetwork(String network){
        System.out.println("Connecting to " + network);
    };
}

public class cwh_59_polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam2 = new MySmartphone2(); // This is a smartphone but use it as a camera
        // cam2.getNetworks(); --> Not allowed
        cam2.takeSnap();
    }
}
