public class cwh_35_practice_set_on_methods {
    static void printTable(int n){
        for(int i=1; i<=10; i++) {
            System.out.println(i + " * " + n + " = " + i * n);
        }
    }

    static void pattern1(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    static int sum(int n) {
        int result = 0;
        for(int i=1; i<=n; i++){
            result += i;
        }
        return result;
    }

    static int sumRec(int n) {
        if(n == 1) {
            return 1;
        } else {
            return n + sumRec(n - 1);
        }
    }

    static void pattern2(int n) {
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        // Problem 1
        printTable(180);

        // Problem 2
        pattern1(10);

        // Problem 3
        System.out.println("The sum of first 10 number is: " + sum(10));
        System.out.println("The sum of first 10 number is: " + sumRec(10));

        // Problem 4
        pattern2(5);
    }
}
