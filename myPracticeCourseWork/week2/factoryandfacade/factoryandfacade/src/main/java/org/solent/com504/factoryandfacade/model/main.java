
import java.util.ArrayList;

/**
 *
 * @author Connor
 */
public class main
{

    public static void main(String[] args)
    {
        ArrayList<Animal> animals;
        FarmFacade farmFacade = AnimalObjectFactory.createFarmFacadeImp();
        farmFacade.addCat("Sandy");
        farmFacade.addCow("Beef");
        farmFacade.addDog("Ash");

        animals = farmFacade.getAllAnimals();

        for(int i = 0; i < animals.size(); i++)
        {
            System.out.format("Animal name is: %s and goes: %s%n", animals.get(i).getName(), animals.get(i).getSound());
        }
    }
}