package previo1_semana6;

/*
 * INTEGRANTES:
 * 1. Nombres y apellidos: ______________________________________
 * 2. Nombres y apellidos: ______________________________________
 * 3. Nombres y apellidos: ______________________________________
 *
 * SEMANA 7 - PREVIO 1: REPASO SEMANA 6
 * Objetivo: recordar exploración lineal antes de estudiar chaining.
 */
public class Previo1ExploracionLineal {

    public static void main(String[] args) {
        int[] claves = {23, 44, 7, 18, 55, 9};
        Integer[] tabla = new Integer[7];

        for (int clave : claves) {
            int base = Math.floorMod(clave, tabla.length);
            // TODO 1: Calcular la posición base con clave % tamaño.
            int desplazamientos = 0;

            // TODO 2: Mientras la posición esté ocupada, avanzar linealmente.
            while(tabla[(base+desplazamientos)% tabla.length]!=null){
                desplazamientos++;
            }
            

            // TODO 3: Calcular la posición final e insertar la clave.
            int posicion = (base+desplazamientos) %tabla.length;
            tabla [posicion] = clave;
            

            // TODO 4: Mostrar clave, posición base, posición final y desplazamientos.
            
            System.out.printf("clave = %d | hash=%d | final = %d | desplazamientos=%d%n",clave, base,
                    posicion, desplazamientos);
        }

        // TODO 5: Recorrer e imprimir la tabla final.
        
        System.out.println("\nTabla final");
        for(int i = 0 ; i < tabla.length; i++){
            System.out.println(i + "->" + (tabla[i] == null ? "vacio": tabla[i]));
        }
    }
}
