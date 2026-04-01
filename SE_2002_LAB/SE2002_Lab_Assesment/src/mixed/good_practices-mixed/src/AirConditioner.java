public class AirConditioner implements Switchable, Thermostat {

    public void turnOn() {
        System.out.println("AC On");
    }

    public void adjustTemperature(int t) {
        System.out.println("Temp set to " + t);
    }
}