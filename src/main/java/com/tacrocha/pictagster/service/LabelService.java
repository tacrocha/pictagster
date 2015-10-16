package com.tacrocha.pictagster.service;

import com.tacrocha.pictagster.domain.Label;

import java.util.List;

/**
 * Created by tacio on 2015-10-15.
 */
public interface LabelService {
    void add(Label label);
    void delete(Label label);
    Label find(String name);
    List<Label> getAllLabels();
    void update(Label label);

}
