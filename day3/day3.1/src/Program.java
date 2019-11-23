class Pragram
{

    public static void main(String[] args) {

       Employee emp1 = new Employee(1,"Akash",100000,22,11,2019);
       System.out.println("Empid            : "+emp1.empid);
       System.out.println("EmpName          : "+emp1.name);
       System.out.println("EmpSalary        : "+emp1.salary);
       System.out.println("EmpJoinDate      : "+emp1.joinDate.day+" / "+emp1.joinDate.month+" / "+emp1.joinDate.year);
        
    }
}