package Semana1.script;

public class Main {

    public static void main(String[] args) {
        Horario horarioAdmin = new Horario("Lunes a Viernes", "9:00 AM - 5:00 PM");
        Horario horarioProfe = new Horario("Lunes, Miércoles y Viernes", "8:00 AM - 10:00 AM");
        Horario horarioEst = new Horario("Lunes a Viernes", "7:00 AM - 3:00 PM");

        Usuario usuarioBase = new Usuario("Juan Pérez", 123, "clave123");
        Administrador administrador = new Administrador("Laura Gómez", 10, "admin2025");
        Profesor docente = new Profesor("Carlos Rivas", 1001, "prof456", "Física");
        Estudiante alumno = new Estudiante("Ana Torres", 3001, "estu999", "Grupo B");

        administrador.setHorarioTrabajo(horarioAdmin);
        docente.setHorario(horarioProfe);
        alumno.setHorarioClases(horarioEst);

        System.out.println("==== ACCIONES DE USUARIO ====");
        usuarioBase.logear();
        usuarioBase.leerNota();

        System.out.println("\n==== FUNCIONES DE ADMINISTRADOR ====");
        administrador.logear();
        administrador.crearNota();
        administrador.agregarUsuarios();
        administrador.asignarPermisos();
        administrador.verListaUsuarios();

        System.out.println("\n==== FUNCIONES DE PROFESOR ====");
        docente.logear();
        docente.leerNota();
        docente.registrarNotas();
        docente.modificarNotas();
        docente.revisarNotas();

        System.out.println("\n==== FUNCIONES DE ESTUDIANTE ====");
        alumno.logear();
        alumno.leerNota();
        alumno.subirTrabajos();
        alumno.actualizarInformacion();

        System.out.println("\n==== DETALLES DE CADA USUARIO ====");
        System.out.println(usuarioBase);
        System.out.println(administrador);
        System.out.println(docente);
        System.out.println(alumno);

        System.out.println("\n==== PRUEBA DE POLIMORFISMO ====");
        Usuario[] listaUsuarios = {usuarioBase, administrador, docente, alumno};

        for (Usuario u : listaUsuarios) {
            System.out.println("Tipo de usuario: " + u.getClass().getSimpleName());
            u.logear();
            u.leerNota();
            System.out.println();
        }
    }
}













}
