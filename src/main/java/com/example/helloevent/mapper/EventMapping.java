package com.example.helloevent.mapper;

import com.example.helloevent.dto.Eventdto;
import com.example.helloevent.model.Event;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EventMapping {

    Event toEntity(Eventdto dto);
    Eventdto toDTO(Event event);
    List<Eventdto> toDTOs(List<Event>eventsliste);
}
