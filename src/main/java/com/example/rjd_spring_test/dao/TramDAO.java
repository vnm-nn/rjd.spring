package com.example.rjd_spring_test.dao;

import com.example.rjd_spring_test.entity.Tram;

import java.util.List;

public interface TramDAO {
    public List<Tram> getAllTrams();

    public void saveTram(Tram tram);

    public Tram getTram(int id);

    public void deleteTram(int id);
}
