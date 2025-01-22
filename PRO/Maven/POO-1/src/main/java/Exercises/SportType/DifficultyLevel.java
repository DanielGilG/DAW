package Exercises.SportType;

public enum DifficultyLevel {
    BEGGINER(0d),
    INTERMIDIATE(0.1d),
    ADVANCED (0.2d);

    private double diffpercentil;

    DifficultyLevel(double diffpercentil) {
        this.diffpercentil = diffpercentil;
    }

    public double getDiffpercentil() {
        return diffpercentil;
    }
}