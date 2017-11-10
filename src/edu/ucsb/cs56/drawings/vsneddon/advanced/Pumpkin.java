package edu.ucsb.cs56.drawings.vsneddon.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a Pumpkin that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Victoria Sneddon 
   @version for CS56, F16, UCSB
   
*/
public class Pumpkin extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of pumpkin
       @param y y coord of lower left corner of pumpkin
       @param width width of the pumpkin
       @param height of pumpkin
    */
    public Pumpkin(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
        double Pumpkin_width =  width;
	double Pumpkin_height = height;
	
        
        // Make pumpkin shape
        
        Ellipse2D.Double pumpkinShape = 
            new Ellipse2D.Double(x, y ,
				  Pumpkin_width*1.5, Pumpkin_height/2);
	
        // make the stem and leaf,
        
        Rectangle2D.Double stem = 
            new Rectangle2D.Double (x+Pumpkin_width/1.5, y-Pumpkin_height/5,  Pumpkin_width/3.5,
                               Pumpkin_height/5);
	
        Ellipse2D.Double leaf =
            new Ellipse2D.Double (x + Pumpkin_width/1.1, y - Pumpkin_height/6.2,
                               Pumpkin_width/2, Pumpkin_height/6);
	
        // put the whole pumpkin together
	
        GeneralPath wholePumpkin = this.get();
        wholePumpkin.append(pumpkinShape, false);
        wholePumpkin.append(stem, false);
        wholePumpkin.append(leaf, false);    
    }
}
