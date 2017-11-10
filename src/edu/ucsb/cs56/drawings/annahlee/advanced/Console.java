package edu.ucsb.cs56.drawings.annahlee.advanced;

import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/*
   A vector drawing of a game console that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
    _____________________            
   /       ________      \       
   |      |       |      |    
   |      |       |      |           
   |      |       |      |
   |      |_______|      |
   \_____________________/
      
   @author Anna Lee 
   @version for CS56, F17, UCSB
  
*/

public class Console extends GeneralPathWrapper implements Shape
{
    /**
       Constructor
       
       @param x x coord of lower left corner of console
       @param y y coord of lower left corner of console
       @param height height of the console
    */
    public Console(double x, double y, double height)
    {
        // depending on width and height, scales accordingly
	double width = height * 2;
	double outlineArc = width/5;
	
	double screenHeight = height/1.1;
	double screenWidth = width/1.9;
	double screenX = (width - screenWidth)/2;
	double screenY = (height - screenHeight)/2;
        
	/*
	double dPadLineLength = height/9;
	double dPadLeftCornerX = screenX/2 - dPadLineLength/2;
        double dPadLeftCornerY = Y + height/3;
	
	double AButtonX = screenX + screenWidth + dPadLineLength;
        double AButtonY = dPadLeftCornerY * 1.1;
	double buttonRadius = dPadLineLength/1.9;
	double BButtonX = AButtonX + 2*dPadLineLength;
	double BButtonY = dPadLeftCornerY - 2.2*dPadLineLength;
	*/


        // make the outline of the console
        
        RoundRectangle2D.Double consoleOutline = 
            new RoundRectangle2D.Double(x, y, width, height, outlineArc, outlineArc);

	// make the screen in the center of the console

	Rectangle2D.Double consoleScreen =
	    new Rectangle2D.Double(x + screenX, y + screenY, screenWidth, screenHeight);
	
        // put the console together
        GeneralPath wholeConsole = this.get();
        wholeConsole.append(consoleOutline, false);
        wholeConsole.append(consoleScreen, false);   
    }
}
