public class Repaso2_1 {
    public static void main(String[] args){
        String[] nombres = new String[5]; 
        int[][] notas = new int[5][4];
        int nota;
        int acumulador;
        for(int i = 0; i < 5; i ++){
            acumulador = 0;
            System.out.println("ingrese nombre");
            nombres[i] = System.console().readLine();
            for(int j = 0; j < 3; j++){
                System.out.println("ingrese nota " + (j + 1));
                nota = Integer.parseInt(System.console().readLine());
                while(nota < 0 || nota > 10){
                    System.out.println("Nota invalida, debe estar entre 0 y 10");
                    System.out.println("ingrese nota " + (j + 1));
                    nota = Integer.parseInt(System.console().readLine());
                }
                acumulador = acumulador + nota;
                notas[i][j] = nota;
            }
            notas[i][3] = (int)(acumulador / 3);
        }

        for(int i = 0; i < 5; i ++){
            System.out.printf("Nombre: %s", nombres[i]);
            for(int j = 0; j < 3; j ++){
                System.out.printf(" Nota%d: %d", j + 1, notas[i][j]);
            }
            System.out.printf(" Promedio: %d", notas[i][3]);
            System.out.println();
        }
    }
}
