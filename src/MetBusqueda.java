public class MetBusqueda {
    public int BusquedaSecuencial(int[] arreglo, int valorBuscado) {

        int cp=0;

        for (int i = 0; i < arreglo.length; i++) {
            cp++;
            if (arreglo[i] == valorBuscado) {
                System.out.println("Comparaciones Realizadas" +cp);
                return i;
            }
        }
        System.out.println("Comparaciones Realizadas: " +cp);
        return -1;
    }


    public int BusquedaBinaria(int[]arreglo,int valorB){
        int inicio= 0;
        int fin = arreglo.length - 1;
        int cmp=0;
        while(inicio <= fin){
            cmp++;
            int medio =  inicio + (fin-inicio)/2;

            if (arreglo[medio]==valorB){
                System.out.println("Comparaciones Realizadas: "+cmp);
                //Elemento Encontrado
                return medio;
            }
            if(arreglo[medio]<valorB){
                inicio=medio+1;//Buscar en la mitad de la der
            }else{
                fin=medio-1;//Buscar en la mitad de la izq
            }
        }
        System.out.println("Comparaciones Realizadas: "+cmp);
        return -1;

    }

    public void printArreglo(int[] arreglo) {

        for (int elem : arreglo) {
            System.out.println(elem + "");
        }
    }
}
