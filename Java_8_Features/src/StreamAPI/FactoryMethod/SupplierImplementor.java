package StreamAPI.FactoryMethod;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierImplementor implements Supplier {

    @Override
    public Object get() {
        return new Random().nextInt();
    }
}
