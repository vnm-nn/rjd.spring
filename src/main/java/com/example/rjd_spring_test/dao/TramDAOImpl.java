package com.example.rjd_spring_test.dao;

import com.example.rjd_spring_test.entity.Tram;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class TramDAOImpl implements TramDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Tram> getAllTrams() {
        Query query = entityManager.createQuery("from Tram");
        List<Tram> allTrams = query.getResultList();
        return allTrams;
    }

    @Override
    public void saveTram(Tram tram) {
        Tram newTram = entityManager.merge(tram);
        tram.setId(newTram.getId());
    }

    @Override
    public Tram getTram(int id) {
        Tram tram = entityManager.find(Tram.class, id);
        return tram;
    }

    @Override
    public void deleteTram(int id) {
        Query query = entityManager.createQuery("delete from Tram " + "where id =:tramID");
        query.setParameter("tramID", id);
        query.executeUpdate();
    }
}
