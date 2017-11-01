package edu.ucsb.cs56.drawings.drew_polk.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

/**
   A Lamp
      
   @author Andrew Polk
   @version for CS56, F17, UCSB
   
*/
public class Lamp extends Lightbulb implements Shape
{
    /**
     * Constructor for objects of class Lamp
     */
    public Lamp(double x, double y, double width, double height)
    {
	// construct the basic lamp shell
	super(x + width/2,y,width/2,height/2);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	double w = 0.10 * width;
	double baseTop = y + 0.5 * height;
	double baseHt = y + 0.5 * height;
	
	Ellipse2D.Double base =
	    new Ellipse2D.Double(x + width*0.15, y + height*0.8, width, height);
	Ellipse2D.Double base2 = 
		new Ellipse2D.Double(x + width*0.32, y + height*1.7, width*0.60, height/5);
	Rectangle2D.Double stand = 
		new Rectangle2D.Double(x + width*0.48, y + height*0.35, width*0.29, height*0.25);
	Rectangle2D.Double stand2 = 
		new Rectangle2D.Double(x + width*0.58, y + height*0.6, width*0.1, height*0.22);	
	
	// add the lamp to the lightbulb
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath wholeLamp = this.get();
        wholeLamp.append(base, false);
        wholeLamp.append(base2, false);
        wholeLamp.append(stand, false);
		wholeLamp.append(stand2, false);
    }    
}