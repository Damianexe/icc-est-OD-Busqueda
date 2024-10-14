import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        MetBusqueda metodosBusqueda = new MetBusqueda();

        int[] arreglo = {10,20,30,40,50,60,70,80,90,100};

        metodosBusqueda.printArreglo(arreglo);

        int posicion=metodosBusqueda.BusquedaSecuencial(arreglo,50);


        if(posicion!= -1){
            System.out.print("El elemento 50 se encuentra en la posicion: "+posicion);

        }else{
            System.out.print("Valor no se encuentra");
        }
        

        int[]arr =new int[100000];
        int pos=metodosBusqueda.BusquedaSecuencial(arr, 50418);
        int pos1=metodosBusqueda.BusquedaBinaria(arr, 50418);
        for (int i= 0; i<arr.length+1;i++){
         System.out.println(i+ " " );
        }
        


    }
}
