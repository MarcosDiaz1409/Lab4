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
        
        int op = 0;
        String menu = "\nBienvenido a la radio, funciones: \n1. Apagar radio \n2. Subir volumen \n3. Bajar volumen \n4. Modo radio \n5. Modo reproduccion \n6. Modo telefono \n7. Modo productividad";

        /**
         * Menu con todas las opciones que el usuario puede escoger
         */

        while(!salir){
            try {
                System.out.println("Desea encender la radio?");
                int op1 =0;
                System.out.println("1. Si \n2. No\n");
                op1 = teclado.nextInt();
                teclado.nextLine();
                switch(op1){
                    case 1: {
                        boolean salir1 = false;
                        while(!salir1){
                            
                            System.out.println(menu);
                            System.out.println("\nIngrese una opcion");
                            op = teclado.nextInt();
                            teclado.nextLine();
                            switch(op){
                                case 1: {
                                    salir1 = true;
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
                                    boolean salir2 = false;
                                    while(!salir2){
                                        System.out.println("1. Seleccionar Lista \n2. Cambiar cancion \n3.Eschuchar cancion \n4. Salir");
                                        int op2 = teclado.nextInt();
                                        teclado.nextLine();
                                        switch(op2){
                                            case 1: {
                                                break;
                                            }

                                            case 2: {
                                                break;
                                            }

                                            case 3: {
                                                break;
                                            }
                                        }
                                    }
                                    break;
                                }
    
                                case 6: {
                                    boolean salir3 = false;
                                    while(!salir3){
                                        System.out.println("\n1. Conectar/Desconectar telefono \n2. Mostrar contactos \n3. Llamar contacto \n4. Cambiar a speaker o auriculares \n5. Salir");
                                        int op3 = teclado.nextInt();
                                        teclado.nextLine();
                                        switch(op3){
                                            case 1: {
                                                if (radio.ConectDesconectTelefono()){
                                                    System.out.println("Desconectando telefono...");
                                                }
                                                else{
                                                    System.out.println("Conectando telefono...");
                                                }
                                                break;
                                            }

                                            case 2: {
                                                System.out.println(radio.MostrarContactos());
                                                break;
                                            }

                                            case 3: {
                                                System.out.println(radio.MostrarContactos());
                                                System.out.println("Ingrese el numero de telefono de su contacto");
                                                int num = teclado.nextInt();
                                                String numero = String.valueOf(num); 
                                                System.out.println(radio.llamarContactos(numero));
                                                System.out.println("\n1. Finalizar llamada");
                                                System.out.println("Seleccione una opcion");
                                                int op5 = teclado.nextInt();
                                                System.out.println(radio.FinalizarLlamada());
                                                break;
                                            }

                                            case 4: {
                                                if (radio.CambiarSpeaker()){
                                                    System.out.println("Cambiando a auriculares...");
                                                }
                                                else{
                                                    System.out.println("Cambiando a speaker...");
                                                }
                                                break;
                                            }

                                            case 5: {
                                                salir3 = true;
                                                break;
                                            }

                                            default: {
                                                System.out.println("La entrada es incorrecta");
                                            }
                                        }
                                    }
                                    break;
                                }
    
                                case 7: {
                                    boolean salir4 = false;
                                    while(!salir4){
                                        System.out.println("\n1. Planificar Viaje \n2. Salir");
                                        System.out.println("Seleccione una opcion");
                                        int op4 = teclado.nextInt();
                                        teclado.nextLine();
                                        switch(op4){
                                            case 1: {
                                                System.out.println("Ingrese su destino: ");
                                                String destino = teclado.nextLine();
                                                System.out.println(radio.PlanificarViajes(destino));
                                                break;
                                            }

                                            case 2: {
                                                salir4 = true;
                                                break;
                                            }

                                        }
                                    }
                                    break;
                                }
    
                                default: {
                                    System.out.println("Ingrese una opcion entre 1-7");
                                    break;
                                }

                            }
                        }
                        break;
                    }

                    case 2: {
                        salir = true;
                        break;
                    }
                }
                
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(" La entrada es incorrecta/la opcion no existe, porfavor verifica lo que ingresaste");
            }
        }

        

    }
}