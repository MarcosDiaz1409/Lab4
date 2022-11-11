import java.util.ArrayList;
import java.util.Scanner;

public class radio implements Funcionalidades{
    private String banda;
    private String frecuencia;
    private String emisora;
    private ArrayList<String> emisoras;
    private ArrayList<listas> albumes;
    private ArrayList<String> contactos;

    Scanner teclado = new Scanner(System.in);

    public radio() {
        banda = "";
        frecuencia = "";
        emisora = "";
        emisoras = new ArrayList<String>();
        albumes = new ArrayList<listas>();
        contactos = new ArrayList<String>();
    }


    public radio(String banda, String frecuencia, String emisora, ArrayList<String> emisoras, ArrayList<listas> albumes, ArrayList<String> contactos) {
        this.banda = banda;
        this.frecuencia = frecuencia;
        this.emisora = emisora;
        this.emisoras = emisoras;
        this.albumes = albumes;
        this.contactos = contactos;
    }


    public String getBanda() {
        return this.banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String getFrecuencia() {
        return this.frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getEmisora() {
        return this.emisora;
    }

    public void setEmisora(String emisora) {
        this.emisora = emisora;
    }

    public ArrayList<String> getEmisoras() {
        return this.emisoras;
    }

    public void setEmisoras(ArrayList<String> emisoras) {
        this.emisoras = emisoras;
    }

    public ArrayList<listas> getAlbumes() {
        return this.albumes;
    }

    public void setAlbumes(ArrayList<listas> albumes) {
        this.albumes = albumes;
    }

    public ArrayList<String> getContactos() {
        return this.contactos;
    }

    public void setContactos(ArrayList<String> contactos) {
        this.contactos = contactos;
    }


    @Override
    public String toString() {
        return
            "Banda: " + getBanda() + "\n" +
            "Frecuencia: " + getFrecuencia() + "\n" +
            "Emisora: " + getEmisora();
    }


    @Override
    public boolean encenderApagar() {
        String en;
        System.out.println("Desea encender la radio?");
        en = teclado.nextLine();
        if(en.equals("Si")){
            System.out.println("La radio esta encendidad");
        }else{
            System.out.println("La radio esta apagada");
        }
        return false;
    }


    @Override
    public int cambiarVolumen(){
        return 0;
    }


    @Override
    public boolean cambiarFMAM() {
        // TODO Auto-generated method stub
        return false;
    }


    @Override
    public float cambiarEmisora() {
        // TODO Auto-generated method stub
        return 0;
    }


    @Override
    public void guardarEmisora() {
        // TODO Auto-generated method stub
        
    }


    @Override
    public String cargarEmisora() {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public String seleccionarLista(int i) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public String cambiarCancion() {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public String escucharCancion() {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public boolean ConectDesconectTelefono() {
        // TODO Auto-generated method stub
        return false;
    }


    @Override
    public String MostrarContactos() {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public String llamarContactos(String numero) {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public String FinalizarLlamada() {
        // TODO Auto-generated method stub
        return null;
    }


    @Override
    public boolean CambiarSpeaker() {
        // TODO Auto-generated method stub
        return false;
    }


    @Override
    public String PlanificarViajes(String destino) {
        // TODO Auto-generated method stub
        return null;
    }

    


}