package br.dh.meli.services;

import br.dh.meli.exception.BadRequestException;
import br.dh.meli.exception.UserNotFoundException;
import br.dh.meli.model.UserDB;
import br.dh.meli.repository.IUserDbRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserDbRepo repo;

    public UserDB getUserById(long id) {
        return repo.findById(id).orElseThrow(
                () -> new UserNotFoundException("Usuário não encontrado id: " + id)
        );
    }

    @Override
    public UserDB insertUser(UserDB newUser) {
        if (newUser.getId() > 0) {
            throw new BadRequestException("O usúario não pode ter Id para ser inseridos");
        }
        return repo.save(newUser);
    }

    @Override
    public UserDB updatePartial(long id, Map<String, String> changes) {
        UserDB userFound = getUserById(id);
        changes.forEach(
                (attribute, value) -> {
                    switch (attribute){
                        case "name": userFound.setName(value); break;
                        case "email": userFound.setEmail(value); break;
                    }
                }
        );
        return repo.save(userFound);
    }

    @Override
    public UserDB update(UserDB user) {
        UserDB userFound = getUserById(user.getId());

        return repo.save(user);
    }

    @Override
    public void deleteUser(long id) {
        UserDB userFound = getUserById(id);
        repo.delete(userFound);
    }

    @Override
    public List<UserDB> listAll() {
        return (List<UserDB>) repo.findAll();
    }

    @Override
    public UserDB findByEmail(String email) {
        return repo.findByEmail(email);
    }


}
