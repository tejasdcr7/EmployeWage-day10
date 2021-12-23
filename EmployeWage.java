package com.bridgelabz.day10;

public class EmployeWage {
    public static final int isPartTime = 1;
    public static final int isFullTime = 2;
    private final String company;
    private final int empratePerHour;
    private final int numberOfWorkingdays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;

    public EmployeWage(String company, int empratePerHour, int numberOfWorkingdays, int maxHoursPerMonth) {
        this.company = company;
        this.empratePerHour = empratePerHour;
        this.numberOfWorkingdays = numberOfWorkingdays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void computeEmpWage() {
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numberOfWorkingdays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {
                case isFullTime:
                    empHrs = 4;
                    break;
                case isPartTime:
                    empHrs = 4;
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#" + totalWorkingDays + "Emp Hr:" + empHrs);
        }
        totalEmpWage = totalEmpHrs * empratePerHour;

    }

    @Override
    public String toString() {
        return "EmployeWage{" +
                "company='" + company + '\'' +
                ", empratePerHour=" + empratePerHour +
                ", numberOfWorkingdays=" + numberOfWorkingdays +
                ", maxHoursPerMonth=" + maxHoursPerMonth +
                ", totalEmpWage=" + totalEmpWage +
                '}';
    }

    public static void main(String[] args) {
        EmployeWage Dmart = new EmployeWage("Dmart",20,2,10);
        EmployeWage Reliance=new EmployeWage("Reliance",10,4,20);
        Dmart.computeEmpWage();
        System.out.println("Dmart");
        Reliance.computeEmpWage();
        System.out.println("Reliance");
    }
}

