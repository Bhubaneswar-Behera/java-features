package com.mylearning.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodReferenceDemo {
    public static void main(String[] args) {
        MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();

        //anonymous implementation
        methodReferenceDemo.createEmployees()
                .forEach(new Consumer<Employee>() {
                    @Override
                    public void accept(Employee employee) {
                        //System.out.println(employee);
                    }
                });

        //using lambda expression
        //methodReferenceDemo.createEmployees().forEach(employee -> System.out.println(employee));

        //using method reference with custom type
        //methodReferenceDemo.createEmployees().forEach(MethodReferenceDemo::print);

        //using method reference with predefined class
        //methodReferenceDemo.createEmployees().forEach(System.out::println);

        //calling static method
        List<EmployeeDto> employeeDtoList = methodReferenceDemo.createEmployees()
                .stream()
                .map(EmployeeMapper :: convert)
                .collect(Collectors.toList());

        //System.out.println(employeeDtoList);

        EmployeeMapper employeeMapper = new EmployeeMapper();
        List<EmployeeDto> employeeDtoListNonStatic = methodReferenceDemo.createEmployees()
                .stream()
                .map(employeeMapper :: convertNonstatic)
                .collect(Collectors.toList());

        //System.out.println("employeeDtoListNonStatic :\n"+employeeDtoListNonStatic);

       List<String>  nameList  = methodReferenceDemo.createEmployees()
                .stream()
                .map(Employee::getName)
               .collect(Collectors.toList());
        //System.out.println("nameList : "+nameList);

        //reference :: constructor

        methodReferenceDemo.createEmployees()
                .stream()
                .map(Employee::getId)
                .map(ArrayList::new)
                .forEach(System.out::println);
    }

    private static void print(Employee employee){
        System.out.println(employee);
    }
    public List<Employee> createEmployees(){
        return  Stream.of(new Employee(101,"john","A","A",60000),
                        new Employee(109,"peter","B","B",30000),
                        new Employee(102,"mak","A","A",80000),
                        new Employee(103,"kim","A","A",90000),
                        new Employee(104,"json","C","C",15000))
                .collect(Collectors.toList());
    }
}
