package com.bridgelabz.day10;

public class EmployeWage {
    public static void main(String[] args) {
        final int fulltime=1;
        final int partime=2;
        final int mothworkdays=20;
        int Rate=20;
        int Emphour=0;
        int Empwage=0;
        int totalmonthwage=0;

        for(int day=1;day<mothworkdays;day++){
            int empcheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empcheck) {
                case fulltime:
                    Emphour = 8;
                    break;

                case partime:
                    Emphour = 4;
                    break;
            }
            Empwage = Emphour*Rate;
            totalmonthwage=totalmonthwage+Empwage;
            System.out.println("Empwage"+Empwage);
        }
        System.out.println("Totalmonthwage" +totalmonthwage);
    }


}

