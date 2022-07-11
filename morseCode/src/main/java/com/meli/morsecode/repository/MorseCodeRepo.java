package com.meli.morsecode.repository;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.meli.morsecode.model.MorseCode;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Repository
public class MorseCodeRepo {
    private final static String DATA = "src/main/resources/data.JSON";

    public List<MorseCode> getAllMoserCode() throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        return Arrays.asList(mapper.readValue(new File(DATA), MorseCode[].class));

    }

}
