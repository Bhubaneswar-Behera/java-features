package com.mylearning.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,7,8,1,5,9);

        int sum1 = numbers.stream().mapToInt( i->i).sum();
        //System.out.println("sum1 : "+sum1);

        Integer reduceSum = numbers.stream()
                .reduce(0, (a, b) -> a + b);
        //System.out.println("reduceSum : "+reduceSum);

        Optional<Integer> reduceSumWithMethodReference = numbers.stream()
                .reduce(Integer::sum);
        //System.out.println("reduceSumWithMethodReference : "+reduceSumWithMethodReference.get());

        Integer reduceMaxWithMethodReference = numbers.stream().reduce(Integer::max).get();
        //System.out.println("reduceMaxWithMethodReference : "+reduceMaxWithMethodReference);

        List<String> wordLists = Arrays.asList("corejava","spring","hibernate");
        String maxWord  = wordLists.stream().reduce((w1,w2) -> w1.length() > w2.length() ? w1:w2).get();
        //System.out.println("maxWord : "+ maxWord);

        List<Employee> employeeList = createEmployees();
        //get employee whose grade "A" get salary
        getAverageSalary(employeeList);
        getSumSalary(employeeList);

    }



    private static void getAverageSalary(List<Employee> employeeList){
        double averageSalary = employeeList.stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(Employee::getSalary)
                .mapToDouble(i->i)
                .average()
                .getAsDouble();
        System.out.println("averageSalary : "+averageSalary);
    }

    private static void getSumSalary(List<Employee> employeeList){

        double sumSalary = employeeList.stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(Employee::getSalary)
                .mapToDouble(i->i)
                .sum();
        System.out.println("sumSalary : "+sumSalary);

    }

    public static List<Employee> createEmployees(){
        return  Stream.of(new Employee(101,"john","A","A",60000),
                        new Employee(109,"peter","B","B",30000),
                        new Employee(102,"mak","A","A",80000),
                        new Employee(103,"kim","A","A",90000),
                        new Employee(104,"json","C","C",15000))
                .collect(Collectors.toList());
    }
}
