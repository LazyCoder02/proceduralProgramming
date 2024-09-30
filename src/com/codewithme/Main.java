package com.codewithme;

public class Main {
    public static void main(String[] args) {
        var textBox1 = new TexBox();
        textBox1.setText("Hello");
        var textBox2 = textBox1;
        textBox2.setText("Ron");
        System.out.println(textBox1.text.toUpperCase());
    }
}