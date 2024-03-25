package com.mylearning.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        long start=0;
        long end=0;

        start=System.currentTimeMillis();
        //IntStream.range(1,10).forEach(System.out::println);
        end=System.currentTimeMillis();
        System.out.println("Plain stream took time : "+(end-start));

        System.out.println("============================================");

        start=System.currentTimeMillis();
        //IntStream.range(1,10).parallel().forEach(System.out::println);
        end=System.currentTimeMillis();
        System.out.println("Parallel stream took time : "+(end-start));

        IntStream.range(1,10).forEach(x->{
            //System.out.println("Thread : "+Thread.currentThread().getName()+" : "+x);
        });

        IntStream.range(1,10).parallel().forEach(x->{
            //System.out.println("Thread : "+Thread.currentThread().getName()+" : "+x);
        });

        List<Employee> employees = createEmployees();

        //normal
        start=System.currentTimeMillis();
        double salaryWithStream = employees.stream()
                .map(Employee::getSalary)
                .mapToDouble(i -> i).average().getAsDouble();
        end=System.currentTimeMillis();

        System.out.println("Normal stream execution time : "+(end-start)+" : Avg salary : "+salaryWithStream);

        //parallel
        start=System.currentTimeMillis();
        double salaryWithParallelStream = employees.parallelStream()
                .map(Employee::getSalary)
                .mapToDouble(i -> i).average().getAsDouble();

        end=System.currentTimeMillis();

        System.out.println("Parallel stream execution time : "+(end-start)+" : Avg salary : "+salaryWithParallelStream);
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
