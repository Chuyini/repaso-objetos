package clasesAlumnos;

public class salaDeJuntasA implements SalaDeJuntas{

    private static salaDeJuntasA instance;

    @Override
    public String getNombre() {
        return ("Sala A");
    }

    public static salaDeJuntasA getInstance(){
        if(instance == null){
            instance = new salaDeJuntasA();
        }
        return instance;
    }
}