package com.ProceduralProgramming;

public class Execution {
    public static void main(String[] args) {

        int baseSalary = 50_000;
        int extraHours = 10;
        int hourlyRate  = 20;
    }
    public static int calculateWage(
            int baseSalary,
            int extraHours,
            int hourlyRate
    ){
        return baseSalary * (hourlyRate + extraHours );
    }
}
