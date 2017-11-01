package edu.ucsb.cs56.drawings.jonathanchen.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Jonathan Chen
 * @version for UCSB CS56, F17 
 */

public class AllMyDrawings
{
    /** Draw a picture with new pencils, in the color of a rainbow
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	NewPencil p1 = new NewPencil(20,180,200);
	g2.setColor(Color.RED); g2.draw(p1);
	
	
	Shape p2 = ShapeTransforms.scaledCopyOfLL(p1,1,1);
	p2 = ShapeTransforms.translatedCopyOf(p2,70,0);
	g2.setColor(Color.ORANGE); g2.draw(p2);
	
	duplicateOnRight(Color.YELLOW,p2,g2,1, 70);
	duplicateOnRight(Color.GREEN,p2,g2,1,140);
	duplicateOnRight(Color.CYAN,p2,g2,1,210);
	duplicateOnRight(Color.BLUE,p2,g2,1,280);
	duplicateOnRight(Color.MAGENTA,p2,g2,1,350);
	duplicateOnRight(Color.PINK,p2,g2,1,420);
	
	Stroke orig=g2.getStroke();
	
	
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few pencils by Jonathan Chen", 20,20);
    }
   private static void duplicateOnRight(Color color, Shape shape, Graphics2D g2,double scale, int xdisplacement){
	shape = ShapeTransforms.scaledCopyOfLL(shape,scale,scale);
        shape = ShapeTransforms.translatedCopyOf(shape,xdisplacement,0);
        g2.setColor(color);
        g2.draw(shape);

   } 
    
    /** Draw a picture with sharpened pencils of different sizes
     */
    public static void drawPicture2(Graphics2D g2) {
	
	
	
	SharpenedPencil s1 = new SharpenedPencil(100,80,310);
	g2.setColor(Color.BLACK); g2.draw(s1);

	for(int i = 0; i < 8; i++)
		duplicateOnRight(Color.BLACK,s1,g2,.8-0.1*i,50*(i+1));
	
	
	
	Stroke orig=g2.getStroke();
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of sharpened pencils Jonathan Chen", 20,20);
    }
    
    
    public static void drawPicture3(Graphics2D g2) {
	
	
	g2.drawString("A bunch of random sharpened and unsharpened pencils by Jonathan Chen", 20,20);
	SharpenedPencil h1 = new SharpenedPencil(100,80,230);
        g2.setColor(Color.BLACK); g2.draw(h1);
      	Shape r2 = ShapeTransforms.rotatedCopyOf(h1, Math.PI/4.0);
	duplicateOnRight(Color.BLACK, r2, g2, 1, 100);
	Shape r3 = ShapeTransforms.rotatedCopyOf(h1,Math.PI/2.5);
	duplicateOnRight(Color.BLACK, r3, g2, 1, 300);
	NewPencil p1 = new NewPencil(50, 300, 100);
	g2.setColor(Color.BLACK);
	g2.draw(p1);
	NewPencil p2 = new NewPencil(400, 40, 80);
	Shape p3 = ShapeTransforms.rotatedCopyOf(p2, Math.PI/2);
	g2.draw(p3);

	
    }       
}
