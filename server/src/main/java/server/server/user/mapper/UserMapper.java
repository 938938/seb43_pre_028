package server.server.user.mapper;


import org.mapstruct.Mapper;
import server.server.user.dto.UserPostDto;
import server.server.user.dto.UserResponseDto;
import server.server.user.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {

    default User userPostDtoToUser(UserPostDto userPostDto) {
        User user = new User();

        user.setEmail(userPostDto.getEmail());
        user.setDisplayName(userPostDto.getDisplayName());
        user.setPassword(userPostDto.getPassword());

        return user;
    }

    default UserResponseDto userToUserResponseDto(User user) {

        UserResponseDto userResponseDto = new UserResponseDto();

//        userResponseDto.setUserId(user.getUserId());
        userResponseDto.setEmail(user.getEmail());
        userResponseDto.setDisplayName(user.getDisplayName());
//        userResponseDto.setPassword(user.getPassword());
        userResponseDto.setImage(user.getImage());
        userResponseDto.setUserStatus(user.getUserStatus());

        return userResponseDto;
    }

}