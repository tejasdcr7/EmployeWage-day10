package com.bridgelabz.day10;

public class EmployeWage {
    public static void main(String[] args) {
        int fulltime = 1;
        int parttime = 2;
        int Rate=20;
        int Emphour=0;
        int Empwage=0;


        double empcheck = Math.floor(Math.random() * 10) % 3;
        if (empcheck == fulltime)
            Emphour=8;
        else if (empcheck == parttime)
            Emphour=4;
        else
            Emphour=0;


        Empwage=Emphour*Rate;
        System.out.println("Empwage"+Empwage);
    }

}

