package com.example.helloevent.mapper;

import com.example.helloevent.dto.Userdto;
import com.example.helloevent.model.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    Userdto toDto(User user);

    User toEntity(Userdto userdto);

    List<Userdto> toDTOs(List<User> users);
}
