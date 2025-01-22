package Exercises.ENUM;

public enum PruebaEnum {
    NIRO("motor"),
    XCEED("motor"),
    SPORTAGE("motor");

    private String engine;

    private PruebaEnum(String engine){
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }
}