import javax.swing.*;
/**
 * Created by Adam Cowie on 16/09/2016.
 */
public class Candle
{
    private String colour;
    private int height;
    private static int price=2;

    public Candle(String color, int inches)
    {
        colour=color;
        height=inches;
    }
    public String getColour()
    {
        return colour;
    }
    public int getHeight(){ return height; }
    public void display()
    {
        JOptionPane.showMessageDialog(null,"Mick's Wicks, un-sented, " + colour + ", " + height + " inches tall candle, will cost $" + (height*price));
    }
}