package Exercises.SportType;

public enum DifficultyLevel {
    BEGGINER(1d),
    INTERMIDIATE(1.1d),
    ADVANCED (1.2d);

    private double diffpercentil;

    DifficultyLevel(double diffpercentil) {
        this.diffpercentil = diffpercentil;
    }

    public double getDiffpercentil() {
        return diffpercentil;
    }
}