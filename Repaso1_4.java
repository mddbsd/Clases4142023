public class Repaso1_4 {
    public static void main(String[] args){
        int variableComparacion;
        int variableUsuario;
        variableComparacion = 10;
        System.out.println("Ingrese un numero");
        variableUsuario = Integer.parseInt(System.console().readLine());
        if(variableUsuario == variableComparacion){
            System.out.println("El numero ingresado es igual a 10");
        }else if(variableUsuario < variableComparacion){
            System.out.println("El numero ingresado es menor a 10");
        }else{
            System.out.println("El numero ingresado es mayor a 10");
        }
        System.out.println("Fin de ejecucion");
    }
}
