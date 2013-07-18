class Employee
{
    int age;
    String name;
    Employee(int age,String name)
    {
        this.age = age;
        this.name = name;
    }
    void display()
    {
        System.out.println("Name of an employee: "+name+" and his age is: "+age);
    }
}