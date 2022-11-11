public interface Funcionalidades {
    public boolean encenderApagar(); 
    public int cambiarVolumen();
    public boolean cambiarFMAM();
    public float cambiarEmisora();
    public void guardarEmisora();
    public String cargarEmisora();
    public String seleccionarLista(int i);
    public String cambiarCancion();
    public String escucharCancion();
    public boolean ConectDesconectTelefono();
    public String MostrarContactos(); 
    public String llamarContactos(String numero);
    public String FinalizarLlamada();
    public boolean CambiarSpeaker();
    public String PlanificarViajes(String destino);
}
