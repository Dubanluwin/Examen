package dubanpulidoexamen;

import java.util.Scanner;

public class UtilidadesExamen {

    Scanner san = new Scanner(System.in);

    // Metodo para devoler el array
    public static int[] crearArray(String texto) {

        Scanner scan = new Scanner(System.in);
        System.out.println(texto);
        int tamanhoArray = scan.nextInt();
        int[] valores = new int[tamanhoArray];

        System.out.println("El tamaño que has seleccionado para el array es: " + tamanhoArray);

        for (int i = 0; i < valores.length; i++) {
            System.out.println("Ingresa el valor para la posicion: " + (i + 1));
            valores[i] = scan.nextInt();

        }
        return valores;
    }

    // Metodo que mostrará el array
    public static void mostrarArray(int[] valores) {
        for (int valor : valores) {
            System.out.println(valor + " ");
        }
    }

    public static int promedio(int[] valores) {

        for (int numero : valores) {
            System.out.println(numero);
        }
        int suma = 0;
        for (int numero : valores) {
            suma += numero;

        }
        int esPromedio = suma / valores.length;
        return esPromedio;

    }

    public static int[] encontrarExtremos(int[] valores) {

        int numMayor = 0;
        int numMenor = 0;
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > numMayor) {
                numMayor = valores[i];
            }
            if (valores[i] < numMenor) {
                numMenor = valores[i];
            }
        }

        int[] valoresMaximosMinimos = new int[2];
        valoresMaximosMinimos[0] = numMayor;
        valoresMaximosMinimos[1] = numMenor;

        return valoresMaximosMinimos;
    }

}
