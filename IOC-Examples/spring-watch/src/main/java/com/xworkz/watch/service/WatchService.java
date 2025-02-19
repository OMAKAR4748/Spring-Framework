package com.xworkz.watch.service;

import com.xworkz.watch.dto.WatchDto;

public interface WatchService {

    boolean validateAndSave(WatchDto watchDto);
}
