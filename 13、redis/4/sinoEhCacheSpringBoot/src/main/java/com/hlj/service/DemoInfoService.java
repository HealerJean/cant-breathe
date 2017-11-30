package com.hlj.service;

/**
 * @Description 增删改查
 * @Author HealerJean
 * @Date 2017/11/30  15:20.
 */
import com.hlj.bean.DemoInfo;
import javassist.NotFoundException;

public interface DemoInfoService {

    DemoInfo save(DemoInfo demoInfo);

    void delete(Long id);

    DemoInfo update(DemoInfo updated) throws NotFoundException;

    DemoInfo findById(Long id);


}