package com.example.helloevent.mapper;

import com.example.helloevent.dto.Bookingdto;
import com.example.helloevent.model.Booking;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookingMapping {
    Booking toEntity(Bookingdto bookingdto);
    Bookingdto todto(Booking booking);
    List<Bookingdto> todtos(List<Booking> eventsliste);

}
