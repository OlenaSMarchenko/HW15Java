public class Employee {

    private int age;
    private String name;
    private String gender;
    private int daySalary;

    public Employee (int age, String name, String gender, int daySalary) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.daySalary = daySalary;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDaySalary() {
        return daySalary;
    }
    public void setDaySalary(int daySalary) {
        this.daySalary = daySalary;
    }

    public int getSalary(Month[] monthArray) {
        int sum = 0;
        for (int i = 0; i < monthArray.length; i++) {
            sum += getDaySalary() * monthArray[i].getWorkDays();
        }
        return  sum;
    }
}
