package edu.ucsb.cs56.drawings.jonathanchen.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;
import java.awt.geom.Line2D;
/**
   A Sharpened Pencil
      
   @author Jonathan Chen
   @version for CS56, F17, UCSB
   
*/
public class SharpenedPencil extends NewPencil implements Shape
{
    /**
     * Constructor for objects of class SharpenedPencil
       @param x x coordinate of upper left corner of pencil barrel
       @param y y coordinate of upper right corner of pencil barrel
       @param height height of the pencil barrel. The width will be height/20
     */
    public SharpenedPencil(double x, double y, double height)
    {
	super(x,y,height);
	double width = height/20;
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	double tipHeight = height/12;	
	
	Line2D.Double leftTip = new Line2D.Double(x, y, x + width/2, y - tipHeight);
	Line2D.Double rightTip = new Line2D.Double(x + width, y, x + width/2, y - tipHeight);	
	Line2D.Double tipLine = new Line2D.Double(x, y, x + width, y);
        GeneralPath wholePencil = this.get();
        wholePencil.append(leftTip, false);
        wholePencil.append(rightTip, false);
        wholePencil.append(tipLine, false); 
    }    
}
