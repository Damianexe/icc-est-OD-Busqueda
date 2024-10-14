public class MetBusqueda {
    public int BusquedaSecuencial(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                return i;
            }
        }
        return -1;
    }


    public int BusquedaBinaria(int[]arreglo,int valorB){
        int inicio= 0;
        int fin = arreglo.length - 1;

        while(inicio <= fin){
            int medio =  inicio + (fin-inicio)/2;

            if (arreglo[medio]==valorB){
                //Elemento Encontrado
                return medio;
            }
            if(arreglo[medio]<valorB){
                inicio=medio+1;//Buscar en la mitad de la der
            }else{
                fin=medio-1;//Buscar en la mitad de la izq
            }
        }
        return -1;

    }

    public void printArreglo(int[] arreglo) {

        for (int elem : arreglo) {
            System.out.println(elem + "");
        }
    }
}
