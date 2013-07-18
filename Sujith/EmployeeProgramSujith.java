/**
 * Created with IntelliJ IDEA.
 * User: Dinesh
 * Date: 7/18/13
 * Time: 5:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class EmployeeProgramSujith {

    public static void main(String[] args)

    {

        Employee obj1[] = new Employee[3];
        System.out.println("Enter age and name of the Employees");
        obj1[0]=new Employee(27,"Harish");
        obj1[1]=new Employee(21,"Shashir");
        obj1[2]=new Employee(33,"Naren");

        Employee emp = getLowest(obj1);
        emp.display();

    }

    static Employee getLowest(Employee[] employees)
    {
        int i=0;
        int lessAge =employees [0].age;
        for(int count = 1;count<employees.length;count++)
        {
            if(employees[count].age < lessAge)
            {
                lessAge =employees[count].age ;
                i=count;
            }

        }
        return employees[i];
    }
}
