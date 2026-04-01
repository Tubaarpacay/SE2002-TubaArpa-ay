public class HomeAutomation {

    public void turnOnDevice(Switchable device) {
        device.turnOn();
    }

    public void setTemperature(Thermostat device, int temp) {
        device.adjustTemperature(temp);
    }
}