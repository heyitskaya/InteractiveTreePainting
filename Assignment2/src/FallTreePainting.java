
import java.awt.Graphics;
import java.awt.Color;

public class FallTreePainting extends TreePainting
{

    public FallTreePainting()
    {
	super(); //call the constructor

    }

    public void paintBackground(Graphics g)
    {
	g.setColor(Color.ORANGE); //dipping the paint brush
	g.fillRect(0,0,getWidth(),getHeight());

    }

     public Color makeRandomColor()//we are going to make random colors of blue
    {
	Color c= new Color(  (int)(Math.random()*255) , (int)(Math.random()*255) ,255  );
	return c;
    }
	








}
