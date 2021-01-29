package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
       Student student1 = new Student("Peter", "Okowri", 1L, "Engineering");
        Student student2 = new Student("Jane", "Joe", 2L, "Arts");
        Student student3 = new Student("John", "Joe", 3L, "Faculty of Law");
        Student student4 = new Student("Muhammadu", "Buhari", 4L, "Education");
        Student student5 = new Student("Oluyemi", "Oluleke", 5L, "Health Sciences");

        HashMap<Long, Student> studentsHashMap = new HashMap<>();

        studentsHashMap.put(student1.getIdNo(), student1);
        studentsHashMap.put(student2.getIdNo(), student2);
        studentsHashMap.put(student3.getIdNo(), student3);
        studentsHashMap.put(student4.getIdNo(), student4);
        studentsHashMap.put(student5.getIdNo(), student5);

        System.out.println(studentsHashMap.toString());



    }
}
