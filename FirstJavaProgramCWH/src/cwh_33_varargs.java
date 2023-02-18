public class cwh_33_varargs {
    static int sum(int x, int ...arr) {
        // Available as int [] arr
        int result = x;
        for (int a:arr) {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("The sum of 3 and 4 is: " + sum(3, 4));
        System.out.println("The sum of 4, 5, 3 and 4 is: " + sum(4, 5, 3, 4));
    }
}
