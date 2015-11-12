
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.geom.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.lang.Math;

public class TreePainting extends JComponent implements MouseListener 
{
    Point2D p1;
    Point2D p2;
    


    /** Number of branches **/
    public static final int NUM_BRANCHES = 8; 
 
	/** Golden ratio makes the trunk length:branch length ratio aesthetically appealing **/
    public static final double GOLDEN_RATIO = 1.618;
 
	/** Maximum branching angle of children from a parent stick **/
    public static final double MAX_BRANCHING_ANGLE = .5*Math.PI;
 
	/** Thickness of the trunk and branches. **/
    public static final int BRANCH_THICKNESS = 8;	
 
	/** Diameter of the blossoms. **/
    public static final int BLOSSOM_DIAM = 25;
    
    

    public TreePainting() /** constructor**/
    {
	super(); //makes class itself a jcomponent
	addMouseListener(this);//add an MouseListener very important!!!
	
	
	
    }

    protected void paintBackground(Graphics g) //method to paint background
    {
	g.setColor(new Color(0,0,0)); //dipping the paint brush
	g.fillRect(0,0,getWidth(),getHeight()); //paint the color on JComponent with parameters coordinates and the width and height of theJComponent
	

	
    }

     /** 
	 * Compute the point that is length away from point p at the specified angle.
	 * Uses cosine to get the new x coordinate, sine to get the new y coordinate.
	 **/
    public Point2D computeEndpoint( Point2D p, double length, double angle )
    {
	return new Point2D.Double( p.getX() + length*Math.cos(angle), // x is cos
                		       p.getY() + length*Math.sin(angle)); // y is sin
    }

    //public static final int MOUSE_PRESSED

    //drawLine(int x1, int y1, int x2, int y2)
    //public static final int MOUSE_RELEASED
    public void mouseClicked(MouseEvent e)
    {
	    
    }

    public void mousePressed(MouseEvent e)
    {
	p1= new Point2D.Double( e.getX(),e.getY()); //should this be a global variable
	//System.out.println("mouse pressed at (" + e.getX() + ", " + e.getY() + ")" );
    }
    public void mouseEntered(MouseEvent e)
    {
    }

    public void mouseReleased(MouseEvent e)
    {
	p2= new Point2D.Double(e.getX(),e.getY());
	//System.out.println(p2.toString());
	repaint();
    }
    public void mouseExited(MouseEvent e)
    {
    }
    



    

    public void paint(Graphics g) //can you have multiple paint methods?
    {
	paintBackground(g);
	if(p1!=null && p2!=null)
	    {
		drawStuff(p1,p2,g);
	    
		
		drawBranch(g);
	    }
	
     }

    //BasicStroke branchStroke=new BasicStroke(BRANCH_THICKNESS);
    public void drawBranch(Graphics g)
    {
	//length of trunk
	//random angle
	for(int x=1; x<=NUM_BRANCHES;x++)
	    {
		Point2D p=computeEndpoint(p2,getLength(p1,p2)/GOLDEN_RATIO,generateRandomAngle());
		drawStuff(p2,p,g);
		int x1=(int) p.getX();
		int y1=(int) p.getY();
		g.setColor(makeRandomColor());

		//g.setColor(new Color((float) (Math.random()*.6f + .3f), // more red
		    //(float)(.1f+.5f*Math.random()), // some green
			  //(float)(.1f+.1f*Math.random()))); // low blue

		g.fillOval(x1-BLOSSOM_DIAM/2,y1-BLOSSOM_DIAM/2,BLOSSOM_DIAM,BLOSSOM_DIAM);
	    }
    
		
	
    }
    public Color makeRandomColor()
    {
	Color c= new Color((float)  (Math.random()*.6f + .3f), // more red
            (float)(.1f+.5f*Math.random()), // some green
			   (float)(.1f+.1f*Math.random()));
	return c;
    }
	

    public int getLength(Point2D a, Point2D b) //this is to get the length of the trunk
    {
	int x1=(int)a.getX();
	int y1=(int)a.getY();
	int x2=(int)b.getX();
	int y2=(int)b.getY();

	int length=(int) Math.sqrt( ( ( x2-x1 ) * ( x2-x1 ) ) + ( (y2-y1) * (y2-y1) ) );
	return length;
    }

    public double getBranchAngle(Point2D a, Point2D b)//to get the angle between the branch and the x axis
    {
	double yLength=(a.getY()-b.getY());
	double xLength=(a.getX()-b.getX());
	double angle=Math.atan2( yLength, xLength);
	return angle;
								    


    }

    public double generateRandomAngle()
    {
	
	double angle= Math.random()*MAX_BRANCHING_ANGLE*2 + MAX_BRANCHING_ANGLE +getBranchAngle(p1,p2);
	return angle;//this is the biggest the angle will be
    }

    public void drawStuff(Point2D a, Point2D b,Graphics g)
    {
	int x1=(int)a.getX();
	int y1=(int)a.getY();
	int x2=(int)b.getX();
	int y2=(int)b.getY();
	g.setColor(Color.RED);
	g.drawLine(x1,y1,x2,y2);

        //set the color
	g.setColor(new Color((float) (Math.random()*.6f + .3f), // more red
            (float)(.1f+.5f*Math.random()), // some green
            (float)(.1f+.1f*Math.random()))); // low blue

	
	
    }
}

    
	
	
     
	

    

    






    
