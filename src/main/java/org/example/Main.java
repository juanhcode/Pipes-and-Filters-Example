package org.example;


import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String texto = "Hola";
        Pipeline pipeline = new Pipeline(new UpperCaseFilter());
        System.out.println(pipeline.process(texto));
    }
}