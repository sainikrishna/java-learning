public class cwh_Practice_Set_6 {
    public static void main(String[] args) {
        // Practice Problem 1
//        float [] arr = {34.4f, 23.3f, 45f, 33.22f, 12.55f};
//        float sum = 0;
//        for (float element: arr){
//            sum += element;
//        }
//        System.out.println(sum);

        // Practice Problem 2
        int [] arr2 = {22, 44, 22, 44, 44};
        int findInt = 44;
        boolean hasInt = false;
        for (int element: arr2) {
            if(element == findInt) {
                hasInt = true;
            }
        }
        System.out.println("Integer has in array: " + hasInt);
    }
}
