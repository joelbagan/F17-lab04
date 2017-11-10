package edu.ucsb.cs56.drawings.jonathanchen.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a pencil that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Jonathan Chen
   @version for CS56, F17, UCSB
   
*/
public class NewPencil extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of upper left corner of pencil
       @param y y coord of upper left corner of pencil
       @param height of barrel of the pencil. The width of the pencil will be the height/20
    */
    public NewPencil(double x, double y, double height)
    {
	double width = height/20;
	double erasery = y + height - height/14; 
        
        
        
        
        Rectangle2D.Double firstStory = 
            new Rectangle2D.Double(x, y ,
				   width, height);
	
       	Line2D.Double eraserline = new Line2D.Double(x, erasery, x + width, erasery);

	
	
	
        GeneralPath wholePencil = this.get();
        wholePencil.append(firstStory, false);
	wholePencil.append(eraserline, false);
    }
}
