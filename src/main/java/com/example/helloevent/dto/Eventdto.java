package com.example.helloevent.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Eventdto {
    private Long id;
    private String name;
    private Date date;
    private String location;
    private String category;
}
