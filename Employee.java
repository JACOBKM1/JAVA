import java.util.Scanner;

class Employee {
    int Empid;
    String Name;
    double Salary;
    String Address;

    Employee(int no, String na, double sal, String add) {
        this.Empid = no;
        this.Name = na;
        this.Salary = sal;
        this.Address = add;
    }
}

class Teacher extends Employee {
    String dept;
    String subject;

    Teacher(int no, String na, double sal, String add, String dep, String sub) {
        super(no, na, sal, add);
        this.dept = dep;
        this.subject = sub;
    }

    void display() {
        System.out.println("Employee id: " + Empid);
        System.out.println("Name: " + Name);
        System.out.println("Salary: " + Salary);
        System.out.println("Address: " + Address);
        System.out.println("Department: " + dept);
        System.out.println("Subject: " + subject);
    }

    public static void main(String[] args) {
        System.out.println("\nEnter the No. of Employees:");
        Scanner sc1 = new Scanner(System.in);
        int num = sc1.nextInt();
        Teacher arr[] = new Teacher[num];

        try {
            for (int i = 0; i < num; i++) {
                System.out.println("\nEnter Employee id:");
                int Empid = sc1.nextInt();

                System.out.println("Enter Employee Name:");
                String Name = sc1.next();

                System.out.println("Enter Salary:");
                double Salary = sc1.nextDouble();

                System.out.println("Enter Address:");
                String Address = sc1.next();

                System.out.println("Enter department:");
                String dept = sc1.next();

                System.out.println("Enter Subject:");
                String subject = sc1.next();

                arr[i] = new Teacher(Empid, Name, Salary, Address, dept, subject);
            }

            System.out.println("\n********Informations of all the employees************");
            for (int i = 0; i < num; i++) {
                int j = i + 1;
                System.out.println("\n" + j);
                arr[i].display();
            }
        } finally {
            sc1.close(); // Closing the Scanner object
        }
    }
}

