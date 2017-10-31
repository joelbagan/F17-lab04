package edu.ucsb.cs56.drawings.angelcastro.advanced;
import java.awt.geom.GeneralPath; // combinations of lines and curves
import java.awt.Shape; // general class for shapes

import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
   A vector drawing of a Smiling Emoji that implements
   the Shape interface, and so can be drawn, as well as
   rotated, scaled, etc.

   @author Angel Castro
   @version for CS56, W17, UCSB

*/
public class Emoji extends GeneralPathWrapper implements Shape
{
    /**
       Constructor

       @param x x coord of center of face circle
       @param y y coord of center of face circle
       @param radius radius of the circle
    */
    public Emoji(double x, double y, double radius)
    {
	    // parameters for determining location of eyes
	    double eyeHeightStart = y-.45*radius;
	    double eyeHeightEnd   = y- .55*radius;
	    double eyeLeft   = x + .5*radius;
	    double eyeRight  = x - .5*radius;
	    // The face circle
	    Ellipse2D.Double face = 
		    new Ellipse2D.Double(x-radius, y-radius, radius*2, radius*2);
	    //Line for the left eye
	    Line2D.Double leftEye = 
		    new Line2D.Double (eyeLeft, eyeHeightStart,
				    eyeLeft, eyeHeightEnd);
	    //Line for the right eye
	    Line2D.Double rightEye = 
		    new Line2D.Double (eyeRight, eyeHeightStart,
				    eyeRight, eyeHeightEnd);
	    //general path
	    GeneralPath wholeFace =this.get();
	    wholeFace.append(face, false);
	    wholeFace.append(leftEye, false);
	    wholeFace.append(rightEye, false); 
    } 
}
