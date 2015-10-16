package com.tacrocha.pictagster.dao;

import com.tacrocha.pictagster.domain.Label;

/**
 * Created by tacio on 2015-10-15.
 */
public interface LabelDao {

    void createLabel(Label label);
    Label retrieveLabel(String name);
    void updateLabel(Label label);
    void deleteLabel(Label label);

}
