package br.dh.meli.services;

import br.dh.meli.model.UserDB;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    Optional<UserDB> getUserById(long id);
    UserDB insertUser(UserDB userDB);
    void deleteUser(long id);
    List<UserDB> listAll();
}
