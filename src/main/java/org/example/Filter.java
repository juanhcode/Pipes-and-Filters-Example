package org.example;

public interface Filter<T> {

    T process(T data);
}
