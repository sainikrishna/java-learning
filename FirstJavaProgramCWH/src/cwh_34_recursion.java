public class cwh_34_recursion {
    // factorial(0) = 1;
    // factorial(n) = n * n-1 * ....1;
    // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120;
    // factorial(n) = n * factorial(n-1)
    static long factorial(int n) {
        if(n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println("The value of factorial n is: " + factorial(n));
    }
}
