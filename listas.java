import java.util.ArrayList;

public class listas {
    private String nombre;
    private ArrayList<cancion> canciones;


    public listas() {
        nombre = "";
        canciones = new ArrayList<cancion>();
    }


    public listas(String nombre, ArrayList<cancion> canciones) {
        this.nombre = nombre;
        this.canciones = canciones;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<cancion> getCanciones() {
        return this.canciones;
    }

    public void setCanciones(ArrayList<cancion> canciones) {
        this.canciones = canciones;
    }


    @Override
    public String toString() {
        return
            "Nombre de la lista: " + getNombre();
    }





}
