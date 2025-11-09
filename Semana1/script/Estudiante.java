package Semana1.script;

public class Estudiante extends Usuario {
    private Horario horarioClases;
    private String Bloque;

    public Estudiante(String nombre, int id, String password, String Bloque) {
        super(nombre, id, password);
        this.Bloque = Bloque;
    }
    
    public Horario getHorarioClases() {
        return horarioClases;
    }
    
    public void setHorarioClases(Horario horarioClases) {
        this.horarioClases = horarioClases;
    }
    
    public String getBloque() {
        return Bloque;
    }
    
    public void setGrupo(String Bloque) {
        this.Bloque = Bloque;
    }
    
    public void subirTrabajos() {
        System.out.println("Estudiante " + getNombre() + " subiendo trabajos del Bloque " + Bloque);
    }
    
    public void actualizarInformacion() {
        System.out.println("Estudiante " + getNombre() + " actualizando información personal");
    }
    
    @Override
    public String toString() {
        return "Estudiante " +
                "nombre: " + getNombre() + "n/" +
                "id: " + getId() +
                "horarioClases " + horarioClases +
                "grupo: " + Bloque + "n/";
    }
}
