public class cwh_32_method_overloading {
    static void foo(){
        System.out.println("Good Morning Bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning " + a + " Bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good Morning " + a + " Bro!");
        System.out.println("Good Morning " + b + " Bro!");
    }
    static void change(int x){
        x = 98;
    }

    static void change2(int [] arr){
        arr[0] = 98;
    }

    static void tellJoke(){
        System.out.println("I invented a word! \n Plagiarism!");
    }
    public static void main(String[] args) {
//        tellJoke();

        // Case 1: Changing the integer
//        int x = 45;
//        change(x);
//        System.out.println("The value of x after running change method - "+x);

        // Case 2: Changing the array
//        int [] marks = {45, 34, 23, 45, 43};
//        change2(marks);
//        System.out.println("The value of marks after running change - " + marks[0]);


        // Method Overloading
        foo();
        foo(300);
        foo(300, 400);
        // Arguments are actual!

    }
}
