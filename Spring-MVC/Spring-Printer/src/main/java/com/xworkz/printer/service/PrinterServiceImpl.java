package com.xworkz.printer.service;

import com.xworkz.printer.dto.PrinterDto;
import com.xworkz.printer.entity.PrinterEntity;
import com.xworkz.printer.repositary.PrinterRepositary;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrinterServiceImpl implements PrinterService{
    @Autowired
    PrinterRepositary repositary;
    @Override
    public boolean validateAndSave(PrinterDto dto) {
        PrinterEntity entity = new PrinterEntity();
        BeanUtils.copyProperties(dto,entity);
        System.out.println(entity);
        boolean result = repositary.save(entity);
        System.out.println("Data saved");
        return result;
    }
}
