public class OrdenamientoBurbuja {
    public static void main (String[] args){
        int[] array = {-2, 45, 0, 11, -9};
        int temporal;
        int n = array.length;
        System.out.println("Array desordenado:");
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }

        for(int i = 0; i < n - 1; i++){//Buccle para acceder a los elementos del array
            for(int j = 0; j < n - i - 1; j++){//Bucle para comparar los elementos adyacentes
                if(array[j] > array[j + 1]){//cambiar > a < para ordenar de mayor a menor
                    temporal = array[j];
                    array[j] = array [j + 1];
                    array[j + 1] = temporal;
                }
            }
        }

        System.out.println("Array Ordenado:");
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");

    }
}
