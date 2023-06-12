public class OrdenamientoBurbujaClase {
    public static void main (String[] args){
        int[] array = new int[40];
        int n = array.length;
        int tmp;

        System.out.println("Array desordenado");
        for(int i = 0; i < n; i++){
            array[i] = (int)(Math.random()*100);
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        for(int i = 0; i < n - 1; i++){//Bucle para acceder a los elementos del array
            for(int j = 0; j < n - i - 1 ;j++){//Bucle para comparar con los elementos adyacentes
                if(array[j] > array[j + 1]){//Cambiar el > a < para ordenar de menor a mayor
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }

        System.out.println("Array Ordenado");
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("");

    }
}
