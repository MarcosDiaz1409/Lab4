    /**
    * @Autor: Marcos Diaz y Diego Soto
      @Date: 11-11-2022
    * Interfase donde se desenvuelven todos los metodos a utilizar en la clase principal
    */

public interface Funcionalidades {
    /*
     * Este metodo realiza la funcion de apagar y encender la radio
     */
    public boolean encenderApagar(); 
    
    /*
     * Este metodo realiza la funcion de subir y bajar el volumen
     */
    public int cambiarVolumen(int volumen);

    /*
     * Este metodo realiza la funcion de cambiar de bande de FM a AM y viceversa
     */
    public String cambiarFMAM();

    /*
     * Este metodo realiza la funcion de cambiar de emisora
     */
    public double cambiarEmisora(double emi);

    /*
     * Este metodo realiza la funcion de guardar una emisora
     */
    public void guardarEmisora();

    /*
     * Este metodo realiza la funcion de cargar una emisora de las que han sido guardadas
     */
    public double cargarEmisora();

    /*
     * Este metodo realiza la funcion de seleccionar una lista de canciones ya existente
     */
    public String seleccionarLista(int i);

    /*
     * Este metodo realiza la funcion de cambiar una cancion
     */
    public String cambiarCancion();

    /*
     * Este metodo realiza la funcion de escuchar una cancion, mostrando toda la informacion importante acerca de la misma
     */
    public String escucharCancion();

    /*
     * Este metodo realiza la funcion de conectar y desconectar un telefono
     */
    public boolean ConectDesconectTelefono();

    /*
     * Este metodo realiza la funcion de mostrar todos los contactos del telefono conectado
     */
    public String MostrarContactos(); 

    /*
     * Este metodo realiza la funcion de llamar a uno de los contactos registrados del telefono
     */
    public String llamarContactos(String numero);

    /*
     * Este metodo realiza la funcion de finalizar una llamada en curso
     */
    public String FinalizarLlamada();

    /*
     * Este metodo realiza la funcion de cambiar de speaker a auriculares y viceversa
     */
    public boolean CambiarSpeaker();

    /*
     * Este metodo realiza la funcion de planificar un viaje, ingresando el destino al que se desee llegar
     */
    public String PlanificarViajes(String destino);
}
