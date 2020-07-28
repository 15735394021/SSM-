package com.fenghuo.service;

import com.fenghuo.dao.TestDao;
import com.fenghuo.domain.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public interface TestService {
    Test query();
}
