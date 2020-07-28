package com.fenghuo.dao;

import com.fenghuo.domain.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestDao {
    Test query();
}
