package edu.ucsb.cs56.drawings.vsneddon.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

/**
   A JackOLantern
      
   @author Victoria Sneddon 
   @version for CS56, F16, UCSB
   
*/
public class JackOLantern extends Pumpkin implements Shape
{
    /**
     * Constructor for objects of class JackOLantern
     */
    public JackOLantern(double x, double y, double width, double height)
    {
	// construct the basic jackolantern shell
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	

	
	double w = 0.10 * width;
	double eyeh = y + 0.5 * height;
	double eyew =  0.25 * height;
	
	Ellipse2D.Double eye1 =
	    new Ellipse2D.Double(x*1.4, eyeh/1.08, width/10, height/9);
	Ellipse2D.Double eye2 =
	    new Ellipse2D.Double(x * 1.9, eyeh/1.08, width/10, height/9);
	Rectangle2D.Double mouth =
	    new Rectangle2D.Double(x + 7.0*w, eyeh/1.04, 4.0 * w, eyew/2);
	
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath wholeLantern = this.get();
        wholeLantern.append(eye1, false);
        wholeLantern.append(eye2, false);
        wholeLantern.append(mouth, false); 
    }    
}
