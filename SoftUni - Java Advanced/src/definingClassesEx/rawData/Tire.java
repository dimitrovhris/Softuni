package definingClassesEx.rawData;

public class Tire {
    private double age;
    private double pressure;

    public Tire(double pressure, double age) {
        this.age = age;
        this.pressure = pressure;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
}
