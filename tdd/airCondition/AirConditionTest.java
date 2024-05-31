package airCondition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AirConditionTest {
    @Test
    public void checkThatAirConditionCanCome_on() {
        AirCondition blizzerAirConditioner = new AirCondition();
        assertEquals(true, blizzerAirConditioner.isOn("on"));

    }
    @Test
    public void checkThatAirConditionTurnsOff () {
        AirCondition blizzerAirConditioner = new AirCondition();
        assertEquals(true, blizzerAirConditioner.isOn("on"));
        assertEquals(false, blizzerAirConditioner.isOff("off"));
    }
  @Test
  public void checkThatAirConditionIncreasesTemperature() {
        AirCondition blizzerAirConditioner = new AirCondition();
        assertEquals(17, blizzerAirConditioner.increaseTemperature());
  }
  @Test
  public void checkThatAirConditionCanDecreaseInTemperature() {
        AirCondition blizzerAirConditioner = new AirCondition();
        assertEquals(17, blizzerAirConditioner.increaseTemperature());

  }
}
