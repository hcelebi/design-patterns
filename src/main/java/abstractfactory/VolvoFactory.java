package abstractfactory;

public class VolvoFactory implements CarFactoryInterface{
    @Override
    public Car create() {
        return new Volvo();
    }
}
