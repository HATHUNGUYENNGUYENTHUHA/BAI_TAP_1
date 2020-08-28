package com.vn;

import com.vn.controller.Calculaltor;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        
        Calculaltor calculator1= new Calculaltor();
        calculator1.setA(5);
        calculator1.setB(10);
        calculator1.setC("/");
        float result1 = calculator1.calculator();
        System.out.println("a/b: " + result1); 
        
        Calculaltor calculator2= new Calculaltor();
        calculator2.setA(5);
        calculator2.setB(10);
        calculator2.setC("+");
        float result2 = calculator2.calculator();
        System.out.println("a+b: " + result2);
        
        Calculaltor calculator3= new Calculaltor();
        calculator3.setA(5);
        calculator3.setB(10);
        calculator3.setC("*");
        float result3 = calculator3.calculator();
        System.out.println("a*b: " + result3);
        
        Calculaltor calculator4= new Calculaltor();
        calculator4.setA(5);
        calculator4.setB(10);
        calculator4.setC("-");
        float result4 = calculator4.calculator();
        System.out.println("a-b: " + result4); 
        }
}
