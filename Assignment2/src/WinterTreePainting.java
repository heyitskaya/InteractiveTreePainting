import java.awt.Graphics;
import java.awt.Color;

public class WinterTreePainting extends TreePainting
{



    public WinterTreePainting() //calls constructor of superclass
    {
	super(); //call the constructor
	

    }

    public void paintBackground(Graphics g)
    {
	g.setColor(new Color(255,255,255)); //dipping the paint brush
	g.fillRect(0,0,getWidth(),getHeight());
    }

    public Color makeRandomColor() //generate random shades of grey black
    {
	
	int x=(int)(Math.random()*255);
	Color c= new Color( x,x ,x );
	
	return c;

    }

    
}
    
