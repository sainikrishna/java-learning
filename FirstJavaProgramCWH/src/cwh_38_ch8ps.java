
class Employee2 {
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String st){
        name = st;
    }

}

class Cellphone {
    public void printRinging(){
        System.out.println("Ringing");
    }
    public void printVibrating(){
        System.out.println("Vibrating");
    }
}

class Square {
    int side;

    public int area(){
        return side * side;
    }

    public int perimeter(){
        return 4 * side;
    }

}
public class cwh_38_ch8ps {
    public static void main(String[] args) {

        // Problem 1
//        Employee2 employee = new Employee2();
//        employee.setName("Krishan");
//        employee.salary = 1999999;
//        int salary = employee.getSalary();
//        String name = employee.getName();
//        System.out.println("Employee name is: " + name + " and salary is: " + salary);

        // Problem 2
//        Cellphone cell = new Cellphone();
//        cell.printRinging();
//        cell.printVibrating();

        // Problem 3
        Square sq = new Square();
        sq.side = 40;
        System.out.println("Square are is: " + sq.area() + " and perimeter is: " + sq.perimeter());
    }
}
