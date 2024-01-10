package org.example;

import java.util.List;
import java.util.Objects;

public class Pipeline {

    public Filter<String> filter;

    public Pipeline(Filter<String> filter){
        this.filter = filter;
    }

    public String process(String data){
        String dataTransformada = filter.process(data);
        return dataTransformada;
    }
}
