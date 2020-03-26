package guru.springframework.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/** Author: JohnSnow | Date: 3/26/2020
 * Project: IntelliJ IDEA | Package: guru.springframework.msscjacksonexamples.model
 */
public class LocalDateDeserializer extends StdDeserializer {
    protected LocalDateDeserializer() {
        super(LocalDate.class);
    }

    @Override
    public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        return LocalDate.parse(p.readValueAs(String.class), DateTimeFormatter.BASIC_ISO_DATE);
    }
}
