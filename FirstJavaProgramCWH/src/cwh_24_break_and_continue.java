public class cwh_24_break_and_continue {
    public static void main(String[] args) {
        for (int i=0; i<5; i++) {
            if(i == 1) {
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
            if(i == 2) {
                System.out.println("Ending the loop");
                break;
            }
        }
    }
}
