package Exercises.SportType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);

        System.out.println("Crear un Evento");
        System.out.println("1. Soccer");
        System.out.println("2. Basketball");
        System.out.println("3. Tennis");
        System.out.println("4. Swimming");
        System.out.println("5. Cycling");
        System.out.println("----------------");
        System.out.println("");
        int sportChoice = lec.nextInt();

        System.out.println("1. Begginer");
        System.out.println("2. Intermidiate");
        System.out.println("3. Advanced");
        System.out.println("----------------");
        System.out.println("");
        int difficultyChoice = lec.nextInt();

        System.out.print("Indique el precio base: ");
        double priceChoice = lec.nextDouble();

        SportType sport = null;

        switch (sportChoice){
            case 1:
                sport = SportType.SOCCER;
                break;
            case 2:
                sport = SportType.BASKETBALL;
                break;
            case 3:
                sport = SportType.TENNIS;
                break;
            case 4:
                sport = SportType.SWIMMING;
                break;
            case 5:
                sport = SportType.CYCLING;
                break;
            default:
                break;
        }

        DifficultyLevel difficulty = null;

        switch (sportChoice){
            case 1:
                difficulty = DifficultyLevel.BEGGINER;
                break;
            case 2:
                difficulty = DifficultyLevel.INTERMIDIATE;
                break;
            case 3:
                difficulty = DifficultyLevel.ADVANCED;
                break;
            default:
                break;
        }
        SportEvent event1 = new SportEvent(sport, difficulty, priceChoice);
        System.out.println(event1.toString());
    }
}