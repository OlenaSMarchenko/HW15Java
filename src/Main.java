public class Main {
    public static void main (String[] args) {

        Employee employee = new Manager(25, "Serg", "M", 1000, 2);
        System.out.println(employee.getSalary(MonthUtils.MONTHS));
    }
}
