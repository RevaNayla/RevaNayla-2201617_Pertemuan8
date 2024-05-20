/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OveridingOverloading;

import java.util.Date;

/**
 *
 * @author Windows
 */
public class Staff extends Employee {
    private String gelar;

    public Staff(String name, String address, String phoneNumber, String emailAddress, String office, double salary, 
            Date dateHired, String title) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.gelar = gelar;
    }
    
    public String getGelar(){
        return gelar;
    }
    
    public void setGelar(String gelar){
        this.gelar = gelar;
    }

    @Override
    public String toString() {
        return "Class: Staff, Name: " + getName();
    }
}