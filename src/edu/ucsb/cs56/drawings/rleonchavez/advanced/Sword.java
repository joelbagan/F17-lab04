package edu.ucsb.cs56.drawings.rleonchavez.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a house that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Phill Conrad 
   @version for CS56, W16, UCSB
   
  Modified by Ricardo Leon
   for CS56, F17, UCSB
   
*/
public class Sword extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of house
       @param y y coord of lower left corner of house
       @param width width of the house
       @param height of house (including first story and second story)
    */
    public Sword(double x, double y, double width, double height)
    {
	
        double lengthOfBlade = .71 * height;
        double lengthOfHilt = height - lengthOfBlade;
        
        double UpperLeftHiltY = y + lengthOfHilt;
        
        // Make a blade
        
        Line2D.Double BladeL = 
            new Line2D.Double(x+1.7, UpperLeftHiltY ,
				   width, lengthOfBlade);
	 Line2D.Double BladeM = 
            new Line2D.Double(x, UpperLeftHiltY ,
				   width, lengthOfBlade);
	 Line2D.Double BladeR = 
            new Line2D.Double(x-1.7, UpperLeftHiltY ,
				   width, lengthOfBlade);
	
        // makes the hilt.
      
	    
        Line2D.Double theHiltR = 
            new Line2D.Double (x*3, y - width,
                               x - width, y);


	
          Line2D.Double theHiltL = 
	      new Line2D.Double (x*4, y,
				 x, y);
          Line2D.Double theHiltM
	      = 
	      new Line2D.Double (x*2, y - width,
				 x - width/4, y);
	  
	  
	  
	  
        // really puts the sword together
	
        GeneralPath Swordy = this.get();	
        Swordy.append(BladeL, false);
	Swordy.append(BladeM, false);
	Swordy.append(BladeR, false);
	Swordy.append(theHiltR, false);
	Swordy.append(theHiltL, false);
	Swordy.append(theHiltM, false);	
	
	
    }
}
