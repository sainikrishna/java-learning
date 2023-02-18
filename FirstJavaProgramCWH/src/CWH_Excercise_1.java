import java.util.Scanner;

public class CWH_Excercise_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you English marks: ");
        float e = sc.nextFloat();
        System.out.println("Enter you Hindi marks: ");
        float h = sc.nextFloat();
        System.out.println("Enter you Math marks: ");
        float m = sc.nextFloat();
        System.out.println("Enter you Chemistry marks: ");
        float c = sc.nextFloat();
        System.out.println("Enter you Physics marks: ");
        float p = sc.nextFloat();
        float totalMarks = e + h + m + c + p;
        float percentage = (totalMarks/500) * 100;
        System.out.println("Your total marks is: ");
        System.out.println(totalMarks);
        System.out.println("Your Percentage is: ");
        System.out.println(percentage);
    }
}
