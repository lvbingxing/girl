package com.lbx.girl.controller;

import com.lbx.girl.entity.Girl;
import com.lbx.girl.entity.Result;
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
        if (result.hasErrors()) {
            return ResultUtil.error(result.getFieldError().getDefaultMessage());

        }
        girl.setAge(girl.getAge());
        girl.setCupSize(girl.getCupSize());
        return ResultUtil.success(repository.save(girl));
    }

    /*
     * 查询一个girl
     * */
    @GetMapping("/findById/{id}")
    public Girl findById(@PathVariable("id") Integer id) {
        return repository.findById(id);
    }


    @GetMapping("/ageIf/{id}")
    public void ageIf(@PathVariable("id") Integer id) throws Exception {
        girlService.age_if(id);

    }
}
