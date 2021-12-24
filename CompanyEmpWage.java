package com.bridgelabz.day10;

public class CompanyEmpWage {
    private final String company;
    private final int empratePerHour;
    private final int numberOfWorkingdays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;
    public CompanyEmpWage(String company, int empratePerHour, int numberOfWorkingdays, int maxHoursPerMonth) {
        this.company = company;
        this.empratePerHour = empratePerHour;
        this.numberOfWorkingdays = numberOfWorkingdays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }
    public void setTotalEmpWage(int totalEmpWage){
        this.totalEmpWage = totalEmpWage;
    }

    @Override
    public String toString() {
        return "CompanyEmpWage{" +
                "company='" + company + '\'' +
                ", empratePerHour=" + empratePerHour +
                ", numberOfWorkingdays=" + numberOfWorkingdays +
                ", maxHoursPerMonth=" + maxHoursPerMonth +
                ", totalEmpWage=" + totalEmpWage +
                '}';
    }
    public static class EmpWageBuilderArray {
        public static final int isPartTime = 1;
        public static final int isFullTime = 2;
        private int numOfCompany = 0;
        private CompanyEmpWage[] companyEmpWageArray;

        public EmpWageBuilderArray() {
            companyEmpWageArray = new CompanyEmpWage[5];
        }

        private void addCompanyEmpWage(String company, int empratePerHour, int numberOfWorkingdays,
                                       int maxHoursPerMonth) {
            companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empratePerHour, numberOfWorkingdays,
                    maxHoursPerMonth);
            numOfCompany++;
        }

        private void computeEmpWage() {
            for (int i = 0; i < numOfCompany; i++) {
                companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
                System.out.println(companyEmpWageArray[i]);
            }
        }
        private int computeEmpWage(CompanyEmpWage companyEmpWage) {
            int emphrs = 0, totalEmpHrs=0, totalWorkingDays = 0;
            while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays <
                    companyEmpWage.numberOfWorkingdays){
                totalWorkingDays++;
                int empCheck = (int) Math.floor(Math.random()*10) % 3;
                switch (empCheck){
                    case isPartTime:
                        emphrs=4;
                    case isFullTime:
                        emphrs=8;
                        break;
                    default:
                        emphrs=0;
                }
                totalEmpHrs += emphrs;
                System.out.println("Day#:" + totalWorkingDays + "Emp Hr:" +emphrs);
            }
            return totalEmpHrs * companyEmpWage.empratePerHour;
        }

        public static void main(String[] args) {
            EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
            empWageBuilder.addCompanyEmpWage("Dmart", 20, 2, 10);
            empWageBuilder.addCompanyEmpWage("Reliance", 10, 4,
                    20);
            empWageBuilder.computeEmpWage();
        }
    }
    }


