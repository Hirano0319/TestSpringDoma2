package com.example.demo.domain.entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * 
 * @author test
 */
@Entity
@Table(name = "test_user")
public class TestUser {

    /**  */
    @Id
    @Column(name = "id")
    public Integer id;

    /**  */
    @Column(name = "name")
    public String name;
}