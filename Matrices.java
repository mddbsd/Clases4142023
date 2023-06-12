public class Matrices {
    public static void main(String[] args){
        int[][] matriz = new int[5][5];

        System.out.println("Matriz Desordenada");
        for(int i = 0; i < 5; i++){//inicializa matriz
            for(int j = 0; j < 5; j++){
                matriz[i][j] = (int)(Math.random()*100);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    
        for(int i = 0; i < 5; i++){//buclle de acceso
            for(int j = 0; j < 5; j++){
                for(int x = 0; x < 5; x++){//bucle de comparacion
                    for(int y = 0; y < 5; y++){
                        if(matriz[i][j] < matriz[x][y]){ //comparacion y ordenamiento
                            int temp = matriz[i][j];
                            matriz[i][j] = matriz[x][y];
                            matriz[x][y] = temp;
                        }
                    }
                }
            }
        }

        System.out.println("Matriz Ordenada");
        for(int i = 0; i < 5; i++){//Muestra la matriz
            for(int j = 0; j < 5; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
