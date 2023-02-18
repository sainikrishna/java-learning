public class cwh_25_practice_set_4 {
    public static void main(String[] args) {
        // Problem 1
//        for(int s=4; s> 0; s--){
//            for (int i=s; i>0; i--){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

        // Problem 2
        long n = 1000L;
        long count = 0L;
        long evenCount = 0L;
        long sum = 0L;
        while (evenCount <= n) {
//            System.out.println(count);
            if(count%2 == 0){
//                System.out.println(count);
                sum += count;
                evenCount++;
            }
            count++;
        }
        System.out.println(sum);
    }
}
