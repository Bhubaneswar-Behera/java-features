package com.mylearning.java8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Java8CommonProgrammingQA {

    private static void studentRankInBetween( List<Student> studentList){
            List<Student> outputList = studentList.stream()
                    .filter(student -> student.getRank() > 50 && student.getRank()<100)
                    .collect(Collectors.toList());
        //System.out.println("Rank is in between 50 and 100 : \n"+outputList);
    }

    private static void getStudentFromKarnatakaAndSortByNamesNatural( List<Student> studentList){
        List<Student> outputList = studentList.stream().filter(student -> student.getCity().equalsIgnoreCase("Karnataka"))
                .sorted(Comparator.comparing(Student::getFirstName)) //natural ordering
                .collect(Collectors.toList());
        //System.out.println("In Karnataka and sort them by their names : \n"+outputList);
    }

    private static void getStudentFromKarnatakaAndSortByNamesReversed( List<Student> studentList){
        List<Student> outputList = studentList.stream().filter(student -> student.getCity().equalsIgnoreCase("Karnataka"))
                .sorted(Comparator.comparing(Student::getFirstName, Comparator.reverseOrder()))
                .collect(Collectors.toList());

        //System.out.println("In Karnataka and sort them by their names reverse order : \n"+outputList);
    }

    private static void findAllDepartmentNames(List<Student> studentList){
        List<String> outputList = studentList.stream().map(Student::getDept).distinct().collect(Collectors.toList());
        //System.out.println("Department names : \n"+outputList);
    }

    private static void findAllDepartmentNamesUsingSet(List<Student> studentList){
        Set<String> outputSet = studentList.stream().map(Student::getDept).collect(Collectors.toSet());
        //System.out.println("Department names using set: \n"+outputSet);
    }

     //map --> One2One
     //flatmap --> One2Many
    private static void findAllContactNumbers(List<Student> studentList){
        List<String> outputList = studentList.stream()
                                    .flatMap(student -> student.getContacts().stream())
                                    .collect(Collectors.toList());
        //System.out.println("All the contact numbers : \n"+outputList);
        }

    private static void getStudentsByGroupName(List<Student> studentList){
        Map<String, List<Student>> outputMap = studentList.stream()
                                                .collect(Collectors.groupingBy(Student::getDept));
        //System.out.println("Student By Department Names : \n"+outputMap);
    }
    private static void getStudentsCountByGroupName(List<Student> studentList){
        Map<String, Long> outputMap = studentList.stream()
                                    .collect(Collectors.groupingBy(Student::getDept, Collectors.counting()));
        //System.out.println("Student By Department Names count: \n"+outputMap);
    }

    private static void getDepartmentHavingMaxStudents(List<Student> studentList){
        Map.Entry<String, Long> maxStudentByMap = studentList.stream()
                                                .collect(Collectors.groupingBy(Student::getDept, Collectors.counting()))
                                                .entrySet().stream()
                                                .max(Map.Entry.comparingByValue())
                                                .get();

        //System.out.println("Department having maximum number of students : \n"+maxStudentByMap);
    }

    private static void averageMaleAndFemaleStudents(List<Student> studentList){
        Map<String, Double> averageStudents = studentList.stream()
                                            .collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)));
        //System.out.println("Average age of male and female students :\n"+averageStudents);
    }

    private static void getHighestRankInEachDepartment(List<Student> studentList){
        Map<String, Optional<Student>> highestRankMap = studentList.stream()
                                                    .collect(Collectors.groupingBy(Student::getDept, Collectors.minBy(Comparator.comparing(Student::getRank))));
        //System.out.println("Highest rank in each department : \n" + highestRankMap);
    }
    private static void getStudentHavingSecondRank(List<Student> studentList){
        Student secondRankStudent = studentList.stream().sorted(Comparator.comparing(Student::getRank,Comparator.reverseOrder()))
                .skip(1)
                .findFirst()
                .get();
        System.out.println("Student who has second rank : \n"+secondRankStudent);
    }
    public static void main(String[] args) {
        List<Student> studentList = createStudentList();
        // 1. Find the list of students whose rank is in between 50 and 100
        studentRankInBetween(studentList);


        //2. Find the Students who stays in Karnataka and sort them by their names
        getStudentFromKarnatakaAndSortByNamesNatural(studentList);
        getStudentFromKarnatakaAndSortByNamesReversed(studentList);


        // 3. Find all departments names
        findAllDepartmentNames(studentList);
        findAllDepartmentNamesUsingSet(studentList);

        //4.  Find all the contact numbers
        findAllContactNumbers(studentList);

        //5. Group The Student By Department Names
        getStudentsByGroupName(studentList);
        getStudentsCountByGroupName(studentList);

        //7. Find the department who is having maximum number of students
        getDepartmentHavingMaxStudents(studentList);


        //8. Find the average age of male and female students
        averageMaleAndFemaleStudents(studentList);


        //9. Find the highest rank in each department
        getHighestRankInEachDepartment(studentList);

        //10 .Find the student who has second rank
        getStudentHavingSecondRank(studentList);

    }

    private static List<Student> createStudentList(){
        return Stream.of(
                        new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                        new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
                        new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
                        new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
                        new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")),
                        new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90, Arrays.asList("+9126254632782", "+16736784729929")),
                        new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324, Arrays.asList("+912632632782", "+1671234729929")),
                        new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433, Arrays.asList("+9126326355782", "+1673434729929")),
                        new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7, Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
                        new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("+912632646482", "+16734323229929")))
                .collect(Collectors.toList());
    }
}
