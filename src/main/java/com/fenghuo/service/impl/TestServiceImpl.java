package com.fenghuo.service.impl;

import com.fenghuo.dao.TestDao;
import com.fenghuo.domain.Test;
import com.fenghuo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    public TestDao testDao;
    @Override
    public Test query() {
        return testDao.query();
    }
}
