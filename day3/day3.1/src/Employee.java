class Employee{
    public int empid;
    public String name;
    public float salary;
    public Date joinDate;

    public Employee()
    {
        this.empid=0;
        this.name="";
        this.salary=0;
        this.joinDate=new Date();
    }

    public Employee(int empid,String name, float salary,int day,int month,int year)
    {
        this.empid=empid;
        this.name=name;
        this.salary=salary;
        this.joinDate=new Date(day,month,year);
    }


    public int getEmpid() {
        return this.empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return this.salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public Date getJoinDate() {
        return this.joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }



}