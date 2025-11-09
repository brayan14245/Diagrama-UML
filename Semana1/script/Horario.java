package Semana1.script;

public class Horario {
    private String dias;
    private String horas;
    
    public Horario(String dias, String horas) {
        this.dias = dias;
        this.horas = horas;
    }
    
    public String getDias() {
        return dias;
    }
    
    public void setDias(String dias) {
        this.dias = dias;
    }
    
    public String getHoras() {
        return horas;
    }
    
    public void setHoras(String horas) {
        this.horas = horas;
    }

    public String Formato(){
        return "Horario formato " + "dia: " + dias + "n/" + "hora: " + horas;
    } 
}
