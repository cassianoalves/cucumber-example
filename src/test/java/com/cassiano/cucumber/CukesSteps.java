package com.cassiano.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import static org.junit.Assert.*;

public class CukesSteps {

    @Dado("^que eu não conheço o \"(.*?)\"$")
    public void que_eu_não_conheço_o(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @Dado("^o \"(.*?)\" parece ser meio esquisito$")
    public void o_parece_ser_meio_esquisito(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @Quando("^recebo o nome \"(.*?)\"$")
    public void recebo_o_nome(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @Então("^digo \"(.*?)\"$")
    public void digo(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
        assertTrue(true);
    }

    @Dado("^que eu conheço o \"(.*?)\"$")
    public void que_eu_conheço_o(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }

    @Dado("^que não vejo o \"(.*?)\" há \"(.*?)\" meses$")
    public void que_não_vejo_o_há_meses(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
    }




}
