package edu.ucsb.cs56.drawings.annahlee.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.Ellipse2D;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a game console that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.
    _____________________              _  
   /       ________      \           _| |_
   |      |       |      |    +  =  |_   _|
   |      |       |    O |            |_| 
   |   +  |       | O    |
   |      |_______|      |
   \_____________________/
      
   @author Anna Lee 
   @version for CS56, F17, UCSB
  
*/

public class GBoy extends Console implements Shape
{
    public GBoy(double x, double y, double height)
    {
    	// construct basic console shell
	super(x, y, height);
    	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();

        
	// depending on width and height, scales accordingly
	
	double width = height * 2;
	
	double screenHeight = height/1.1;
	double screenWidth = width/1.9;
	double screenX = (width - screenWidth)/2;
	double screenY = (height - screenHeight)/2;

	double dPadLineLength = height/9;
	double dPadLeftCornerX = x + screenX/2 - dPadLineLength/2;
        //double dPadLeftCornerY = dPadLineLength + y + height/2 + (height - screenHeight)/2 - 1/5*dPadLineLength;
	double dPadLeftCornerY = y + height/2 + 1.5*dPadLineLength;

	double AButtonX = x + screenX + screenWidth + dPadLineLength;
        double AButtonY = dPadLeftCornerY * 1.2 - screenHeight/2;
	double buttonRadius = dPadLineLength/1.9;
	double BButtonX = AButtonX + 1.6*dPadLineLength;
	double BButtonY = dPadLeftCornerY * 1.1 - screenHeight/2;


	Line2D.Double dSix =
	    new Line2D.Double(dPadLeftCornerX, dPadLeftCornerY,
			      dPadLeftCornerX + dPadLineLength, dPadLeftCornerY);

	Line2D.Double dFive =
	    new Line2D.Double(dPadLeftCornerX + dPadLineLength, dPadLeftCornerY,
			      dPadLeftCornerX + dPadLineLength, dPadLeftCornerY - dPadLineLength);

	Line2D.Double dFour =
	    new Line2D.Double(dPadLeftCornerX + dPadLineLength, dPadLeftCornerY - dPadLineLength,
			      dPadLeftCornerX + 2*dPadLineLength, dPadLeftCornerY - dPadLineLength);

	Line2D.Double dThree =
	    new Line2D.Double(dPadLeftCornerX + 2*dPadLineLength, dPadLeftCornerY - dPadLineLength,
			      dPadLeftCornerX + 2*dPadLineLength, dPadLeftCornerY - 2*dPadLineLength);

	Line2D.Double dTwo =
	    new Line2D.Double(dPadLeftCornerX + dPadLineLength, dPadLeftCornerY - 2*dPadLineLength,
			      dPadLeftCornerX + 2*dPadLineLength, dPadLeftCornerY - 2*dPadLineLength);

	Line2D.Double dOne =
	    new Line2D.Double(dPadLeftCornerX + dPadLineLength, dPadLeftCornerY - 3*dPadLineLength,
			      dPadLeftCornerX + dPadLineLength, dPadLeftCornerY - 2*dPadLineLength);

	Line2D.Double dTwelve =
	    new Line2D.Double(dPadLeftCornerX, dPadLeftCornerY - 3*dPadLineLength,
			      dPadLeftCornerX + dPadLineLength, dPadLeftCornerY - 3*dPadLineLength);

	Line2D.Double dEleven =
	    new Line2D.Double(dPadLeftCornerX, dPadLeftCornerY - 2*dPadLineLength,
			      dPadLeftCornerX, dPadLeftCornerY - 3*dPadLineLength);

	Line2D.Double dTen =
	    new Line2D.Double(dPadLeftCornerX - dPadLineLength, dPadLeftCornerY - 2*dPadLineLength,
			      dPadLeftCornerX, dPadLeftCornerY - 2*dPadLineLength);

	Line2D.Double dNine =
	    new Line2D.Double(dPadLeftCornerX - dPadLineLength, dPadLeftCornerY - dPadLineLength,
			      dPadLeftCornerX - dPadLineLength, dPadLeftCornerY - 2*dPadLineLength);

	Line2D.Double dEight =
	    new Line2D.Double(dPadLeftCornerX - dPadLineLength, dPadLeftCornerY - dPadLineLength,
			      dPadLeftCornerX, dPadLeftCornerY - dPadLineLength);

	Line2D.Double dSeven =
	    new Line2D.Double(dPadLeftCornerX, dPadLeftCornerY,
			      dPadLeftCornerX, dPadLeftCornerY - dPadLineLength);
	    
	// make the buttons (A) (B)

	Ellipse2D.Double AButton =
	    new Ellipse2D.Double(AButtonX, AButtonY, 2*buttonRadius, 2*buttonRadius);

	Ellipse2D.Double  BButton =
	    new Ellipse2D.Double(BButtonX, BButtonY, 2*buttonRadius, 2*buttonRadius);

	
        // add the buttons and dpad to the console!
 
        GeneralPath wholeGboy = this.get();
        wholeGboy.append(dTwelve, false);
        wholeGboy.append(dOne, false);
        wholeGboy.append(dTwo, false);
	wholeGboy.append(dThree, false);
	wholeGboy.append(dFour, false);
	wholeGboy.append(dFive, false);
	wholeGboy.append(dSix, false);
	wholeGboy.append(dSeven, false);
	wholeGboy.append(dEight, false);
	wholeGboy.append(dNine, false);
	wholeGboy.append(dTen, false);
	wholeGboy.append(dEleven, false);
	wholeGboy.append(AButton, false);
	wholeGboy.append(BButton, false);
	
    }
}
