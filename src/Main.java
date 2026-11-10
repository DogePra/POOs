
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Persona p = new Persona();
        Persona p1 = new Persona("Ana");
        Persona p2 = new Persona("Andres", 25, 1.60f);

        System.out.println("List");
        List<Persona> lista = new ArrayList<>();

        lista.add(p);
        lista.add(p1);
        lista.add(p2);
        lista.add(new Persona("Pepe", 46, 1.70f));
        lista.add(new Persona("Vero", 16, 1.50f));

        System.out.println("Listado de personas");
        for (Persona n : lista) {
            System.out.println(n.descripcion());
        }

        lista.get(1).setEdad(18);
        System.out.println(lista.get(1).descripcion());

        System.out.println("Set");
        Set<String> nombres = new HashSet<>();

        nombres.add("Mateo");
        nombres.add("Javier");
        nombres.add("Irene");
        nombres.add("Michael");
        nombres.add("Mateo");

        System.out.println("NOMBRES UNICOS SIN UN ORDEN GARANTIZADO: " + nombres);

        Set<Persona> nombres2 = new HashSet<>();

        nombres2.add(new Persona("Pepe", 46, 1.70f));
        nombres2.add(new Persona("Vero", 16, 1.50f));
        nombres2.add(new Persona("Tola", 46, 1.60f));
        nombres2.add(new Persona("Maria", 46, 1.70f));
        nombres2.add(new Persona("Pepe", 46, 1.70f));

        System.out.println("---------------------");

        for (Persona n : nombres2) {
            System.out.println(n.descripcion());
        }

        Map<String, Persona> codigounico = new HashMap<>();

        codigounico.put("c01", p);
        codigounico.put("c02", p1);
        codigounico.put("c03", p2);
        codigounico.put("c04", lista.get(4));

        System.out.println("Codigo unico 01: " + codigounico.get("c01").descripcion());

        // LLAMAMOS A LA FUNCION
        ingresarPersonas(lista, sc);

    }

    public static void ingresarPersonas(List<Persona> lista, Scanner sc) {

        int opcion = 1;

        do{

            System.out.println("Ingrese 1 para agregar una persona o 0 para salir:");
            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {

                System.out.println("Ingrese el nombre:");
                String nombre = sc.next();

                System.out.println("Ingrese la edad:");
                int edad = sc.nextInt();

                System.out.println("Ingrese la estatura:");
                float estatura = sc.nextFloat();
                sc.nextLine();

                lista.add(new Persona(nombre, edad, estatura));
                System.out.println("Persona ingresada con exito");
            }
        }while (opcion !=0);
        System.out.println("Saliendo del sistema....");


    }
}
