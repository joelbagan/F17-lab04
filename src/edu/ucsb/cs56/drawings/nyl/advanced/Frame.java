package edu.ucsb.cs56.drawings.nyl.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a frame that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Nery Yaritza Lara Mancia 
   @version for CS56, F17, UCSB
   
*/
public class Frame extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x coord of lower left corner of the frame
       @param y coord of lower left corner of the frame
       @param width of the outer_frame
       @param height of the outer frame 
    */
    public Frame(double x, double y, double width, double height)
    {
        
        double inner_height = .75 * height;
        double outer_height = height;
        
	double inner_width = .75 * width;
	double outer_width = width;

	double inner_x = x + ((width - inner_width)/2);  
	double inner_y = y + ((height - inner_height)/2);
	
        
        // Make the outer rectangle
        
        Rectangle2D.Double outer_rectangle = 
            new Rectangle2D.Double(x, y,
				   width, height);

	//Make the innner rectangle
	Rectangle2D.Double inner_rectangle = 
            new Rectangle2D.Double(inner_x, inner_y,
				   inner_width, inner_height);

        // put the whole frame together
	
        GeneralPath completeFrame = this.get();
        completeFrame.append(outer_rectangle, false);
        completeFrame.append(inner_rectangle, false);
    }
}
