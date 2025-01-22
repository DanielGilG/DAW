package Exercises.ENUM;

public enum CPUEnum {
    PENTIUM_GOLD_G7400 (3.7d),
    RYZEN_3_4100(3.8d),
    CORE_I5_12400F(2.1),
    RYZEN_7_5800X(3.8),
    CORE_I7_12700KF(3.8);

    private double speed;

    //ESTE ERA EL PROBLEMA
    private CPUEnum(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return this.speed;
    }
}
