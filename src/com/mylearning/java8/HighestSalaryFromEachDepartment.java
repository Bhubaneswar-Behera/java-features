package com.mylearning.java8;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HighestSalaryFromEachDepartment {
    public static void main(String[] args) {
        List<Employee> employeeList = Stream.of(
           new Employee(1,"Basant","DEV",50000),
                new Employee(8,"Santosh","DEV",80000),
                new Employee(3,"Pratik","QA",60000),
                new Employee(9,"Deepak","QA",90000),
                new Employee(4,"Bikash","DEVOPS",40000)
        ).collect(Collectors.toList());

        Comparator<Employee> salaryComparator = Comparator
                .comparing(Employee::getSalary);

        Map<String, Optional<Employee>> employeeMap =
                employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDept,
                        Collectors.reducing(BinaryOperator.maxBy(salaryComparator))));
        System.out.println(employeeMap);
    }
}
