import java.util.Scanner;
public class Persona {
    protected String nombre;
    protected int edad;
    protected float estatura;

    public Persona() {
    }

    public Persona(String nombre, int edad ,float estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String getNombre() {
        return nombre;
    }

    public Persona(int edad) {
        this.edad = edad;
    }

    public Persona(float estatura) {
        this.estatura = estatura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    //metodo personalizado


    public String descripcion (){
        return ("Nombre: " +nombre);
    }

    public Persona copiar (){
        return new Persona(nombre);
    }

}