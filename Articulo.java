public abstract class Articulo {
    protected String nombre;
    protected String modelo;
    protected String descripcion;
    protected float precio;

    //Constructor vacio
    public Articulo(){};
    public Articulo(String nombre, String modelo, String descripcion, float precio){
        this.nombre = nombre;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
    };

    //Getters
    public String getNombre() {
        return this.nombre;
    }

    public String getModelo() {
        return this.modelo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public float getPrecio() {
        return this.precio;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
