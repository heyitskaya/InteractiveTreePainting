
import java.awt.Graphics;
import java.awt.Color;
public class SpringTreePainting extends TreePainting
{

    public SpringTreePainting()
    {
	super(); //call the constructor
    }


    public void paintBackground(Graphics g)
    {
	g.setColor(Color.PINK); //dipping the paint brush
	g.fillRect(0,0,getWidth(),getHeight()); //painting it on
    }

    public Color makeRandomColor() //we are going to make random shades of pink 
    {
	Color c= new Color( 255 , (int)(Math.random()*255) ,(int)(Math.random()*255)  );
	return c;


    }



}
