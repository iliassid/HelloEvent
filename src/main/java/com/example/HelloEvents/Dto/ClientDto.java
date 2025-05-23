package com.example.HelloEvents.Dto;

import com.example.HelloEvents.model.Reservation;
import lombok.*;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Data


public class ClientDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
