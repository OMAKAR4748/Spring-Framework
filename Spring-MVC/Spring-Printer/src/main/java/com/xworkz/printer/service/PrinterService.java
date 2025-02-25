package com.xworkz.printer.service;

import com.xworkz.printer.dto.PrinterDto;

public interface PrinterService {
    boolean validateAndSave(PrinterDto dto);
}
