    /**
    * @Autor: Marcos Diaz y Diego Soto
      @Date: 11-11-2022
    * Clase principal donde el usuario interactua con el programa
    */

import java.util.ArrayList;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        radio radio = new radio();
        boolean salir = false;
        boolean salir1 = false;
        boolean salirfp = false;
        int op = 0;
        int op1 = 0;
        //String menu = "Bienvenido a la radio, funciones: \n1. Apagar radio \n2. Subir volumen \n3. Bajar volumen \n4.Modo radio \n5. Modo reproduccion \n6. Modo telefono \n7. Modo productividad";

        /**
         * Menu con todas las opciones que el usuario puede escoger
         */

        while(!salir){
            try {
                System.out.println("Desea encender la radio?");
                System.out.println("1. Si \n2. No\n");
                op1 = teclado.nextInt();
                teclado.nextLine();
                switch(op1){
                    case 1: {
                        while(!salir1){
                            //System.out.println(menu);
                            System.out.println(" Bienvenido a la radio, a continuacion se te presentan las siguientes opciones:\n");
                            System.out.println("1. Funciones principales");
                            System.out.println("2. Modo Radio");
                            System.out.println("3. Modo Reproduccion");
                            System.out.println("4. Modo Telefono");
                            System.out.println("5. Modo productividad");
                            System.out.println("6. Salir");
                            System.out.println("Porfavor elije una opcion:");
                            op = Integer.parseInt(teclado.nextLine());
            
                            switch(op){
                                case 1: {
                                    while(!salirfp){
                                        System.out.println("1. Encender o apagar la radio");
                                        System.out.println("2. Cambiar volumen");
                                        System.out.println("3. Salir");
                                        System.out.println("Ingrese la funcion que desee realizar:");
                                        op1 = Integer.parseInt(teclado.nextLine());
                                        if(op1 == 1){
                                            
                                        }
                                        if(op1 == 2){
                                            
                                        }
                                        if(op1 == 3){
                                            salirfp = true;
                                        }
                                        else{
                                            System.out.println("Error, opcion no valida, porfavor verifique su respuesta");
                                        }
                                    }
                                    break;
                                }
                                
                                case 2: {
                                    break;
                                }
    
                                case 3: {
                                    break;
                                }
                                
                                case 4: {
                                    break;
                                }
    
                                case 5: {
                                    break;
                                }

                                case 6: {
                                    System.out.println("Saliendo del menu....");
                                    salir1 = true;
                                    break;
                                }
    
                                default: {
                                    System.out.println("Ingrese una opcion entre 1-7");
                                    break;
                                }

                            }
                        }
                    }
                    case 2:{
                        System.out.println("Estado de la radio: apagada");
                        salir = true;
                    }
                }

    
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(" La entrada es incorrecta/la opcion no existe, porfavor verifica lo que ingresaste");
            }
        }

        if (radio.CambiarSpeaker()){
            System.out.println("Cambiando a speaker...");
        }
        else{
            System.out.println("Cambiando a auriculares...");
        }

    }
}