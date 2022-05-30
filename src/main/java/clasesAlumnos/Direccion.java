package clasesAlumnos;

public class Direccion {
    private static Direccion instance;

    private Direccion(){}

    public static Direccion getInstance() {
        if(instance == null){
            instance = new Direccion();
        }

        return instance;
    }
}