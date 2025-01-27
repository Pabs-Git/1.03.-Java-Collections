package Ejercicio_1;

public class Month {

    private String name;

    public Month(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Month{" +
                "month='" + name + '\'' +
                '}';
    }
}
