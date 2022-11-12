    /**
    * @Autor: Marcos Diaz y Diego Soto
      @Date: 11-11-2022
    * Esta clase describe las caracteristicas que tiene una radio de un carro clase A y tambien todas las funciones que puede realizar
    */

import java.util.ArrayList;
import java.util.Scanner;

public class radio implements Funcionalidades{
    private String banda;
    private String frecuencia;
    private String emisora;
    private ArrayList<String> emisoras;
    private ArrayList<listas> albumes;
    private String contactos[] = {"Luis Pedro...12345678", "Sebastian Perez...87654321", "Mercedes del Valle...42344289"};
    private boolean speaker;
    private boolean conect;
    private listas actual;
    private int canci;
    Scanner teclado = new Scanner(System.in);

    /**
     * Parametros de la clase radio
     * @param banda almacena la banda de la radio
     * @param frecuencia almacena la frecuencia de la radio
     * @param emisora almacena la emisora en la que se encuentra la radio
     * @param emisoras almacena las emisoras que deseen guardarse
     * @param albumes almacena las listas de reproduccion de la clase listas
     * @param contactos almacena los contactos que tiene el telefono conectado
     */
    

    public radio() {
        banda = "";
        frecuencia = "";
        emisora = "";
        emisoras = new ArrayList<String>();
        albumes = new ArrayList<listas>();
        actual = new listas();
        speaker = true;
        conect = false;
        canci = 0;
    }

    public radio(String banda, String frecuencia, String emisora, ArrayList<String> emisoras, ArrayList<listas> albumes, boolean speaker, boolean conect) {
        this.banda = banda;
        this.frecuencia = frecuencia;
        this.emisora = emisora;
        this.emisoras = emisoras;
        this.albumes = albumes;
        this.speaker = speaker;
        this.conect = conect;
    }

    /**
    * @return String
    */
    public String getBanda() {
        return this.banda;
    }

    /**
    * @param banda
    */
    public void setBanda(String banda) {
        this.banda = banda;
    }

    /**
    * @return String
    */
    public String getFrecuencia() {
        return this.frecuencia;
    }

    /**
    * @param frecuencia
    */
    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    /**
    * @return String
    */
    public String getEmisora() {
        return this.emisora;
    }

    /**
    * @param emisora
    */
    public void setEmisora(String emisora) {
        this.emisora = emisora;
    }

    /**
    * @return Arraylist<String>
    */
    public ArrayList<String> getEmisoras() {
        return this.emisoras;
    }

    /**
    * @param emisoras
    */
    public void setEmisoras(ArrayList<String> emisoras) {
        this.emisoras = emisoras;
    }

    /**
    * @return ArrayList<String>
    */
    public ArrayList<listas> getAlbumes() {
        return this.albumes;
    }

    /**
    * @param albumes
    */
    public void setAlbumes(ArrayList<listas> albumes) {
        this.albumes = albumes;
    }


    /**
    * @return String
    */
    @Override
    public String toString() {
        return
            "Banda: " + getBanda() + "\n" +
            "Frecuencia: " + getFrecuencia() + "\n" +
            "Emisora: " + getEmisora();
    }

    /**
     * Metodos de la interface funcionalidades
     */

    /**
    * @return boolean
    */
    @Override
    public boolean encenderApagar() {
        String en;
        boolean salir = false;
        System.out.println("Desea apagar la radio?");
        en = teclado.nextLine();
        if(en.equals("Si")){
            System.out.println("La radio se apagara");
            salir = true;
        }else{
            System.out.println("La radio esta encendida");
            salir = false;
        }
        return salir;
    }


    /**
    * @return int
    */
    @Override
    public int cambiarVolumen(int volumen) {
        int a = 0;
        System.out.println("1. Subir Volumen\n   2.Bajar volumen");
        a = Integer.parseInt(teclado.nextLine());
        if(a == 1){
            System.out.println("Subiendo Volumen....");
            volumen = volumen + 1;
            System.out.println("El nivel del volumen es:" + volumen);
        }else if(a == 2){
            if(volumen > 0){
                System.out.println("Bajando Volumen...");
                volumen = volumen - 1;
                System.out.println("El nivel del volumen es:" + volumen);
            }else{
                System.out.println("No es posible bajar mas el volumen, limite alcanzado");
                volumen = volumen + 0;
                System.out.println("El nivel del volumen es:" + volumen);
            }
        }else{
            System.out.println("Error, entrada incorrecta");
            volumen = volumen + 0;
            System.out.println("El nivel del volumen es:" + volumen);
        }
        return volumen;
    }


