package Exercises.SportType;

public enum SportType {
    SOCCER("Juego de equipo con 11 jugadores"),
    BASKETBALL("Juego de equipo con 5 jugadores por lado"),
    TENNIS("Juego individual o en parejas"),
    SWIMMING ("Competendia en el agua"),
    CYCLING ("Carrera en bicicleta");

    private String description;

    SportType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}