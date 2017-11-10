package edu.ucsb.cs56.drawings.drew_polk.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a lightbulb that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
      
   @author Andrew Polk
   @version for CS56, F17, UCSB
   
*/
public class Lightbulb extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of lightbulb
       @param y y coord of lower left corner of lightbulb
       @param width width of the lightbulb
       @param height of lightbulb
    */
    public Lightbulb(double x, double y, double width, double height)
    {
	
        // Rather than having to scale at the end, we can just
        // draw things the right way to begin with, using the
        // x, y, width and height.   If you haven't already
        // hard coded a particular drawing, this may be an easier
        // way.
        
		// values for the connector
        double connectorHeight = 0.30 * height;
		double connectorWidth = 0.5 * width;
		
		//values for the bulb
        double bulbHeight = height - connectorHeight;
		double bulbWidth = width * 0.90;
        
		//values for the connector
        double connectorUpperLeftY = y + (bulbHeight * 0.95);
        double centerX = x - (bulbWidth * 0.25);
		
		//values for the connector2
		double connector2Width = connectorWidth * 0.5;
		double connector2UpperLeftY = connectorUpperLeftY + connectorHeight;
		double connector2CenterX = x + (connector2Width * 0.5);
		
		//values for the threads
		double threadX1 = centerX + connectorWidth * 0.49;
		double threadX2 = x + connectorWidth;
		double thready1 = connector2UpperLeftY * 0.99;
		double thready2 = thready1 * 0.99;
		double thready3 = thready2 * 0.99;
		
        // Make the connector
        
        Rectangle2D.Double connector = 
            new Rectangle2D.Double(x, connectorUpperLeftY,
				   connectorWidth, connectorHeight);
		Rectangle2D.Double connector2 =	
			new Rectangle2D.Double(connector2CenterX, connector2UpperLeftY,
					connector2Width, connectorHeight * 0.25);
		Line2D.Double thread1 =
			new Line2D.Double(threadX1, thready1,
					threadX2, thready1);
		Line2D.Double thread2 =
			new Line2D.Double(threadX1, thready2,
					threadX2, thready2);
		Line2D.Double thread3 =
			new Line2D.Double(threadX1, thready3,
					threadX2, thready3);			
	
        // make the bulb.   Remember that y goes DOWN the page,
        // so we ADD to y to get a "lower" value on the screen
        
        Ellipse2D.Double bulb = 
            new Ellipse2D.Double (centerX, y,
                               bulbWidth, bulbHeight);
	
        // put the whole lightbulb together
	
        GeneralPath wholeLightbulb = this.get();
        wholeLightbulb.append(connector, false);
		wholeLightbulb.append(connector2, false);
		wholeLightbulb.append(thread1, false);
		wholeLightbulb.append(thread2, false);
		wholeLightbulb.append(thread3, false);
        wholeLightbulb.append(bulb, false);    
    }
}