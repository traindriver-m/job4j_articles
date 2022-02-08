package ru.job4j.template;

import org.junit.Test;
import ru.job4j.tdd.Ticket3D;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TextGeneratorTest {

    @Test
    public void whenStringGenerated() {
        TextGenerator textGenerator = new TextGenerator();
        String template = "I am a ${name}, Who are ${subject}? ";
        Map<String, String> map = new HashMap<>();
        map.put("name", "subject");
        String expected = String.format("I am a %s, Who are %s? ", "name", map.get("name"));
        assertThat(expected, is(textGenerator.produce(template, map)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenNoKey() {
        TextGenerator textGenerator = new TextGenerator();
        String template = "I am a ${name}, Who are ${subject}? ";
        Map<String, String> map = new HashMap<>();
        textGenerator.produce(template, map);
    }

    @Test(expected = IllegalArgumentException.class)
    public void whenExtraKey() {
        TextGenerator textGenerator = new TextGenerator();
        String template = "I am a ${name}, Who are ${subject}? ";
        Map<String, String> map = new HashMap<>();
        map.put("surname", "subject");
        textGenerator.produce(template, map);
    }
}