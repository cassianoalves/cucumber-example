package com.cassiano.cucumber;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Before;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by cassiano on 13/10/14.
 */
public class CalculatorSteps {

    private int result;

    @Quando("^o usuário somar os valores (\\d+) e (\\d+)$")
    public void o_usuário_somar_os_valores_e(int n1, int n2) throws Throwable {
        result = Calculator.sum(n1, n2);

    }

    @Então("^o número (\\d+) é retornado$")
    public void o_número_é_retornado(int n) throws Throwable {
        assertEquals(result, n);
    }

    @Dado("^que a calculadora tem o número (\\d+) na memória$")
    public void que_a_calculadora_tem_o_número_na_memória(int n1) throws Throwable {
        Calculator.memory = n1;
    }

    @Quando("^o usuário fornecer o número (\\d+) para soma com o número na memória$")
    public void o_usuário_fornecer_o_número_para_soma_com_o_número_na_memória(int n1) throws Throwable {
        result = Calculator.sumMemory(n1);
    }

    @Quando("^o usuário fornecer o número (\\d+) para subtrair com o número na memória$")
    public void o_usuário_fornecer_o_número_para_subtrair_com_o_número_na_memória(int n1) throws Throwable {
        result = Calculator.subtractMemory(n1);
    }

    @Quando("^o JSON tiver o seguinte formato de entrada:$")
    public void o_JSON_tiver_o_seguinte_formato_de_entrada(String arg1) throws Throwable {
        result = Calculator.divisaoJSON(arg1);
    }

    @Quando("^a tabela conter os valores:$")
    public void a_tabela_conter_os_valores(List<Integer> valores) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        result = Calculator.sumList(valores);
    }


}
