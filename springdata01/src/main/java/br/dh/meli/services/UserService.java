package br.dh.meli.services;

import br.dh.meli.model.UserDB;
import br.dh.meli.repository.IUserDbRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserDbRepo repo;

    public Optional<UserDB> getUserById(long id) {
        return repo.findById(id);
    }

    @Override
    public UserDB insertUser(UserDB newUser) {
        if (newUser.getId() > 0) return null;
        return repo.save(newUser);
    }

    @Override
    public void deleteUser(long id) {
        if (repo.findById(id).isPresent());{
            repo.deleteById(id);
        }
        // TODO: lançar exception UserNotFound
    }

    @Override
    public List<UserDB> listAll() {
        return (List<UserDB>) repo.findAll();
    }


}
