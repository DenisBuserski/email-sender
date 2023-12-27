package org.example.dbcheck;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.email.EmailPreparation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;


@Service
public class EventServiceImpl implements EventService {
    private final EventRepository eventRepository;
    private static final Logger EVENT_LOGGER = LogManager.getLogger(EmailPreparation.class);

    @Autowired
    public EventServiceImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public List<String> checkEvents() {
        List<String> result = new ArrayList<>();

        List<Event> events = this.eventRepository.findAllByDateBetween(
                LocalDateTime.of(2023, Month.JANUARY, 3, 0, 0, 0),
                LocalDateTime.of(2023, Month.JANUARY, 4, 0, 0, 0));

        if (events.size() < 3) {
            events.forEach(event -> result.add(event.getDate() + " - " + event.getEvent()));
            EVENT_LOGGER.info("Found {} events", result.size());
            return result;
        }

        return List.of();
    }
}
