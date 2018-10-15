

public class AnimalObjectFactory
{
    public static Animal createCat()
    {
        return new Cat();
    }

    public static Animal createDog()
    {
        return new Dog();
    }

    public static Animal createCow()
    {
        return new Cow();
    }

    public static FarmFacadeImplementation createFarmFacadeImp()
    {
        FarmFacadeImplementation farmFacadeImp = new FarmFacadeImplementation();
        return farmFacadeImp;
    }
}

