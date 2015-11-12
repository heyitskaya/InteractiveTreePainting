import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
* TreeCollagePanel is a JPanel. It will hold all the 
* seasonal TreePaintings we want to display. It uses
* a GridLayout to specify how they are arranged in the GUI.
* @
*/
public class TreeCollagePanel extends JPanel
{
    private JLabel instructions= new JLabel("Click, drag and release to start painting");
    private JPanel mainCollagePanel= new JPanel(new BorderLayout());
 	 
	 /**
	  * Calls super (the superclass constructor) and sets a BorderLayout.
	  * 
	  * In the NORTH region, adds 'instructions', a JLabel, that will cv 
	  * display the instructions.
	  * 
	  * In the CENTER panel, adds 'mainCollagePanel', a JPanel, that will
	  * be organized with a GridLayout to hold a basic TreePainting object
	  * plus each of the four seasonal TreePainting subclass objects:
	  * WinterTreePainting, SpringTreePainting, SummerTreePainting, 
	  * FallTreePainting.
	  * 
	  */
	 public TreeCollagePanel(String instructionsText)
	 {
		 super(new BorderLayout());

		 add(instructions,BorderLayout.NORTH);
		 //mainCollagePanel.add(new SingleTreePanel(""));
		 //mainCollagePanel.add(new WinterTreePainting());
		 //mainCollagePanel.add(new SummerTreePainting());
		 //mainCollagePanel.add(new SpringTreePainting());
		 //mainCollagePanel.add(new FallTreePainting());
		 
		 //System.out.println("It has been added 1");
		 
		 // add(mainCollagePanel, BorderLayout.CENTER);
		 mainCollagePanel.add(new SingleTreePanel(""),BorderLayout.NORTH);
		 mainCollagePanel.add(new WinterTreePainting(),BorderLayout.SOUTH);
		 mainCollagePanel.add(new SpringTreePainting(),BorderLayout.WEST);
		 //mainCollagePanel.add(new SummerTreePainting(),BorderLayout.CENTER);
		 mainCollagePanel.add(new FallTreePainting(),BorderLayout.CENTER);
		 //mainCollagePanel.add(new SummerTreePainting(),BorderLayout.CENTER);
		 add(mainCollagePanel, BorderLayout.CENTER);
		 //System.out.println("It has been added 2");
	 }
		 
		 
	 

	 	 /* unfinished */

		 /* YOUR CODE HERE */




}
