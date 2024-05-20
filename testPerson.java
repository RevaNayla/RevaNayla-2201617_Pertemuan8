/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OveridingOverloading;

/**
 *
 * @author Windows
 */
import java.util.Date;

public class testPerson {
    public static void main(String[] args) {
        Person person = new Person("Daniel Choi", "Seoul", "8256-86289", "danielchoi@example.com");
        Student student = new Student("Canny", "Bangkok", "6687-98754", "cannyy@example.com", Student.mahasiswaBaru);
        Employee employee = new Employee("Ruby Jane", "Los Angeles", "3231-87645", "rubyjane@example.com", "Oddatelier", 60000, new Date());
        Faculty faculty = new Faculty("Bobby Kim", "Seoul", "8287-90876", "bobbykim@example.com", "143 Ent", 4000, new Date(), "9am-5pm", "Professor");
        Staff staff = new Staff("Mino", "Seoul", "8249-8765", "mino@example.com", "Yg ent", 20000, new Date(), "Manager");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
