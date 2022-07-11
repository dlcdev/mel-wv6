package com.meli.morsecode.services;

import com.meli.morsecode.model.MorseCode;
import com.meli.morsecode.repository.MorseCodeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MorseCodeServiceImpl implements MorseCodeService {

    @Autowired
    private MorseCodeRepo repo;

    @Override
    public Object getAllMorseCode(String morseCode) throws IOException {
        if (morseCode != null) {
            List<String> morseCodeList = List.of(morseCode.split(" "));
            List<MorseCode> morseCodeListData = repo.getAllMoserCode();

            String translateCode = " ";

            for (String listMorse : morseCodeList) {
                translateCode += morseCodeListData.stream()
                        .filter(c -> c.getCode().equals(listMorse))
                        .map(l -> l.getLetter())
                        .collect(Collectors.joining());
            }
            return translateCode;
        }
        return repo.getAllMoserCode();
    }
}