    /**
    * @return String
    */
    @Override
    public String cambiarFMAM(){
        System.out.println("Ingrese su banda actual: ");
        String banda = teclado.nextLine();
        if(banda.equals("FM")){
            System.out.println("Cambiando....");
            banda = "AM";
            System.out.println("Su banda ha cambiado a: " + banda);
        }else if(banda.equals("AM")){
            System.out.println("Cambiando....");
            banda = "FM";
            System.out.println("Su banda ha cambiado a: " + banda + "\n");
        }else{
            System.out.println("La banda no es correcta");
        }
        return banda;
    }


    /**
    * @return double
    */
    @Override
    public double cambiarEmisora(double emi) {
        System.out.println("1. Subir de emisora");
        System.out.println("2. Bajar de emisora");
        int opem = Integer.parseInt(teclado.nextLine());
        if(opem == 1){
            emi = emi + 0.5;
            System.out.println("Tu emisora actual es: " + emi);
        }else if(opem == 2){
            emi = emi - 0.5;
            System.out.println("Tu emisora actual es: " + emi);
        }else{
            System.out.println("Entrada incorrecta");
        }
        return emi;
    }


    /**
    * @return void
    */
    @Override
    public void guardarEmisora() {
        System.out.println("Ingrese la emisora que desea guardar:");
        String emis = teclado.nextLine();
        emisoras.add(emis);
        System.out.println("Tu emisora ha sido guardada!");
    }


    /**
    * @return double
    */
    @Override
    public double cargarEmisora() {
        System.out.println("Que emisora deseas cargar?");
        double nuevaemisora = Integer.parseInt(teclado.nextLine());
        System.out.println("Tu emisora actual es: " + nuevaemisora);
        return nuevaemisora;
    }


    /**
    * @return String
    */
    @Override
    public String seleccionarLista(int i) {
        // TODO Auto-generated method stub
        actual = albumes.get(i-1);
        return "Se selecciono una lista de reproduccion";
    }


    /**
    * @return String
    */
    @Override
    public String cambiarCancion() {
        // TODO Auto-generated method stub
        if(canci==0){
            canci = 1;
        }
        else{
            canci = 0;
        }
        return "\nSe cambio la cancion";
    }


    /**
    * @return String
    */
    @Override
    public String escucharCancion() {
        // TODO Auto-generated method stub
        return "\nEscuchando: " + "\n" + actual.getCanciones().get(canci).toString();
    }


    /**
    * @return boolean
    */
    @Override
    public boolean ConectDesconectTelefono() {
        // TODO Auto-generated method stub
        if (conect){
            conect = false;
        }
        else{
            conect = true;
        }
        return conect;
    }

    /**
    * @return String
    */
    @Override
    public String MostrarContactos() {
        // TODO Auto-generated method stub
        String resultado = "\n=== Contactos ===\n";
        for(String contacto : contactos){
            resultado = resultado +contacto+"\n";
        }
        return resultado ;
    }


    /**
    * @return String
    */
    @Override
    public String llamarContactos(String numero) {
        // TODO Auto-generated method stub
        String resultado = "Se esta llamando al numero: "+numero+" de su lista de contactos";
        return resultado;
    }


    /**
    * @return String
    */
    @Override
    public String FinalizarLlamada() {
        // TODO Auto-generated method stub
        String resultado = "Se finalizo la llamada";
        return resultado;
    }


    /**
    * @return boolean
    */
    @Override
    public boolean CambiarSpeaker() {
        // TODO Auto-generated method stub
        if (speaker){
            speaker = false;
        }
        else{
            speaker = true;
        }
        return speaker;
    }


    /**
    * @return String
    */
    @Override
    public String PlanificarViajes(String destino) {
        // TODO Auto-generated method stub
        String resultado = "Se ha planificado su viaje a "+destino;
        return resultado;
    }

    /**
    * @return void
    */
    public void crearlistas(){
        
        ArrayList<cancion> lista1 = new ArrayList<cancion>();
        ArrayList<cancion> lista2 = new ArrayList<cancion>();
        cancion ca1 = new cancion("Natural", "3:30", "Imagine Dragons", "pop");
        cancion ca2 = new cancion("The Search", "4:30", "NF", "rap");
        cancion ca3 = new cancion("Humble", "3:00", "Kendrick Lamar", "rap");
        cancion ca4 = new cancion("A Milli", "Lil Wayne", "4:30", "rap");
        lista1.add(ca1);
        lista1.add(ca2);
        lista2.add(ca3);
        lista2.add(ca4);
        listas lis1 = new listas("Musica ingles", lista1);
        listas lis2 = new listas("Rap", lista2);
        albumes.add(lis1);
        albumes.add(lis2);
    }

    /**
    * @return String
    */
    public String desplegar(){
        albumes = new ArrayList<listas>();
        crearlistas();
        int i = 1;
        String resultado = "";
        for(listas lista : albumes){
            resultado = resultado + "\n" + i +". "+lista.toString();
            i++;
        }
        return resultado;
    }
}