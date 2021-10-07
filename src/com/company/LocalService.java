package com.company;

import java.util.ArrayList;
import java.util.List;

public class LocalService implements DataService{

    private List<String> list = new ArrayList<>();

    @Override
    public void add(String text) throws LowMemoryException {
        if(list.size() >= 4){
            throw new LowMemoryException();
        } else {
            list.add(text);
        }
    }

    @Override
    public String get() throws NoSuchElementsException {
        if (list.size() < 1){
            throw new NoSuchElementsException();
        } else {
            return list.remove(0);
        }
    }
}
