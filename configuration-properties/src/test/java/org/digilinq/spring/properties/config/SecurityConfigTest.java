package org.digilinq.spring.properties.config;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

//@SpringBootTest
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {
        MappingConfiguration.class
})
@EnableConfigurationProperties(value = SecurityConfig.class)
@TestPropertySource("classpath:security.properties")
class SecurityConfigTest {
    @Autowired
    SecurityConfig securityConfig;

    @Autowired
    ObjectMapper mapper;

    @Test
    void shouldLoadProperties() throws JsonProcessingException {
        assertNotNull(securityConfig);
        assertNotNull(securityConfig.getSecurityPolicies());
        assertEquals(2, securityConfig.getSecurityPolicies().size());

        Optional.of(mapper.writerWithDefaultPrettyPrinter()
                .writeValueAsString(securityConfig.getSecurityPolicies()))
                .ifPresent(System.out::println);

    }
}