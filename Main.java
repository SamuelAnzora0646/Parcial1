import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Inventario{
    private static ArrayList<Articulo> articulos = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        Telefono telefono1 = new Telefono("Samsum","A03", "Telefono smart", 200 );
        Laptop laptop1 = new Laptop("Lenovo","Idepad1", "Portatil de escritorio", 5000);

        articulos.add(telefono1);
        articulos.add(laptop1);



        System.out.println("Bienvenido ");
        //Codigo a repetir y capturar error
        try {
            do {
                System.out.println("Que desea realizar");
                System.out.println("1. Registrar producto");
                System.out.println("2. Mostrar Inventario");
                System.out.println("3. Modificar productos");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opcion: ");
                opcion = sc.nextInt();
                //Opciones de usuario
                switch (opcion) {
                    case 1:
                        registrarProductos();
                        break;
                    case 2:
                        mostrarInventario(articulos);
                        break;
                    case 3:
                        modificarProductos();
                        break;
                    case 4:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            } while (opcion != 4);
        }catch (Exception e){
            System.out.println(e);
        }
    }


    public static void registrarProductos(){
        Articulo articulo = new Articulo();
        System.out.println("Ingrese nombre del articulo");
        articulo.nombre = Main.sc.next();
        System.out.println("Ingrese el modelo");
        articulo.modelo = Main.sc.next();
        System.out.println("Ingrese descripcion del articulo");
        articulo.descripcion = Main.sc.next();
        System.out.println("Ingrese precio");
        articulo.precio = Main.sc.nextFloat();
        articulos.add(articulo);

    };
    public static void modificarProductos(){
        int opcion = 1-1;
        System.out.println("Ingrese id del producto");
        sc.nextInt();
        System.out.println("Modificar nombre");
        articulos.get(opcion).nombre = sc.next();
        System.out.println("Modificar modelo");
        articulos.get(opcion).modelo = sc.next();
        System.out.println("Modificar descripcion");
        articulos.get(opcion).descripcion = sc.next();
        System.out.println("Modificar precio");
        articulos.get(opcion).precio = sc.nextInt();


    };
    public static void mostrarInventario(ArrayList<Articulo> articulos){
        System.out.println();
        int i = 1;
        for (Articulo articulo: articulos){
            System.out.println("Id producto" + " " + i++);
            System.out.println(articulo.nombre);
            System.out.println(articulo.descripcion);
            System.out.println(articulo.modelo);
            System.out.println(articulo.precio);
            System.out.println();
        }
    };

}