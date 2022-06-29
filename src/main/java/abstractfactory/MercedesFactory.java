package abstractfactory;

public class MercedesFactory implements CarFactoryInterface{
    @Override
    public Car create() {
        return new Mercedes();
    }
}
