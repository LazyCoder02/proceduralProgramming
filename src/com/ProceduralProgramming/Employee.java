package com.ProceduralProgramming;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmplyees;

    public Employee(int baseSalary){
        this(baseSalary, 0);
    }
    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmplyees++;
    }
    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmplyees);
    }

    public int calculateWage(int extraHours)
    {
        return   baseSalary + (hourlyRate * extraHours);
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary < 0)
            throw new IllegalArgumentException("Salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }
    private int getBaseSalary() {
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }
}
