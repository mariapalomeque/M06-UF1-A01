import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
       
        boolean salir = false;
        int opcion;
       
        while(!salir){
           
            System.out.println("-- MENU --");
           
            System.out.println("1. Generar un nou encàrrec");
            System.out.println("2. Mostrar un encàrrec.");
            System.out.println("3. Salir");
           
            try{
           
            System.out.println("Inserte un numero que corresponda al menu: ");
            opcion = sn.nextInt();
           
            switch (opcion){
                case 1:
                    System.out.println("Generar un nou encàrrec");
                    break;
                case 2:
                    System.out.println("Mostrar un encàrrec.");
                    break;
                case 3:
                    salir=true;
                    break;   
                default:   
                   System.out.println("Las opciones son entre 1 y 3");
               
            }
            }
            catch(InputMismatchException e){
                System.out.println("Escoge una opcion del menu");
                sn.next();
            }
    }
   
                System.out.println("Sistema finalizado... ");
}
}   