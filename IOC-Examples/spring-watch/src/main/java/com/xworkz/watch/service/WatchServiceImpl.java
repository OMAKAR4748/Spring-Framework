package com.xworkz.watch.service;

import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.entity.WatchEntity;
import com.xworkz.watch.repositary.WatchRepositary;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WatchServiceImpl implements WatchService{

    @Autowired
    WatchRepositary watchRepositary;

    @Override
    public boolean validateAndSave(WatchDto watchDto) {
        WatchEntity watchEntity = new WatchEntity();

        BeanUtils.copyProperties(watchDto,watchEntity);
        System.out.println();

        boolean save = watchRepositary.save(watchEntity);
        System.out.println("Data saved");
        return save;
    }
}
