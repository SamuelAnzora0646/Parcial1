public class Laptop extends Articulo{
    private String nombre;
    protected String modelo;
    protected String descripcion;
    protected float precio;

    public Laptop(String nombre, String modelo, String descripcion, float precio) {
        super(nombre, modelo, descripcion, precio);
    }

}
