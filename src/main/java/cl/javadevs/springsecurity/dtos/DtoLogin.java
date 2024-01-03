package cl.javadevs.springsecurity.dtos;

import lombok.Data;

@Data
public class DtoLogin {
    private String username;
    private String pass;
}
