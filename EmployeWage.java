package com.bridgelabz.day10;

public class EmployeWage {
    public static int Empcomputation( String company, int empratePerHour, int numberOfWorkingDays,
                                      int maxHoursPerMonth) {
        final int fulltime = 1;
        final int partime = 2;
        final int mothworkdays = 20;
        final int totalworkinghours = 100;
        int Rate = 20;
        int Emphour = 0;
        int Empwage = 0;
        int totalmonthwage = 0;
        int day = 0;
        while (day < mothworkdays && Emphour < totalworkinghours) {
            day++;

            int empcheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empcheck) {
                case fulltime:
                    Emphour = 8;
                    break;

                case partime:
                    Emphour = 4;
                    break;
            }
            Empwage = Emphour * Rate;
            totalmonthwage = totalmonthwage + Empwage;
            System.out.println("Day" + day + "Emphours" + Emphour);
        }
        System.out.println("Totalmonthwage" + totalmonthwage);
        return totalmonthwage;
    }

    public static void main(String[] args) {
        Empcomputation("Dmart",20,2,  10);
        Empcomputation("Reliance", 10,40,20);
    }




}

