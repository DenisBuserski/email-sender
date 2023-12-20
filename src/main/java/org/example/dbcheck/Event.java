package org.example.dbcheck;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "events")
public class Event {
    @Id
    private int id;
    private LocalDateTime date;
    private String event;

}
