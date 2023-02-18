public class cwh_31_methods {
    static int logic(int x, int y) {
        int z;
        if(x>y){
            z = x+y;
        } else {
            z = (x+y) * 5;
        }
        return z;
    };

    int logic2(int x, int y) {
        int z;
        if(x>y){
            z = x+y;
        } else {
            z = (x+y) * 5;
        }
        return z;
    };


    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        c = logic(a, b);
        int a1 = 4;
        int b1 = 3;
        int c1;
        // Method Invocation using Object creation
//        cwh_31_methods obj = new cwh_31_methods();
//        c1 = cwh_31_methods.logic2(a1, b1);
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
