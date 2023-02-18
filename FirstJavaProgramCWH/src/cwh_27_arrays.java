public class cwh_27_arrays {
    public static void main(String[] args) {
//        int [] marks = {90, 23, 42, 100, 42};
        float [] marks = {90, 23, 42, 100, 42};

        // Length
//        int length = marks.length;
//        System.out.println(length);
//        System.out.println(marks[0]);

        // Displaying Array
//        for(int i=0; i<marks.length;i++) {
//            System.out.println(marks[i]);
//        }

        // Displaying Array Reverse Order
        for(int i= (marks.length-1); i>=0;i--) {
            System.out.println(marks[i]);
        }

        // Displaying Array using for each loop
        System.out.println("Displaying array using for each loop");
        for (float element: marks){
            System.out.println(element);
        }
    }
}
