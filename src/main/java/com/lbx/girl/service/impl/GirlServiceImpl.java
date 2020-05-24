package com.lbx.girl.service.impl;

import com.lbx.girl.exception.GirlException;
import com.lbx.girl.repository.GirlRepository;
import com.lbx.girl.service.GirlService;
import org.springframework.stereotype.Service;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/5/24 13:55
 * NOTE:
 */
@Service
public class GirlServiceImpl implements GirlService {
    private final GirlRepository repository;

    public GirlServiceImpl(GirlRepository repository) {
        this.repository = repository;
    }


    @Override
    public void age_if(Integer id) {
        Integer age = repository.findById(id).getAge();
        if (10 > age) {
            throw new GirlException("你还在上小学吧", -2);
        }
        if (age > 10 && age < 16) {
            throw new GirlException("你在上初中吧", -1);
        }
        if (16 < age) {
            throw new GirlException("你可以通过", 0);
        }

    }
}
