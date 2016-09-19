import javax.swing.*;
/**
 * Created by Adam Cowie on 16/09/2016.
 */
public class RaceHorse extends Horse
{
    protected int races;
    public RaceHorse(String name, String colour, int year, int arace)
    {
        super(name, colour, year);
        races = arace;
    }
    public int getRaces()
    {
        return races;
    }
    public void display()
    {
        JOptionPane.showMessageDialog(null,"Your race horse named " + getName() + " has nice " + getColour() + " hair, has competed in " + races + " races, and its is " + getAge() + " years old.");
    }
}
