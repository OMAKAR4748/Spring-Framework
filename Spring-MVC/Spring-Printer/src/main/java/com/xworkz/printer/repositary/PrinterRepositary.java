package com.xworkz.printer.repositary;

import com.xworkz.printer.dto.PrinterDto;
import com.xworkz.printer.entity.PrinterEntity;

public interface PrinterRepositary {
    boolean save(PrinterEntity entity);
}
