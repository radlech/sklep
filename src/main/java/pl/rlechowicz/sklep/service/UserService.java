package pl.rlechowicz.sklep.service;

import pl.rlechowicz.sklep.dto.RegistrationDto;
import pl.rlechowicz.sklep.model.User;

import java.util.Optional;

public interface UserService {

    public Optional<String> getUserInfo();

    public void registerNewCustomer(RegistrationDto rDto) throws Exception;

}
