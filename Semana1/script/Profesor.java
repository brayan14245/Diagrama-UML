package Semana1.script;

public class Profesor extends Usuario {
    private String materiaDada;
    private Horario horarioClases;
    
    public Profesor(String nombre, int id, String password, String materiaDada) {
        super(nombre, id, password);
        this.materiaDada = materiaDada;

    }
    
    public String getmateriaDada() {
        return materiaDada;
    }

    public void materiaDada(String materiaDada) {
        this.materiaDada = materiaDada;
    }

    public void registrarNotas() {
        System.out.println("El profesor " + getNombre() + " está registrando notas en " + materiaDada);
    }

    public void modificarNotas() {
        System.out.println("El profesor " + getNombre() + " está actualizando las calificaciones de sus estudiantes");
    }

    public void eliminarNotas() {
        System.out.println("El profesor " + getNombre() + " ha eliminado algunas notas");
    }

    public void revisarNotas() {
        System.out.println("El profesor " + getNombre() + " revisa las notas actuales de " + materiaDada);
    }

    public Horario getHorarioClases() {
        return horarioClases;
    }

    public void setHorarioClases(Horario horarioClases) {
        this.horarioClases = horarioClases;
    }

}