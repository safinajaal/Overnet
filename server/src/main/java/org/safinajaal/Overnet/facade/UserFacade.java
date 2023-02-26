package org.safinajaal.Overnet.facade;

import org.safinajaal.Overnet.dto.UserDTO;
import org.safinajaal.Overnet.entity.User;
import org.springframework.stereotype.Component;

//Фасад нужен для мэпинга модели из БД на клиент. Клиенту не нужны все поля модели, только некоторые
@Component
public class UserFacade {
    public UserDTO userToUserDTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setFirstname(user.getName());
        userDTO.setLastname(user.getLastname());
        userDTO.setUsername(user.getUsername());
        userDTO.setBio(user.getBio());
        return userDTO;
    }
}
