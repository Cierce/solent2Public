public class Cat implements Animal
{
    private String name;

    @Override
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }


    @Override
    public String getSound()
    {
        return "Meow";
    }
}
