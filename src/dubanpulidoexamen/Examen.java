public class Examen {

    public static void main(String[] args) {

        // Devolver array
        int[] numeros = UtilidadesExamen.crearArray("Introduce el tamaño del array entre 1 y 10.");

        // Mostrar el array
        UtilidadesExamen.mostrarArray(numeros);

        // Cacular el promedio de los numeros
        int promedio = UtilidadesExamen.promedio(numeros);
        System.out.println("El promedio de los numeros es: " + promedio);

        // Encontrar el numero minimo y el numero maximo
        int[] valoresMaximosMinimos = UtilidadesExamen.encontrarExtremos(numeros);
        System.out.println("El valor maximo es: " + valoresMaximosMinimos[0] + ", y el valor minimo es: "

                + valoresMaximosMinimos[1]);

        // Mayores que el promedio.
        int[] mayoresQuePromedio = UtilidadesExamen.filtrarMayoresQueElPromedio(numeros, promedio);
        UtilidadesExamen.mostrarArray(mayoresQuePromedio);

    }

}
