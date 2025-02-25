package com.xworkz.printer;

import com.xworkz.printer.config.SpringPrinterConfiguration;
import com.xworkz.printer.dto.PrinterDto;
import com.xworkz.printer.service.PrinterService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrinterRunner {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringPrinterConfiguration.class);
        PrinterService service = applicationContext.getBean(PrinterService.class);

        PrinterDto dto = new PrinterDto();
        dto.setBrand("HP");
        dto.setModel("LaserJet Pro");
        dto.setPrinterType("Laser");
        dto.setResolution(1200);

        service.validateAndSave(dto);
    }


}
