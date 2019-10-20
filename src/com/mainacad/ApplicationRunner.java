package com.mainacad;

import com.mainacad.service.AnagrammaSearch;

import java.util.logging.Logger;

public class ApplicationRunner {

    private static final Logger LOGGER=Logger.getLogger(ApplicationRunner.class.getName());

    public static void main(String[] args) {
        LOGGER.info(" The max anagramma is "+ AnagrammaSearch.getNumberByMultiplication());
    }
}
