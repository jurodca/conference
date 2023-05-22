package com.pluralsight.repository;

import com.pluralsight.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        return Arrays.asList(
                new Speaker("James","Hetfield"),
                new Speaker("Lars", "Ulrich"),
                new Speaker("Kirk", "Hammet"),
                new Speaker("Jason", "Newsted") );
    }
}
