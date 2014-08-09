package br.com.lifejesus.locadora.infrastructure.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.guava.GuavaModule;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;
import com.fasterxml.jackson.datatype.joda.JodaModule;

/**
 * Configuração customizada do Jackson.
 */
public class ApplicationObjectMapper extends ObjectMapper {

    public ApplicationObjectMapper() {
        registerModule(new Hibernate4Module());
        registerModule(new GuavaModule());
        registerModule(new JodaModule());
    }
}
