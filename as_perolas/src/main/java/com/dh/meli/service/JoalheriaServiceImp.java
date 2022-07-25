package com.dh.meli.service;

import com.dh.meli.exception.BadRequestException;
import com.dh.meli.exception.JoiaNotFoundException;
import com.dh.meli.model.Joalheria;
import com.dh.meli.repository.IJoiaDbRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class JoalheriaServiceImp implements IJoalheriaService {

    @Autowired
    private IJoiaDbRepo repo;

    @Override
    public Joalheria insertJoia(Joalheria newJoia) {
        if (newJoia.getId() > 0) {
            throw new BadRequestException("A joia não pode ter ID para ser inserido");
        }
        return repo.save(newJoia);
    }

    @Override
    public Joalheria getById(long id) {
        return repo.findById(id).orElseThrow(
                () -> new JoiaNotFoundException("Joia não encontrada")
        );
    }

    @Override
    public List<Joalheria> listAll() {
        return (List<Joalheria>) repo.findAll();
    }

    @Override
    public Joalheria updateParcialById(long id, Map<String, String> changes) {
        Joalheria joiaFound = getById(id);

        changes.forEach(
                (attribute, value) -> {
                    switch (attribute) {
                        case "material":
                            joiaFound.setMaterial(value);
                            break;
                        case "peso":
                            joiaFound.setPeso(Double.parseDouble(value));
                            break;
                        case "quilates":
                            joiaFound.setQuilates(Integer.parseInt(value));
                            break;
                        case "preco":
                            joiaFound.setPreco(Double.parseDouble(value));
                            break;
                    }
                }
        );


        return repo.save(joiaFound);
    }

    @Override
    public Joalheria updateJoiaById(long id, Joalheria joia) {

        Joalheria joiaFound = getById(id);

        joiaFound.setProduto(joia.getProduto());
        joiaFound.setComposicao(joia.getComposicao());
        joiaFound.setPreco(joia.getPreco());
        joiaFound.setQuilates(joia.getQuilates());
        joiaFound.setPeso(joia.getPeso());
        joiaFound.setMaterial(joia.getMaterial());

        return repo.save(joiaFound);


    }

    @Override
    public void deleteById(long id) {
        repo.deleteById(id);
    }
}
