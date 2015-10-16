package com.tacrocha.pictagster.domain;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by tacio on 2015-10-15.
 */
public class Picture {

    private String name;
    private String path;

    private Set<Label> labels;

    public Picture() {
    }

    public Picture(String name, String path) {
        this.name = name;
        this.path = path;
        this.labels = new HashSet<Label>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addLabel(Label label) {
        this.labels.add(label);
    }

    public Set<Label> getLabels() {
        return Collections.unmodifiableSet(this.labels);
    }

}
