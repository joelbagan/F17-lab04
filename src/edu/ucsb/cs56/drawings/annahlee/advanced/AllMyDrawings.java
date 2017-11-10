package edu.ucsb.cs56.drawings.annahlee.advanced;

import java.awt.Graphics2D;
import java.awt.Shape; // general class for shapes
import java.awt.Color; // class for Colors
import java.awt.Stroke;
import java.awt.BasicStroke;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;
import java.awt.Rectangle;
import java.awt.geom.GeneralPath;

import edu.ucsb.cs56.drawings.utilities.ShapeTransforms;
import edu.ucsb.cs56.drawings.utilities.GeneralPathWrapper;

/**
 * A class with static methods for drawing various pictures
 * 
 * @author Anna Lee
 * @version for UCSB CS56, F17 
 */

public class AllMyDrawings
{
    /** Draw a picture with 2 basic Consoles */
    public static void drawPicture1(Graphics2D g2) {
	// BLACK original console
	Console c1 = new Console(100, 50, 100);
	g2.setColor(Color.BLACK); g2.draw(c1);
	
	// GREEN scaled console
  	Shape c2 = ShapeTransforms.scaledCopyOfLL(c1, 0.5, 0.6);
	c2 = ShapeTransforms.translatedCopyOf(c2, 0, 200);
	g2.setColor(Color.GREEN); g2.draw(c2);

	g2.setColor(Color.BLACK);
	g2.drawString("Consoles by Anna Lee", 20, 20);
    }

    /** Draw a picture with a few Gboy consoles */
    public static void drawPicture2(Graphics2D g2) {
	// RED GBoy
	GBoy g1 = new GBoy(250, 50, 100);
	g2.setColor(Color.RED); g2.draw(g1);
	
	// BLUE GBoy that is 2x the size of g1
	Shape g3 = ShapeTransforms.scaledCopyOfLL(g1, 4, 4);
	g3 = ShapeTransforms.translatedCopyOf(g1, 0, 200);
	g2.setColor(Color.BLUE); g2.draw(g3);

	GBoy g6 = new GBoy(100, 100, 300);
	g2.setColor(Color.CYAN); g2.draw(g6);

	g2.setColor(Color.BLACK);
	g2.drawString("FINALLY IT WORKED!!!!! by Anna Lee", 20, 20);
    }	

    /** Draw a picture with a smaller GBoy and a GBoy that's rotated */
    public static void drawPicture3(Graphics2D g2) {
	// CYAN slightly smaller GBoy
	GBoy g4 = new GBoy(400, 50, 80);
	g2.setColor(Color.CYAN); g2.draw(g4);

	// ORANGE GBoy, rotated 90 degrees
	GBoy g5 = new GBoy(400, 200, 100);
	g2.setColor(Color.ORANGE);
	Shape g5r = ShapeTransforms.rotatedCopyOf(g5, Math.PI/-2.0);
	g2.draw(g5);

	// @@@ Label Drawing
	g2.setColor(Color.BLACK); 
	g2.drawString("Rotated Console by Anna Lee", 20, 20);
    }
}
