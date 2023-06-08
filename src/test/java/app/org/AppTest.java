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
        int cambio = 250;
        int expected = 2; // Expected minimum number of coins needed for 250 cents

        int actual = AppCambio.cambioIterativo(cambio, sistemaMonedas);
        assertEquals(expected, actual);
    }

    @Test
    public void cambioRecursivo250Ok() {
        int cambio = 250;
        int expected = 2; // Expected minimum number of coins needed for 250 cents

        int actual = AppCambio.cambioRecursivo(cambio, sistemaMonedas);
        assertEquals(expected, actual);
    }

    @Test
    public void cambioLambda250Ok() {
        int cambio = 250;
        int expected = 2; // Expected minimum number of coins needed for 250 cents

        int actual = AppCambio.cambioLambda(cambio, sistemaMonedas);
        assertEquals(expected, actual);
    }

    @Test
    public void cambioRecursivo50Ok() {
        int cambio = 50;
        int expected = 1; // Expected minimum number of coins needed for 50 cents

        int actual = AppCambio.cambioRecursivo(cambio, sistemaMonedas);
        assertEquals(expected, actual);
    }

    @Test
    public void cambioRecursivo0Ok() {
        int cambio = 0;
        int expected = 0; // No change needed

        int actual = AppCambio.cambioRecursivo(cambio, sistemaMonedas);
        assertEquals(expected, actual);
    }


}
