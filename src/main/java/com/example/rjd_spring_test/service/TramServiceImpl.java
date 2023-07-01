package com.example.rjd_spring_test.service;

import com.example.rjd_spring_test.dao.TramDAO;
import com.example.rjd_spring_test.entity.Tram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class TramServiceImpl implements TramService {
    @Autowired
    private TramDAO tramDAO;

    @Override
    @Transactional
    public List<Tram> getAllTrams() {
        return tramDAO.getAllTrams();
    }

    @Override
    @Transactional
    public void saveTram(Tram tram) {
        tramDAO.saveTram(tram);
    }

    @Override
    @Transactional
    public Tram getTram(int id) {
        return tramDAO.getTram(id);
    }

    @Override
    @Transactional
    public void deleteTram(int id) {
        tramDAO.deleteTram(id);
    }
}
