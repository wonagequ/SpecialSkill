package com.zjt.service.impl;

import com.zjt.mapper.TestPojoMapper;
import com.zjt.pojo.TestPojo;
import com.zjt.service.TestPojoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestPojoImpl  implements TestPojoService {
    @Autowired
    private TestPojoMapper tm;
    @Override
    public List<TestPojo> getMenu() {
        return tm.getMenu2();
    }
}
