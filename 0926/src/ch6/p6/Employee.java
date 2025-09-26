package ch6.p6;

public class Employee {
    String name;
    int empId;
    int salary;
    static int totalEmployee = 50;
    static String companyName = "삼성전자";

    public Employee(String name, int empId, int salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
        totalEmployee++; // 생성자 호출될때마다 직원 수 증가
    }

    static void getCompanyName(){
        System.out.println("회사명: " + companyName);
    }

    static void getTotalEmployees(){
        System.out.println("총 직원 수: " + totalEmployee);
    };

    void getEmployeeInfo(){
        System.out.println(this.name + " (ID: " + this.empId + ", 연봉: " + this.salary + "만원)");
    }

}
