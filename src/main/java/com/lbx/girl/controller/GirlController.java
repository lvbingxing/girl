package com.lbx.girl.controller;

import com.lbx.girl.entity.Girl;
import com.lbx.girl.entity.Result;
import com.lbx.girl.exception.GirlException;
import com.lbx.girl.repository.GirlRepository;
import com.lbx.girl.service.GirlService;
import com.lbx.girl.utils.ResultUtil;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * USER :lvbingxing
 * TIME :Created in 2020/5/23 19:19
 * NOTE:
 */
@RestController
public class GirlController {
    private final GirlRepository repository;
    private final GirlService girlService;

    public GirlController(GirlRepository repository, GirlService girlService) {
        this.repository = repository;
        this.girlService = girlService;
    }

    /*
     * 获取所有girl
     * */
    @GetMapping("/list")
    public List<Girl> list() {
        return repository.findAll();
    }

    /*
     * 添加girl
     * */
    @PostMapping("/girl")
    public Result<Girl> girlAdd(@Valid Girl girl, BindingResult result) {
        if (result instanceof GirlException) {
            return ResultUtil.error(((GirlException) result).getMessage(), ((GirlException) result).getCode());
        }else {
            return ResultUtil.error("未知异常", -5);
        }
    }

    /*
     * 查询一个girl
     * */
    @GetMapping("/findById/{id}")
    public Girl findById(@PathVariable("id") Integer id) {
        return repository.findById(id);
    }

    /*
    * 某个girl的age是否满足条件
    * 此处使用捕获异常的方式 实现
    * 1.自定义异常类 GirlException
    * 2.根据给定条件抛出GirlException异常
    * 3.编写捕获类 捕获自定义异常，并包装成 最外层返回
    * */
    @GetMapping("/ageIf/{id}")
    public void ageIf(@PathVariable("id") Integer id) throws Exception {
        girlService.age_if(id);

    }
}
