package com.emw.repositories;

import com.emw.models.EventModel;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository <EventModel, Long> {

}
