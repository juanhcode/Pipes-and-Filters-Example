package org.example;

public class UpperCaseFilter implements Filter<String>{


    @Override
    public String process(String data) {
        return data.toUpperCase();
    }
}
