import java.time.LocalDate;

class Date
{
    public int day;
    public int month;
    public int year;
    public Date()
    {
        // this(22,22);
        LocalDate ldt = LocalDate.now();
        this.day=ldt.getDayOfMonth();
        this.month=ldt.getMonthValue();
        this.year=ldt.getYear();

    }
    public Date(int day,int month, int year)
    {
        this.day=day;
        this.month=month;
        this.year=year;

    }

    public void printData() {
        System.out.println(this.day+" "+this.month);
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
