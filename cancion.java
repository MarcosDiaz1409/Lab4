public class cancion{
    private String nombre;
    private String duracion;
    private String autor;
    private String genero;


    public cancion() {
        nombre = "";
        duracion = "";
        autor = "";
        genero = "";
    }


    public cancion(String nombre, String duracion, String autor, String genero) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.autor = autor;
        this.genero = genero;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return this.duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    @Override
    public String toString() {
        return
            "Nombre: " + getNombre() + "\n" +
            "Duracion: " + getDuracion() + "\n" +
            "Autor: " + getAutor() + "\n" +
            "Genero: " + getGenero();
    }



    
}