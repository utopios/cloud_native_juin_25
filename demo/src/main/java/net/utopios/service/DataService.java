package net.utopios.service;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Singleton;

import java.util.Arrays;
import java.util.List;

@ApplicationScoped
public class DataService {
    public List<String> getData() {
        return Arrays.asList("t1", "t1");
    }
}
