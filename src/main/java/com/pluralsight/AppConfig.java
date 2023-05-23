package com.pluralsight;

import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import com.pluralsight.util.CalendarFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

@Configuration
public class AppConfig {

    @Bean(name = "cal")
    public CalendarFactory calFactory(){
        CalendarFactory calendarFactory = new CalendarFactory();
        calendarFactory.addDays(2);
        return calendarFactory;
    }

    @Bean
    public Calendar cal() throws Exception{
        return calFactory().getObject();
    }

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl speakerService = new SpeakerServiceImpl(getSpeakerRepository());
        //speakerService.setSpeakerRepository(getSpeakerRepository());
        return speakerService;
    }

    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }


}
