package br.dh.meli.services;

import br.dh.meli.model.UserDB;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface IUserService {
    UserDB getUserById(long id);
    UserDB insertUser(UserDB userDB);
    UserDB updatePartial(long id, Map<String, String> changes);

    UserDB update(UserDB user);

    void deleteUser(long id);
    List<UserDB> listAll();
    UserDB findByEmail(String email);

}
