import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        MetBusqueda metodosBusqueda = new MetBusqueda();

        /*
         * int[] arreglo = {10,20,30,40,50,60,70,80,90,100};
         * metodosBusqueda.printArreglo(arreglo);
         * int posicion=metodosBusqueda.BusquedaSecuencial(arreglo,50);
         * if(posicion!= -1){
         * System.out.print("El elemento 50 se encuentra en la posicion: "+posicion);
         * }else{
         * System.out.print("Valor no se encuentra");
         * }
         */

        int[] arr = new int[100000];
        int valorBuscado = 50410;
        for (int i = 0; i < 100000; i++) {
            arr[i] = i;
        }

        System.out.println("Busqueda Secuencial");

        long startTimeS = System.nanoTime();
        int posicionS = metodosBusqueda.BusquedaSecuencial(arr, valorBuscado);
        long endTimeS = System.nanoTime();

        if (posicionS != -1) {
            System.out.println("El elemento: "  +  valorBuscado  +  "se encuentra en la posicion" + posicionS);
        } else {
            System.out.println(" Error, elemento no encontrado");

        }

        System.out.println("Busqueda Binaria");
        long startTimeB = System.nanoTime();
        int posicionB = metodosBusqueda.BusquedaBinaria(arr, valorBuscado);
        long endTimeB = System.nanoTime();

        
        if (posicionS != -1) {
            System.out.println("El elemento: "  +  valorBuscado  + "se encuentra en la posicion" + posicionB);
        } else {
            System.out.println(" Error, elemento no encontrado");

        }


        System.out.println("Duracion de busqueda Secuencial : " +  (endTimeS-startTimeS));
        System.out.println("Duracion de busqueda Binaria : " +  (endTimeB-startTimeB));
    }
    
}