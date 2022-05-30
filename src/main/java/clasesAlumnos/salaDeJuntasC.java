package clasesAlumnos;

public class salaDeJuntasC implements SalaDeJuntas{

    private static salaDeJuntasC instance;

    @Override
    public String getNombre() {
        return ("Sala C");
    }

    public static salaDeJuntasC getInstance(){
        if(instance == null){
            instance = new salaDeJuntasC();
        }
        return instance;
    }
}