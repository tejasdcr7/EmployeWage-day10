package com.bridgelabz.day10;

public class EmployeWage {
    public static void main(String[] args) {
        int fulltime = 1;
        int Rate=20;
        int Emphour=0;
        int Empwage=0;

        double empcheck = Math.floor(Math.random() * 10) % 2;
        if (empcheck == fulltime) {
            System.out.println("Emp is Present");
            Emphour=8;
        }
        else{
            System.out.println("Emp is absent");
            Emphour=0;}

        Empwage=Emphour*Rate;
        System.out.println("Empwage"+Empwage);
    }

}

