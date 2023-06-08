package org.pr2;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;


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
        // CÓDIGO A 
        /**
         * for (int moneda : sistemaMonedas) {
                if (moneda <= cambio) {
                    resultado += 1;
                    cambio -= moneda;
                }
            }
         * **/
        // CÓDIGO B
        for(int i = 0; i < sistemaMonedas.size(); i++){
            while (cambio > 0){
                cambio -= sistemaMonedas.get(i);
                resultado++;
            }
            if (cambio != 0){
                cambio += sistemaMonedas.get(i);
                resultado --;
            } 
        }


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

        cambioRecursivo(cambio, 0, sistemaMonedas, resultado);

        return resultado[0];
    }

    private static void cambioRecursivo(int cambio, int i, List<Integer> sistemaMonedas, int resultado[]) {
        // `i` es el índice que se utiliza para recorrer el sistema de monedas.
        // En `resultado[0]` se van acumulando los resultados de las llamadas recursivas.
        // CÓDIGO A COMPLETAR

        if (cambio == 0) {
            return;
        }

        if (i < sistemaMonedas.size() && sistemaMonedas.get(i) <= cambio) {
            // Si el valor de la moneda en el índice actual es menor o igual al cambio,
            // se puede utilizar esa moneda para el cambio.
            resultado[0]++;
            cambio -= sistemaMonedas.get(i);
        } else {
            // Si no se puede utilizar la moneda actual, se pasa al siguiente índice.
            i++;
        }

        // Llamada recursiva con el nuevo cambio y el siguiente índice.
        cambioRecursivo(cambio, i, sistemaMonedas, resultado);


    }

    /**
    * Dado un cambio de dinero y un sistema de monedas ordenado de mayor a menor * (todo en céntimos), devolver el número de monedas mínimo correspondiente al
    * cambio. Esta función debe ser implementada con expresiones lambda.
    * @param cambio
    * @param sistemaMonedas
    * @return el número mínimo de monedas.
    */
    public static int cambioLambda(int cambio, List<Integer> sistemaMonedas) {
        return sistemaMonedas.stream()
                            .reduce(0, (count, moneda) -> {
                                int numCoins = cambio / moneda;
                                cambio %= moneda;
                                return count + numCoins;
                            }, Integer::sum);
    }

}
