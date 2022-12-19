package com.koala.skillstree.services;

import com.koala.skillstree.models.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentService {
    private static int studentId=3;
    private static List<Student> students = new ArrayList<Student>();
    static {
        students.add(new Student(1,"charifa","charifa@gmail.com","123"));
        students.add(new Student(2,"haytham","haytham@gmail.com","123"));
        students.add(new Student(3,"ilyass","ilyass@gmail.com","123"));
    }
    public List<Student> readAllStudent(String email){
        List<Student> student = new ArrayList<Student>();
        for(Student st : students){
            if(st.getEmail().equals(email)){
                student.add(st);
            }
        }
        return student;
    }
// function to add student
    public void addStudent(int id,String name,String email,String password){
        students.add(new Student(studentId++,name,email,password));
    }
//    function delete student
    public void deleteStudent(int id){
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if(student.getId()==id){
                iterator.remove();
            }
        }
    }


}
