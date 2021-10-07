package com.company;

public interface DataService {

    void add(String text) throws LowMemoryException;

    String get() throws NoSuchElementsException;

}
