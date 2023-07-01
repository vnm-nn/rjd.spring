package com.example.rjd_spring_test.service;

import com.example.rjd_spring_test.entity.Tram;

import java.util.List;

public interface TramService {
    public List<Tram> getAllTrams();

    public void saveTram(Tram tram);

    public Tram getTram(int id);

    public void deleteTram(int id);
}
