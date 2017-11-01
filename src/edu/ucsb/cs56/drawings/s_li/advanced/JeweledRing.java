package edu.ucsb.cs56.drawings.s_li.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 

import java.awt.geom.Ellipse2D;

/**
   A Jeweled Ring
      
   @author Jackson Li (adapted from P. Conrad's HouseWithWindows.java)
   @version for CS56, F17, UCSB
   
*/
public class JeweledRing extends Ring implements Shape
{
    /**
     * Constructor for objects of class JeweledRing
     */
    public JeweledRing(double x, double y, double radius)
    {
		// construct the basic ring
		super(x,y,radius);
	
		// get the GeneralPath that we are going to append stuff to
		GeneralPath gp = this.get();
		
		// coord setup
		
		double outerRadius = 1.15*radius;
		double jewelRadius = 0.75*radius;
		double jewelX = x + radius - jewelRadius/2;
		double jewelY = y - (outerRadius-radius) - jewelRadius;

		
		// Make a jewel

		Ellipse2D.Double jewel = new Ellipse2D.Double(	jewelX,
														jewelY,
														jewelRadius,
														jewelRadius);
		
		// add the jewel to the ring
		// Look up the meaning of the second parameter of append
		// (Hint--is a method of "GeneralPath")
		
		GeneralPath wholeRing = this.get();
		wholeRing.append(jewel, false);
    }    
}
