package decorator;

public class PowerMeter extends Sensor{

    public PowerMeter(InversorInterface inversor) {
        super(inversor);
    }
}
