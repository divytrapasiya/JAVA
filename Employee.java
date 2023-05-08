class Employee 
{
    int emp_id;
    char emp_name;
    char emp_designation;
    int salary;

    void disPlay() 
    {
        System.out.println("Employee is id=111" + emp_id);
        System.out.println("Employee name is divyesh" + emp_name);
        System.out.println("Employee designationis manager" + emp_designation);
        System.out.println("Employee salary is 50,000" + salary);

    }

    public static void main(String[] args) 
    {
        Employee a = new Employee();
        a.disPlay();
    }
}