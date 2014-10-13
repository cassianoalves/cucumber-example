package com.cassiano.cucumber;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * Created by cassiano on 13/10/14.
 */
public class Calculator {
    public static int memory;

    public static int sum(int n1, int n2) {
        return n1 + n2;
    }

    public static int sumMemory(int n1) {
        return memory + n1;
    }

    public static int subtractMemory(int n1) {
        return memory - n1;
    }


    public static int divisaoJSON(String arg1) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        HashMap<String, Integer> resultado = mapper.readValue(arg1, HashMap.class);

        if ("divisao".equals(resultado.get("operacao"))) {

            return Integer.valueOf(resultado.get("n1")) / Integer.valueOf(resultado.get("n2"));
        } else {
            return 0;
        }
    }

    public static int sumList(List<Integer> valores) {
        int total = 0;
        for (Integer i : valores) {
            total += i;
        }

        return total;
    }
}
