package br.dh.meli.services;

import br.dh.meli.model.UserDB;
import br.dh.meli.repository.IUserDbRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private IUserDbRepo repo;

    public UserDB getUserById(long id) {
        return (UserDB) repo.findById(id).orElse(null);
    }


}
