package com.tacrocha.pictagster.service;

import com.tacrocha.pictagster.dao.LabelDao;
import com.tacrocha.pictagster.domain.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by tacio on 2015-10-15.
 */
@Service
@Transactional
public class LabelServiceImpl implements LabelService {

    @Autowired
    private LabelDao labelDao;

    @Override
    public void add(Label label) {
        labelDao.createLabel(label);
    }

    @Override
    public void delete(Label label) {

    }

    @Override
    public Label find(String name) {
           return labelDao.retrieveLabel(name);
    }

    @Override
    public void update(Label label) {

    }

    @Override
    public List<Label> getAllLabels() {
        return labelDao.retrieveAllLabels();
    }
}
