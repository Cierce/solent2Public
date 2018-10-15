/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Connor
 */
public class FarmFacadeImplementation implements FarmFacade
{
    ArrayList<Animal> animals = new ArrayList<>();

    public ArrayList<Animal> getAllAnimals()
    {
        return animals;
    }

    public void addDog(String name)
    {
       Animal dog = AnimalObjectFactory.createDog();
       dog.setName(name);
       animals.add(dog);
    }

    public void addCat(String name)
    {
       Animal cat = AnimalObjectFactory.createCat();
       cat.setName(name);
       animals.add(cat);
    }

    public void addCow(String name)
    {
        Animal cow = AnimalObjectFactory.createCow();
        cow.setName(name);
        animals.add(cow);
    }
}
