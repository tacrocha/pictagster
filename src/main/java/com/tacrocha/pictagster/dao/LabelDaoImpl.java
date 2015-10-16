package com.tacrocha.pictagster.dao;

import com.tacrocha.pictagster.domain.Label;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by tacio on 2015-10-15.
 */
@Repository
public class LabelDaoImpl implements LabelDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void createLabel(Label label) {
        em.persist(label);
    }

    @Override
    public Label retrieveLabel(String name) {
        return (Label) em.createQuery("select label from Label as label where label.name=:name")
                .setParameter("name",name).getSingleResult();
    }

    @Override
    public void updateLabel(Label label) {

    }

    @Override
    public void deleteLabel(Label label) {

    }

    @Override
    public List<Label> retrieveAllLabels() {
        return em.createQuery("select label from Label as label").getResultList();
    }
}
