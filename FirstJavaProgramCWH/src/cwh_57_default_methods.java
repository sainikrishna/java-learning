
interface MyCamera {
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

interface MyWifi {
    String[] getNetworks();
    void connectToNetwork(String network);
}

class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    };

    void pickCall(){
        System.out.println("Connecting...");
    }
}

class MySmartphone extends MyCellPhone implements MyWifi, MyCamera {
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

public class cwh_57_default_methods {
    public static void main(String[] args) {
        MySmartphone mySmartphone = new MySmartphone();
        String[] networks = mySmartphone.getNetworks();
        mySmartphone.record4KVideo();
//        mySmartphone.greet(); -> Throws an error!
        for(String network: networks) {
            System.out.println(network);
        }
    }
}
