package com.emw.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "event")
public class EventModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private String location;
    private String date;
    private String time;
}
