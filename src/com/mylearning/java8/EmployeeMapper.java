package com.mylearning.java8;

public class EmployeeMapper {
    public static EmployeeDto convert(Employee employee){
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setName(employee.getName());
        employeeDto.setDept(employee.getDept());
        employeeDto.setGrade(employee.getGrade());
        employeeDto.setSalary(employee.getSalary());
        return employeeDto;
    }

    public  EmployeeDto convertNonstatic(Employee employee){
        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setId(employee.getId());
        employeeDto.setName(employee.getName());
        employeeDto.setDept(employee.getDept());
        employeeDto.setGrade(employee.getGrade());
        employeeDto.setSalary(employee.getSalary());
        return employeeDto;
    }
}
