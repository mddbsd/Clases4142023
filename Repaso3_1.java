public class Repaso3_1 {
    public static void main(String[] args){
        String[] prods = {"teclados", "mouses", "parlantes"};
        double[][] prodsVal = {{1600, 3, 0},
                               {1290, 8, 0},
                               {800,  5, 0}};
        int op;
        op = MostrarMenu(); //llamada  a la funcion menu
        while(op < 1 || op > 3){
            System.out.println("Opcion incorrecta, ingrese nuevamente");
            op = MostrarMenu();
        }
        switch(op){
            case 1:
                MuestraStocks(prods, prodsVal);
                break;
            case 2:
                MuestraCostos(prods, prodsVal);
                break;
            case 3:
                MuestraStockCostos(prods, prodsVal);
                break;
            default:

        } 
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

}
