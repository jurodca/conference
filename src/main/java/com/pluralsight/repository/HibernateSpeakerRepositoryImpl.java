package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Autowired
    private Calendar calendar;

    @Override
    public List<Speaker> findAll() {
        System.out.println("Cal: "+calendar.getTime());
        return Arrays.asList(
                new Speaker("James","Hetfield"),
                new Speaker("Lars", "Ulrich"),
                new Speaker("Kirk", "Hammet"),
                new Speaker("Jason", "Newsted") );
    }
}
