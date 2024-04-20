package com.site.learning.services;

import com.site.learning.models.Reading;
import com.site.learning.repo.ReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReadingService {
    private final ReadingRepository readingRepository;

    @Autowired
    public ReadingService(ReadingRepository readingRepository){
        this.readingRepository = readingRepository;
    }

    public List<Reading> getAllReadings(){
        return readingRepository.findAll();
    }
}
