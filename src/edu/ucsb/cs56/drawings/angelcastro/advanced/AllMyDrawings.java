package edu.ucsb.cs56.drawings.angelcastro.advanced;

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
 * @author Angel Castro
 * @version for UCSB CS56, W17 
 */

public class AllMyDrawings
{
    /** Draw a picture with a few Emojis
     */
    
    public static void drawPicture1(Graphics2D g2) {
	
	Emoji  h1 = new Emoji(100,250,50);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	// Make a black Emoji that's half the size, 
	// and moved over 150 pixels in x direction
	
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a Emoji  that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	// Draw two smiley emojis
	
	SmileyEmoji hw1 = new SmileyEmoji(50,350,40);
	SmileyEmoji hw2 = new SmileyEmoji(200,350,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); g2.draw(hw2);
	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A few Emojis by AngelCastro", 20,20);
    }
    
    
    /** Draw a picture with a few smiley Emojis
     */
    public static void drawPicture2(Graphics2D g2) {
	
	// Draw some SmileyEmojis
	
	SmileyEmoji large = new SmileyEmoji(100,50,225);
	SmileyEmoji smallCC = new SmileyEmoji(20,50,40);
	SmileyEmoji tallSkinny = new SmileyEmoji(20,150,20);
	SmileyEmoji  shortFat = new SmileyEmoji(20,250,40);
	SmileyEmoji normal = new SmileyEmoji(200,200, 50);
	g2.setColor(Color.BLACK);   g2.draw(normal);	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	g2.setColor(Color.BLUE);    g2.draw(tallSkinny);
	g2.setColor(Color.MAGENTA); g2.draw(shortFat);
	
	SmileyEmoji h1 = new SmileyEmoji(100,250,50);
	g2.setColor(Color.CYAN); g2.draw(h1);
	
	// Make a black Emoji  that's half the size, 
	// and moved over 150 pixels in x direction
	Shape h2 = ShapeTransforms.scaledCopyOfLL(h1,0.5,0.5);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	g2.setColor(Color.BLACK); g2.draw(h2);
	
	// Here's a Emoji that's 4x as big (2x the original)
	// and moved over 150 more pixels to right.
	h2 = ShapeTransforms.scaledCopyOfLL(h2,4,4);
	h2 = ShapeTransforms.translatedCopyOf(h2,150,0);
	
	// We'll draw this with a thicker stroke
	Stroke thick = new BasicStroke (4.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL);       
	
	// for hex colors, see (e.g.) http://en.wikipedia.org/wiki/List_of_colors
	// #002FA7 is "International Klein Blue" according to Wikipedia
	// In HTML we use #, but in Java (and C/C++) its 0x
	
	Stroke orig=g2.getStroke();
	g2.setStroke(thick);
	g2.setColor(new Color(0x002FA7)); 
	g2.draw(h2); 
	
	// Draw two Smiling Emojis
	
	SmileyEmoji hw1 = new SmileyEmoji(50,350,40);
	SmileyEmoji  hw2 = new SmileyEmoji(200,350,100);
	
	g2.draw(hw1);
	g2.setColor(new Color(0x8F00FF)); 
	
	// Rotate the second Emoji 45 degrees around its center.
	Shape hw3 = ShapeTransforms.rotatedCopyOf(hw2, Math.PI/4.0);
	
	g2.draw(hw3);

	
	g2.setStroke(orig);
	g2.setColor(Color.BLACK); 
	g2.drawString("A bunch of Smiley Emojis by Angel Castro", 20,20);
    }
    
    /** Draw a different picture with a few smiling emojis
     */
    
    public static void drawPicture3(Graphics2D g2) {
	
	// label the drawing
	
	g2.drawString("A bunch of Emojis by Angel Castro", 20,20);
	
	
	// Draw some emojis
	
	SmileyEmoji large = new SmileyEmoji(100,50,225);
	SmileyEmoji  smallCC = new SmileyEmoji(20,50,40);
	
	g2.setColor(Color.RED);     g2.draw(large);
	g2.setColor(Color.GREEN);   g2.draw(smallCC);
	
    }       
}
