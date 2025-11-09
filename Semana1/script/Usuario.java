package Semana1.script;

public class Usuario {
    private String nombre;
    private int id;
    private String password;

    public Usuario(String nombre, int id, String password) {
        this.nombre = nombre;
        this.id = id;
        this.password = password;
    }
    public String getNombre() {
        return nombre;
    }
    public void leerNota() {
        System.out.println("Leyendo nota...");
    }
    public void logear() {
        System.out.println("Usuario " + nombre + " logeado.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
