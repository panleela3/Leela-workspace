package com.java.lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class Student {
    private final String firstName;
    private final String lastName;
    public  final String studentNumber;

    public Student(String firstName , String lastName , String studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
    }

    public String getFullname(){
        return firstName + " " + lastName;
    }

    /*public boolean validateStudent(String firstName, String lastName, String studentNumber){

        return this.firstName.equals(firstName) && this.lastName.equals(lastName) && this.studentNumber.equals(studentNumber);

    }
    public boolean validateStudent(Student studentToValidate){

        return this.firstName.equals(studentToValidate.firstName) && this.lastName.equals(studentToValidate.lastName) && this.studentNumber.equals(studentToValidate.studentNumber);

    }
    public boolean isValidStudent(String name, String number){
        Map<String, String> studentMap= new HashMap<>();
        studentMap.put("Leela", "501");
        studentMap.put("bala","502");
        studentMap.put("Jai","503");
        studentMap.put("Sai","504");

        //return studentMap.containsKey(name) && studentMap.get(name).equals(number);
        BiPredicate<String, String> isValid =(k, v) -> studentMap.containsKey(name) && studentMap.get(name).equals(number);
        return isValid.test(name,number);
    }
*/
    public static void main(String[] args) {
        Student student1 = new Student("Leelavathi" , "Pandrangi", "501");
        Student student2= new Student("Balanjaneyulu", "Pandrangi", "502");

        Predicate<Student> isLeelavathi = student -> "Leelavathi Pandrangi".equals(student.getFullname()) && "501".equals(student.studentNumber);
        System.out.println("Student1 is: "+ isLeelavathi.test(student1));
        System.out.println("Student2 is:"+ isLeelavathi.test(student2));
       /* boolean isValid=student.validateStudent(studentToValidate);
        System.out.println("The Student is Valid: " + isValid);
        System.out.println(studentToValidate.isValidStudent("Leela","501"));
        System.out.println(studentToValidate.isValidStudent("bala","502"));
        System.out.println(studentToValidate.isValidStudent("jai","503"));
        System.out.println(studentToValidate.isValidStudent("Sai","504"));*/
    }
}
