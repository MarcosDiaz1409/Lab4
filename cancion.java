    /**
    * @Autor: Diego Soto
      @Date: 11-11-2022
    * Clase que describe las caracteristicas de una cancion
    */

public class cancion{
    private String nombre;
    private String duracion;
    private String autor;
    private String genero;

    /**
     * Parametros de la clase cancion
     * @param nombre almacena el nombre de la cancion
     * @param duracion almacena la duracion de la cancion
     * @param autor almacena el nombre del autor de la cancion
     * @param genero almacena el genero de la cancion
     */

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


    /**
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return String
     */
    public String getDuracion() {
        return this.duracion;
    }

    /**
     * @param duracion
     */
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    /**
     * @return String
     */
    public String getAutor() {
        return this.autor;
    }

    /**
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return String
     */
    public String getGenero() {
        return this.genero;
    }

    /**
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }


    /**
     * @return String
     */
    @Override
    public String toString() {
        return
            "Nombre: " + getNombre() + "\n" +
            "Duracion: " + getDuracion() + "\n" +
            "Autor: " + getAutor() + "\n" +
            "Genero: " + getGenero();
    }   
}