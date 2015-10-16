package com.tacrocha.pictagster.domain;

import javax.persistence.*;

/**
 * Created by tacio on 2015-10-15.
 */
@Entity
public class Label {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(unique = true)
    private String name;

    public Label(){
    }

    public Label(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Label label = (Label) o;

        return name.equals(label.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
