/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sarkhanrasullu
 */
public class StudentDAO {//
    private static List<Student> list= new ArrayList<>();
    
    static {
        list.add(new Student("Shahin", "Rashidbayli", 24));
        list.add(new Student("Nicat", "Qasimli", 24));
        list.add(new Student("Suzan", "Keny", 25));
        list.add(new Student("Emin", "Eminli", 26));
    }
    
    public static List<Student> getAllStudents(){
        return list;
    }
    
    public static List<Student> getAllStudentsByFilter(String name, String surname, int age){
        List<Student> result = new ArrayList<>();
        for(Student s: list){
            if(s.getName().equalsIgnoreCase(name) &&
                    s.getSurname().equalsIgnoreCase(surname)&&
                    s.getAge()==age){
                result.add(s);
            }
        }
        
        return result;
    }
    
    public static boolean add(Student s){
        list.add(s);
        return true;
    }
    
    public static boolean update(int index, Student s){
       Student selectedStudent= list.get(index);
       selectedStudent.setName(s.getName());
       selectedStudent.setSurname(s.getSurname());
       selectedStudent.setAge(s.getAge());
       
       return true;
    }
    
    public static boolean delete(int index){
        list.remove(index);
        return true;
    }
}
