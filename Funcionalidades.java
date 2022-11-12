public interface Funcionalidades {
    public boolean encenderApagar(); 
    public int cambiarVolumen(int volumen);
    public String cambiarFMAM();
    public double cambiarEmisora(double emi);
    public void guardarEmisora();
    public double cargarEmisora();
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
