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
    Scanner teclado = new Scanner(System.in);

    public radio() {
        banda = "";
        frecuencia = "";
        emisora = "";
        emisoras = new ArrayList<String>();
        albumes = new ArrayList<listas>();
        speaker = true;
        conect = false;
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


    @Override
    public void guardarEmisora() {
        System.out.println("Ingrese la emisora que desea guardar:");
        String emis = teclado.nextLine();
        emisoras.add(emis);
        System.out.println("Tu emisora ha sido guardada!");
    }


    @Override
    public double cargarEmisora() {
        System.out.println("Que emisora deseas cargar?");
        double nuevaemisora = Integer.parseInt(teclado.nextLine());
        System.out.println("Tu emisora actual es: " + nuevaemisora);
        return nuevaemisora;
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
        if (conect){
            conect = false;
        }
        else{
            conect = true;
        }
        return conect;
    }


    @Override
    public String MostrarContactos() {
        // TODO Auto-generated method stub
        String resultado = "\n=== Contactos ===\n";
        for(String contacto : contactos){
            resultado = resultado +contacto+"\n";
        }
        return resultado ;
    }


    @Override
    public String llamarContactos(String numero) {
        // TODO Auto-generated method stub
        String resultado = "Se esta llamando al numero: "+numero+" de su lista de contactos";
        return resultado;
    }


    @Override
    public String FinalizarLlamada() {
        // TODO Auto-generated method stub
        String resultado = "Se finalizo la llamada";
        return resultado;
    }


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


    @Override
    public String PlanificarViajes(String destino) {
        // TODO Auto-generated method stub
        String resultado = "Se ha planificado su viaje a "+destino;
        return resultado;
    }
}