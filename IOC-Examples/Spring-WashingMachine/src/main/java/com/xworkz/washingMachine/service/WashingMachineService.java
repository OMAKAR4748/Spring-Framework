package com.xworkz.washingMachine.service;

import com.xworkz.washingMachine.dto.WashingMachineDto;

public interface WashingMachineService {

    boolean validateAndSave(WashingMachineDto dto);
}