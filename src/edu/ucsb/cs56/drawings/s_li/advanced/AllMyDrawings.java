package edu.ucsb.cs56.drawings.s_li.advanced;

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
 * @author Phill Conrad 
 * @version for UCSB CS56, W16 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few rings 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Ring r1 = new Ring(100,250,25);
	g2.setColor(Color.RED); g2.draw(r1);
	
	// Make a gray ring that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape r2 = ShapeTransforms.scaledCopyOfLL(r1,0.5,0.5);
	r2 = ShapeTransforms.translatedCopyOf(r2,150,0);
	g2.setColor(Color.GRAY); g2.draw(r2);
	
	// Here's a ring that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	r2 = ShapeTransforms.scaledCopyOfLL(r2,4,4);
	r2 = ShapeTransforms.translatedCopyOf(r2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(r2); 
	
	// Draw two Jeweled Rings
	
	JeweledRing jr1 = new JeweledRing(50,350,40);
	JeweledRing jr2 = new JeweledRing(200,350,20);
	
	g2.draw(jr1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(jr2);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few rings by Jackson Li", 20,20);
    }
    
    
    /** Draw a picture with a few rings
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some rings.
	
	Ring large = new Ring(100,50,50);
	Ring smallRing = new Ring(20,50,30);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallRing);
	
	Ring r1 = new Ring(100,250,50);
	g2.setColor(Color.CYAN); g2.draw(r1);
	
	// Make a ring that's half the size, 
	// and moved over 150 pixels in x direction
	Shape r2 = ShapeTransforms.scaledCopyOfLL(r1,0.5,0.5);
	r2 = ShapeTransforms.translatedCopyOf(r2,150,0);
	g2.setColor(Color.BLACK); g2.draw(r2);
	
	// Here's a ring that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	r2 = ShapeTransforms.scaledCopyOfLL(r2,4,4);
	r2 = ShapeTransforms.translatedCopyOf(r2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(r2); 
	
	// Draw two jeweled rings
	
	JeweledRing jr1 = new JeweledRing(50,350,40);
	JeweledRing jr2 = new JeweledRing(200,350,60);
	
	g2.draw(jr1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second ring 45 degrees around its center.
	Shape jr3 = ShapeTransforms.rotatedCopyOf(jr2, Math.PI/4.0);
	
	g2.draw(jr3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("More Rings by Jackson Li", 20,20);
    }
    
    /** Draw a different picture with a few rings
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("Even More Rings by Jackson Li", 20,20);
	
	
	// Draw some rings.
	
	Ring large = new Ring(100,50,50);
	Ring smallRing = new Ring(20,50,70);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallRing);
	
	JeweledRing jr1 = new JeweledRing(200,200,100);
	g2.setColor(Color.BLACK);	g2.draw(jr1);
    }       
}
