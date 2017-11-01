package edu.ucsb.cs56.drawings.s_li.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
	A drawing of a ring that implements
	the Shape interface, and so can be drawn, as well as
	rotated, scaled, etc.

	@author Jackson Li (adapted from P. Conrad's House.java)
	@version for CS56, F17, UCSB
   
*/
public class Ring extends GeneralPathWrapper implements Shape
{
	/**
       Constructor
       
       @param x x coord of upper left corner of ring
       @param y y coord of upper left corner of ring
       @param radius radius of inner circle of ring
    */
    public Ring(double x, double y, double radius)
    {
        
        double outerRadius = radius * 1.15;
		
		// make inner ring
		
		Ellipse2D.Double innerRing = new Ellipse2D.Double(x,y,2*radius,2*radius);
		
		// make outer ring
		
		Ellipse2D.Double outerRing = new Ellipse2D.Double(	x-(outerRadius-radius),
															y-(outerRadius-radius),
															(2*radius)+2*(outerRadius-radius),
															(2*radius)+2*(outerRadius-radius));
															
        // put the whole ring together
	
        GeneralPath wholeRing = this.get();
        wholeRing.append(innerRing, false);
        wholeRing.append(outerRing, false); 
    }
}