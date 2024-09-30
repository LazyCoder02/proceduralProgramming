package com.ProceduralProgramming;

import java.text.NumberFormat;

public class Execution {
    public static void main(String[] args) {

        var employee1 = new Employee(15_000, 32);
        System.out.println(Employee.numberOfEmplyees);
        int salary = employee1.calculateWage(21);
        System.out.println(NumberFormat.getCurrencyInstance().format(salary));

    }
}
