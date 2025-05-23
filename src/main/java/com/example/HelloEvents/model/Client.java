package com.example.HelloEvents.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@Getter  @Setter

public class Client extends User {

    public Client() {
        this.setRole(Role.CLIENT);
    }



    @OneToMany(mappedBy = "client" , cascade = CascadeType.ALL , orphanRemoval = true)
    private List<Reservation> reservations;

}
