package poo;

public class Corredores {

    public static void main(String[] arguments) {

        int corredor, tiempo, i, j;

        int[] arrayCorredores = new int[2];
        int[] arrayTiempos = new int[2];
        for (i = 0; i < arrayCorredores.length; i++) {
            System.out.println("Digite el Nombre del corredor: " + i);
            corredor = Integer.parseInt(System.console().readLine());
            arrayCorredores[i] = corredor;
        }
        for (j = 0; j < arrayTiempos.length; j++) {
            System.out.println("Digite el tiempo del corredor" + j);
            tiempo = Integer.parseInt(System.console().readLine());
            arrayTiempos[i] = tiempo;
        }
        ordenarTiempos(arrayTiempos);
        for (j = 0; j < arrayTiempos.length; j++) {
            System.out.println("Tiempo: " + j);
        }

    }

    public static void ordenarTiempos(int[] arreglo) {
        //buscar en cada uno  los elementos del arreglo
        for (int i = 0; i < arreglo.length - 1; i++) {
            int max = i;

            //buscamos el mayor número
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] > arreglo[max]) {
                    max = j;    //encontramos el mayor número
                }
            }

            if (i != max) {
                //permutamos los valores
                int aux = arreglo[i];
                arreglo[i] = arreglo[max];
                arreglo[max] = aux;
            }
        }
    }
}