
class Employee {
    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }

    public int getSalary(){
        return salary;
    }
}

public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee krishan = new Employee(); // Instantiating an new Employee Object

        // Setting Attributes
        krishan.id = 12;
        krishan.name = "Krishan Saini";
        krishan.salary = 90;

        // Printing the Attributes
        System.out.println(krishan.id);
        System.out.println(krishan.name);
        int salary = krishan.getSalary();
        System.out.println(krishan.salary);
        krishan.printDetails();
//        System.out.println(krishan.printDetails());
    }
}
