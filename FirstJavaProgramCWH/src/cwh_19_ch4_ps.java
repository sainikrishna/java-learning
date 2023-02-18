import java.util.Scanner;

public class cwh_19_ch4_ps {
    public static void main(String[] args) {
        // Problem 2
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter sub1 marks: ");
//        float sub1 = sc.nextInt();
//        System.out.print("Enter sub2 marks: ");
//        float sub2 = sc.nextInt();
//        System.out.print("Enter sub3 marks: ");
//        float sub3 = sc.nextInt();
//        float totalMarks = sub1 + sub2 + sub3;
//        System.out.print("Your total marks is: ");
//        System.out.println(totalMarks);
//        float percentage = (totalMarks/300)*100;
//        System.out.print("Your percentage: ");
//        System.out.println(percentage);
//
//        if(percentage >= 40) {
//            if(sub1 < 33 || sub2 < 33 || sub3 < 33) {
//                System.out.println("You are passed with grace!");
//            } else {
//                System.out.println("You are passed!");
//            }
//
//        } else {
//            System.out.println("You are failed!");
//        }


        // Problem 3

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter you income: ");
        float income = sc.nextLong();

        if(income > 1000000) {
            float tax1 = 250000 * 0.05f;
            float tax2 = 500000 * .10f;
            float tax3 = (income-1000000)*0.20f;
            float totalTax = tax1 + tax2 + tax3;
            System.out.println("You need to pay tax: "+totalTax);
        } else if(income > 500000) {
            float tax1 = 250000 * 0.05f;
            float tax2 = (income-500000)*0.10f;
            float totalTax = tax1 + tax2;
            System.out.println("You need to pay tax: "+totalTax);
        } else if(income > 250000) {
            float tax1 = (income-250000)*0.05f;
            float totalTax = tax1;
            System.out.println("You need to pay tax: "+totalTax);
        } else {
            System.out.println("No need to pay tax");
        }
    }
}
