package com.xworkz.watch;

import com.xworkz.watch.config.SpringWatchConfiguration;
import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.service.WatchService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class WatchRunner {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringWatchConfiguration.class);
         WatchService watchService  = applicationContext.getBean(WatchService.class);

        WatchDto watchDto = new WatchDto();
        watchDto.setBrand("Rolex");
        watchDto.setColor("golden");
        watchDto.setPrice(40000);

        watchService.validateAndSave(watchDto);
    }
}
