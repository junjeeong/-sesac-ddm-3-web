package Ch16_Lamda_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}

public class Practice7 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("James", "개발팀", 5500),
                new Employee("Robert", "개발팀", 6000),
                new Employee("Maria", "기획팀", 5800),
                new Employee("Linda", "기획팀", 6200),
                new Employee("David", "인사팀", 5300)
        );


        // ✅ 스트림을 이용한 부서별 평균 급여 계산
        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,               // ① 부서 기준으로 그룹화
                        Collectors.averagingDouble(Employee::getSalary) // ② 급여 평균 계산
                ));

        System.out.println(avgSalaryByDept);
        // {인사팀=5300.0, 개발팀=5750.0, 기획팀=6000.0}
    }
}
