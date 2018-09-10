package com.company;

import javax.swing.*;
import java.awt.*;

class Person {
    private String fname;
    private String lname;
    private String ssn; // social security number
    private String phoneNum;
    private Adress adr;

    public Person(String firstName, String lastName, String socialSecurityNumber, String phoneNumber, Adress adress){

        fname = firstName;
        lname = lastName;
        ssn = socialSecurityNumber;
        phoneNum = phoneNumber;
        adr = adress;

    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Adress getAdr() {
        return adr;
    }

    public void setAdr(Adress adr) {
        this.adr = adr;
    }
    @Override
    public String toString(){
        return "Person{" +
                "first name = " + fname + '\'' +
                ", last name = " + lname + '\'' +
                ", Social Security number = " + ssn + '\'' +
                ", phone number = " + phoneNum + '\'' +
                ", adress = " + adr +
                "}";
    }

}

class Adress{
    private String strAdress; // streetAdress
    private String postNum;
    private String myState;

    public Adress (String streetAdress, String postNumber, String state){
        strAdress = streetAdress;
        postNum = postNumber;
        myState = state;
    }

    public String getStreetAdress() {
        return strAdress;
    }

    public void setStreetAdress(String streetAdress) {
        this.strAdress = streetAdress;
    }

    public String getPostNum() {
        return postNum;
    }

    public void setPostNum(String postNum) {
        this.postNum = postNum;
    }

    public String getState() {
        return myState;
    }

    public void setState(String myState) {
        this.myState = myState;
    }

    @Override
    public String toString(){
        return "Adress{" +
                ", street adress = " + strAdress + '\'' +
                ", post number = " + postNum + '\'' +
                ", state = " + myState + '\'' +
                "}";
    }

}



public class Tehtava_3_4 {
    public static void main(String[] args){

        Person[] ppl = new Person[3];

        for (int i = 0; i < 3; i++) {

            String fname = JOptionPane.showInputDialog("First name: ");
            String lname = JOptionPane.showInputDialog("Last name: ");
            String ssn = JOptionPane.showInputDialog("Social security number: ");
            String phoneNum = JOptionPane.showInputDialog("Phone number: ");
            String streetAdress = JOptionPane.showInputDialog("Street adress: ");
            String postNumber = JOptionPane.showInputDialog("Post number: ");
            String state = JOptionPane.showInputDialog("State: ");
            ppl[i] = new Person(fname, lname, ssn, phoneNum, new Adress(streetAdress, postNumber, state));

        }
        for (Person h : ppl){
            System.out.println(h);
        }
    }
}
