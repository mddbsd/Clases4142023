public class Repaso3_1 {
    public static void main(String[] args){
        String[] prods = {"teclado", "mouse", "parlante", "monitor", "auricular", "gabinete"};
        double[][] prodsVal = {{1600, 3, 0},
                               {1290, 8, 0},
                               {800,  5, 0},
                               {12000, 2, 0},
                               {7000, 4, 0},
                               {10000, 8, 0}};
        int op;
        boolean flag = true;
        String producto;
        do{
            op = MostrarMenu(); //llamada  a la funcion menu
            while(op < 1 || op > 5){
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
                    System.out.println("Ingrese producto a buscar");
                    producto = System.console().readLine();
                    Buscar(prods,prodsVal,producto);
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }while(flag);
    }//TERMINA LA FUNCION MAIN

    //CONMIENZA LA DECLARACION  DE FUNCIONES

    public static void MuestraStocks(String fProds[], double fProdsVal[][]){
        for(int i = 0; i < fProds.length; i++){
            System.out.printf("Producto: %s Stock: %.0f\n", fProds[i], fProdsVal[i][1]);                    
        }
    } 
    
    public static int MostrarMenu(){
        System.out.println("***Menu de opciones***");
        System.out.println("1: mostrar productos y stock");
        System.out.println("2: calcular costos");
        System.out.println("3: mostrar costos totales");
        System.out.println("4: buscar precio");
        System.out.println("5: Salir");
        return Integer.parseInt(System.console().readLine());
    }
    
    public static void MuestraCostos(String pepe[], double pepaPig[][]){
        for(int i = 0; i < pepe.length; i++){
            System.out.printf("Producto: %s Costo: %.0f\n", pepe[i], pepaPig[i][0]);
        }
    }

    public static void MuestraStockCostos(String ricardo[], double ford[][]){
        for(int i = 0; i < ricardo.length; i++){
            System.out.printf("Prodcuto: %s Stock: %.0f Costo: %.0f\n",ricardo[i], ford[i][1], ford[i][0]);
        }
    }

    public static void CalculaCostos(double marcelo[][]){
        for(int i = 0; i < marcelo.length; i++){
            marcelo[i][2] = marcelo[i][0] * marcelo[i][1];        
        }
    }

    public static void MuestraTotales(String prods[], double prodsVal[][]){
        double acumulador = 0;
        for(int i = 0; i < prods.length; i++){
            acumulador = acumulador + prodsVal[i][2];
        }
        if(acumulador == 0){
            System.out.println("Los costos no estan inicializados");
        }else{
            for(int i = 0; i < prods.length; i++){
                System.out.printf("Producto: %s costo total: %.0f\n", prods[i], prodsVal[i][2]);
            }
            System.out.println("---------------------------------");
            System.out.println("El valor total de las existencias es: " + acumulador);
        }
    }

    public static void Buscar(String prods[], double matriz[][], String pBuscado){
        for(int i = 0; i < prods.length; i++){
            if(prods[i].equals(pBuscado)){
                System.out.println("Producto: " + prods[i] + " Precio: " + matriz[i][0]);
            }
        }
    }
}
