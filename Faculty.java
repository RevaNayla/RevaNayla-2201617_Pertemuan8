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
public class Faculty extends Employee {
    private String officeHours;
    private String pangkat;

    public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, 
            double salary, Date dateHired, String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.pangkat = pangkat;
    }
    
    public String getOfficeHours(){
        return officeHours;
    }
    
    public void setOfficeHours(String officeHours){
        this.officeHours = officeHours;
    }
    
    public String getPangkat(){
        return pangkat;
    }
    
    public void setPangkat(String pangkat){
        this.pangkat = pangkat;
    }

    @Override
    public String toString() {
        return "Class: Faculty, Name: " + getName();
    }
}
