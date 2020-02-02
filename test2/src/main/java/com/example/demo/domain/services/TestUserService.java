package com.example.demo.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.dao.TestUserDao;
import com.example.demo.domain.entity.TestUser;


@Service
public class TestUserService {
    @Autowired(required=true)
    private TestUserDao dao;

    public TestUser getTestUser(Integer id) {
    	return dao.selectById(id);
    }

}
