package org.pr2;

import org.junit.Before;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList; import java.util.Arrays; import java.util.List;
import org.junit.Test;

public class AppTest {

    private List<Integer> sistemaMonedas = new ArrayList<>();
    /* Sistema de monedas ordenado de mayor a menor, en céntimos */

    @Before
    public void setup() {
        this.sistemaMonedas.addAll(Arrays.asList(200, 100, 50, 20, 10, 5, 2, 1)); 
    }

    @Test
    public void cambioIterativo250Ok() {
        
        // TODO Completar assertEquals(1,1);
    }

    // ESCRIBIR MÁS TESTS

}
