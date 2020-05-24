package com.lbx.girl.repository;

import com.lbx.girl.entity.Girl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import javax.persistence.Id;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/5/23 19:21
 * NOTE:
 */
@Component
public interface GirlRepository extends JpaRepository<Girl, Id> {
    Girl findById(Integer id);
}
