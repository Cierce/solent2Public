
import java.util.ArrayList;

public interface FarmFacade
{

    ArrayList<Animal> getAllAnimals();

    void addDog(String name);

    void addCat(String name);

    void addCow(String name);
}
