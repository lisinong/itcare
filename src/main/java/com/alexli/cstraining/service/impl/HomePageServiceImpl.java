package com.alexli.cstraining.service.impl;

import com.alexli.cstraining.mapper.HospMapper;
import com.alexli.cstraining.model.Hosp;
import com.alexli.cstraining.service.HomePageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class HomePageServiceImpl implements HomePageService {
    @Resource
    private HospMapper hospMapper;

    @Override
    public List<Hosp> findAll() {
        return hospMapper.selectList(null);
    }
}
