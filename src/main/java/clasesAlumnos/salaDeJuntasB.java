package clasesAlumnos;

public class salaDeJuntasB implements SalaDeJuntas {

    private static salaDeJuntasB instance;

    @Override
    public String getNombre() {
        return ("Sala B");
    }

    public static salaDeJuntasB getInstance() {
        if (instance == null) {
            instance = new salaDeJuntasB();
        }
        return instance;
    }
}
