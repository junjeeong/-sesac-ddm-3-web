package ch6.p6;

public class p6 {
    public static void main(String[] args) {
        Employee junyeong = new Employee("정준영", 1, 4000);

        Employee.getCompanyName();
        Employee.getTotalEmployees();
        junyeong.getEmployeeInfo();
    }
}
