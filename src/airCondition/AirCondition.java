package airCondition;

public class AirCondition {
    private boolean OnAndOffButton;
    private int temperature = 16;

    public boolean isOn(String turnOn){
        OnAndOffButton = true;

        return OnAndOffButton;
    }
    public boolean isOff(String turnOff){
        OnAndOffButton = false;

        return  OnAndOffButton;
    }
    public int increaseTemperature(){
        temperature += 1;
        return temperature;
    }
}
