package Exercises.SportType;

public class SportEvent {
    SportType sport;
    DifficultyLevel difficulty;
    double basePrice;

    public SportEvent(SportType sport, DifficultyLevel difficulty, double basePrice) {
        this.sport = sport;
        this.difficulty = difficulty;
        this.basePrice = basePrice;
    }

    public double calculatePrice(){
        double result;
        result = basePrice * difficulty.getDiffpercentil();
        return result;
    }

    public SportType getSport() {
        return sport;
    }

    public DifficultyLevel getDifficulty() {
        return difficulty;
    }

    public double getBasePrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return "SportEvent{" +
                "sport=" + sport +
                ", difficulty=" + difficulty +
                ", basePrice=" + basePrice +
                '}';
    }
}
