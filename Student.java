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
public class Student extends Person {
    public static final String mahasiswaBaru = "Mahasiswa Baru";
    public static final String mahasiswa2 = "Mahasiswa Tahun kedua";
    public static final String junior = "Junior";
    public static final String senior = "Senior";

    private String status;

    public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
        super(name, address, phoneNumber, emailAddress);
        this.status = status;
    }
    
    public String getStatus (){
        return status;
    }
    
    public void setStatus (String status){
        this.status = status;
    }

    @Override
    public String toString() {
        return "Class: Student, Name: " + getName();
    }
}