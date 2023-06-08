package org.pr2;

import java.util.List;
import java.util.stream.Stream;


public class AppCambio {

    /**
    * Dado un cambio de dinero y un sistema de monedas ordenado de mayor a menor * (todo en céntimos), devolver el número de monedas mínimo correspondiente al
    * cambio. La técnica de esta función debe ser iterativa (bucles).
    * @param cambio
    * @param sistemaMonedas
    * @return el número mínimo de monedas.
    */
    public static int cambioIterativo(int cambio, List<Integer> sistemaMonedas){
        // Aunque esto sería muy importante en una aplicación real, para facilitar
        // el trabajo al alumno, no será necesario comprobar que `cambio >= 0` ni
        // que el sistema de monedas es válido.
        int resultado = 0;
        // CÓDIGO A COMPLETAR
        return resultado; 
    }

    /**
    * Dado un cambio de dinero y un sistema de monedas ordenado de mayor a menor * (todo en céntimos), devolver el número de monedas mínimo correspondiente al
    * cambio. La técnica de esta función debe ser recursiva (con caso base).
    * @param cambio
    * @param sistemaMonedas
    * @return el número mínimo de monedas.
    */
    public static int cambioRecursivo(int cambio, List<Integer> sistemaMonedas) {
        int[] resultado = new int[1]; // Esta variable se puede utilizar para
        // paso por referencia. cambioRecursivo(cambio, 0, sistemaMonedas, resultado);
        return resultado[0];
    }

    private static void cambioRecursivo(int cambio, int i, List<Integer> sistemaMonedas, int resultado[]) {
        // `i` es el índice que se utiliza para recorrer el sistema de monedas.
        // En `resultado[0]` se van acumulando los resultados de las llamadas recursivas.
        // CÓDIGO A COMPLETAR
    }

}
