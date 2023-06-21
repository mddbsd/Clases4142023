public class Repaso3_1 {
    public static void main(String[] args){
        String[] prods = {"teclados", "mouses", "parlantes"};
        double[][] prodsVal = {{1600, 3, 0},
                               {1290, 8, 0},
                               {800,  5, 0}};
        int op;
        boolean flag = true;
        do{
            op = MostrarMenu(); //llamada  a la funcion menu
            while(op < 1 || op > 4){
                System.out.println("Opcion incorrecta, ingrese nuevamente");
                op = MostrarMenu();
            }
            switch(op){
                case 1:
                    MuestraStocks(prods, prodsVal);
                    break;
                case 2:
                    CalculaCostos(prodsVal);
                    System.out.println("Costos totales calculados");
                    break;
                case 3:
                    MuestraTotales(prods, prodsVal);
                    break;
                case 4:
                    flag = false;
                    break;
            }
        }while(flag);
    }//TERMINA LA FUNCION MAIN

    //CONMIENZA LA DECLARACION  DE FUNCIONES

    public static void MuestraStocks(String fProds[], double fProdsVal[][]){
        for(int i = 0; i < 3; i++){
            System.out.printf("Producto: %s Stock: %.0f\n", fProds[i], fProdsVal[i][1]);                    
        }
    } 
    
    public static int MostrarMenu(){
        System.out.println("***Menu de opciones***");
        System.out.println("1: mostrar productos y stock");
        System.out.println("2: calcular costos");
        System.out.println("3: mostrar costos totales");
        System.out.println("4: Salir");
        return Integer.parseInt(System.console().readLine());
    }
    
    public static void MuestraCostos(String pepe[], double pepaPig[][]){
        for(int i = 0; i < 3; i++){
            System.out.printf("Producto: %s Costo: %.0f\n", pepe[i], pepaPig[i][0]);
        }
    }

    public static void MuestraStockCostos(String ricardo[], double ford[][]){
        for(int i = 0; i < 3; i++){
            System.out.printf("Prodcuto: %s Stock: %.0f Costo: %.0f\n",ricardo[i], ford[i][1], ford[i][0]);
        }
    }

    public static void CalculaCostos(double marcelo[][]){
        for(int i = 0; i < 3; i++){
            marcelo[i][2] = marcelo[i][0] * marcelo[i][1];        
        }
    }

    public static void MuestraTotales(String prods[], double prodsVal[][]){
        double acumulador = 0;
        for(int i = 0; i < 3; i++){
            System.out.printf("Producto: %s costo total: %.0f\n", prods[i], prodsVal[i][2]);
            acumulador = acumulador + prodsVal[i][2];
        }
        System.out.println("---------------------------------");
        System.out.println("El valor total de las existencias es: " + acumulador);
    }
}
