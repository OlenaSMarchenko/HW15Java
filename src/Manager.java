public class Manager extends Employee {
        private int count;

    public Manager(int age, String name, String gender, int daySalary, int count) {
        super(age, name, gender, daySalary);
        this.count = count;
    }

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int getSalary(Month[] monthArray) {
        int sum = super.getSalary(monthArray);
        return sum + (int)(sum * count/100.0);
    }
}
