package clasesAlumnos;

public class SalaDeJuntasFactory {
    public static SalaDeJuntas get(String sala) {
        return switch (sala) {
            case "Sala A" -> salaDeJuntasA.getInstance();
            case "Sala B" -> salaDeJuntasB.getInstance();
            case "Sala C" -> salaDeJuntasC.getInstance();
            default -> null;
        };
    }
}
