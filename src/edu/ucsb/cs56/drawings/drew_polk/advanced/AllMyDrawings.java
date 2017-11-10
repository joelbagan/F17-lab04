package edu.ucsb.cs56.drawings.drew_polk.advanced;

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
 * @author Andrew Polk
 * @version for UCSB CS56, F17 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few lightbulbs and lamps 
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Lightbulb bulb1 = new Lightbulb(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(bulb1);
	
	// Make a black lightbulb that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape bulb2 = ShapeTransforms.scaledCopyOfLL(bulb1,0.5,0.5);
	bulb2 = ShapeTransforms.translatedCopyOf(bulb2,150,0);
	g2.setColor(Color.BLACK); g2.draw(bulb2);
	
	// Here's a lightbulb that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	bulb2 = ShapeTransforms.scaledCopyOfLL(bulb2,4,4);
	bulb2 = ShapeTransforms.translatedCopyOf(bulb2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(bulb2); 
	
	// Draw two lamps
	
	Lamp lamp1 = new Lamp(50,350,40,75);
	Lamp lamp2 = new Lamp(200,350,200,100);
	Shape lamp3 = ShapeTransforms.scaledCopyOfLL(lamp2, 0.75, 0.75);
	lamp3 = ShapeTransforms.translatedCopyOf(lamp3, -100, -150);
	
	g2.draw(lamp1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(lamp2);
	g2.setColor(new Color(0x8F157D)); g2.draw(lamp3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few lightbulbs and lamps by Andrew Polk", 20,20);
    }
    
    
    /** Draw a picture with a few lightbulbs and lamps
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some lightbulbs.
	
	Lamp large = new Lamp(100,50,225,150);
	Lamp small = new Lamp(20,50,40,30);
	Lamp tallSkinny = new Lamp(20,150,20,40);
	Lamp shortFat = new Lamp(20,250,40,20);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	Lightbulb bulb1 = new Lightbulb(100,250,50,75);
	g2.setColor(Color.CYAN); g2.draw(bulb1);
	
	// Make a black lightbulb that's half the size, 
	// and moved over 150 pixels in x direction
	Shape bulb2 = ShapeTransforms.scaledCopyOfLL(bulb1,0.5,0.5);
	bulb2 = ShapeTransforms.translatedCopyOf(bulb2,150,0);
	g2.setColor(Color.BLACK); g2.draw(bulb2);
	
	// Here's a lightbulb that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	bulb2 = ShapeTransforms.scaledCopyOfLL(bulb2,4,4);
	bulb2 = ShapeTransforms.translatedCopyOf(bulb2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(bulb2); 
	
	// Draw two lamps
	
	Lamp lamp1 = new Lamp(50,350,40,75);
	Lamp lamp2 = new Lamp(200,350,200,100);
	
	g2.draw(lamp1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second lamp 45 degrees around its center.
	Shape lamp3 = ShapeTransforms.rotatedCopyOf(lamp2, Math.PI/4.0);
	
	g2.draw(lamp3);
	
	// @@@ FINALLY, SIGN AND LABEL YOUR DRAWING
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Lightbulbs and a few lamps by Andrew Polk", 20,20);
    }
    
    /** Draw a different picture with a few lamps
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of lamps by Andrew Polk", 20,20);
	
	
	// Draw some lamps.
	
	Lamp large = new Lamp(100,50,225,150);
	Lamp small = new Lamp(20,50,40,30);
	Shape lamp3 = ShapeTransforms.scaledCopyOfLL(small, 1, 1.5);
	lamp3 = ShapeTransforms.translatedCopyOf(lamp3, 50, 50);
	lamp3 = ShapeTransforms.rotatedCopyOf(lamp3, Math.PI/2.0);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(small);
	g2.setColor(Color.BLUE); g2.draw(lamp3);
	
    }       
}
