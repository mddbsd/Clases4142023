public class MatricesClase {
    //ESTA ES LA FUNCION PRINCIPAL
    public static void main(String[] args){
        int[][] matrizNull = new int[3][3];
        int[][] matrizNoNull = {{1,2,3},{4,5,6},{7,8,9}};
        int num1;
        int num2;
        int resultado;
        String palabra;

        for(int i = 0; i < 3; i++){//inicializacion de la matriz
            for(int j = 0; j < 3; j++){
                matrizNull[i][j] = (int)(Math.random() * 10);
            }            
        }

        System.out.println("Ingrese un numero");
        num1 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese otro numero");
        num2 = Integer.parseInt(System.console().readLine());
        System.out.println("ingrese una palabra");
        palabra = System.console().readLine();

        resultado = SumaDosNumeros(num1, num2, palabra);
        System.out.println(resultado);
        

        //System.out.println(SumaDosNumeros(num1, num2));
        
        HolaMundo();
    }    
    //ACA COMIENZA LA DECLARACION DE FUNCIONES
    public static void HolaMundo(){
        System.out.println("Hola Mundo");
    }

    public static int SumaDosNumeros(int a, int b, String c){
        int resultadoFuncion;
        resultadoFuncion = a + b;
        System.out.println("La palabra ingresada fue: " + c);
        return resultadoFuncion;
    }

}
