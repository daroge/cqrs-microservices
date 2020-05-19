package de.daroge.cqrs.writeside;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import static com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATES_AS_TIMESTAMPS;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
import static com.fasterxml.jackson.annotation.PropertyAccessor.FIELD;

@SpringBootApplication
public class Application {

    @Bean
    private static ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new Jackson2ObjectMapperBuilder()
                .featuresToDisable(WRITE_DATES_AS_TIMESTAMPS)
                .build();
        objectMapper.setVisibility(FIELD, ANY);
        return objectMapper;
    }
}
