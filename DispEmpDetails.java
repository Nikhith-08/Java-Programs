import java.util.Scanner;
class Employee{
    int id;
    String name;
    String designation;
    float salary;
}

class DispEmpDetails {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter how many employees: ");
        int n = s.nextInt();
        Employee emp[] = new Employee[n];
        for(int i=0; i<n; i++){
            emp[i] = new Employee();
            System.out.println("Enter employee "+(i+1)+" details:");
            System.out.print("Enter employee id: ");
            emp[i].id = s.nextInt();
            System.out.print("Enter employee name: ");
            emp[i].name = s.next();
            System.out.print("Enter employee designation: ");
            emp[i].designation = s.next();
            System.out.print("Enter employee salary: ");
            emp[i].salary = s.nextFloat();
            System.out.println();
        }
        for(int i=0; i<n; i++){
            System.out.println("Employee "+(i+1)+" details");
            System.out.println("Employee id: "+emp[i].id);
            System.out.println("Employee name: "+emp[i].name);
            System.out.println("Employee designation: "+emp[i].designation);
            System.out.println("Employee salary: "+emp[i].salary);
            System.out.println();
        }
    }
}
