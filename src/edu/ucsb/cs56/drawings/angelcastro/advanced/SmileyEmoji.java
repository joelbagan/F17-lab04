package edu.ucsb.cs56.drawings.angelcastro.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Line2D;

/**
   A Smiley Emoji that extends Emoji and implements Shape.
      
   @author Angel Castro 
   @version for CS56, W17, UCSB

*/
public class SmileyEmoji extends Emoji implements Shape
{
    /**
     * Constructor for objects of class SmileyEmoji
     */
    public SmileyEmoji(double x, double y, double radius)
    {
	// construct the basic face  outline and eyes
	super(x,y,radius);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	//mouth drawin using three lines 
	//bottom flat line and two angled side lines to resemble a smile
	//parameters for locations of start and end for each line
	// left line parameters
	double leftStartX = x + .5*radius;
	double leftStartY = y;
	double leftEndX  = x + .25*radius;
	double leftEndY  = y + .5*radius;
	// bottom line parameters
	double bottomStartX= leftEndX;
	double bottomStartY=leftEndY;
	double bottomEndX   =x- .25*radius;
	double bottomEndY  = leftEndY;
	//right line parameters
	double rightStartX= bottomEndX;
	double rightStartY= bottomEndY;
	double rightEndX  = x - .5*radius;
	double rightEndY = leftStartY;
	// left line of the smile
	Line2D.Double leftSmile = new Line2D.Double( leftStartX, leftStartY,
			leftEndX, leftEndY);
	// bottom line of the smile
	Line2D.Double bottomSmile= new Line2D.Double( bottomStartX, bottomStartY,
			bottomEndX,bottomEndY);
	// right line of the smile
	Line2D.Double rightSmile= new Line2D.Double( rightStartX, rightStartY,
			rightEndX, rightEndY);
	
	// general path
        GeneralPath wholeFace = this.get();
        wholeFace.append(leftSmile, false);
        wholeFace.append(bottomSmile, false);
        wholeFace.append(rightSmile, false); 
    }    
}
