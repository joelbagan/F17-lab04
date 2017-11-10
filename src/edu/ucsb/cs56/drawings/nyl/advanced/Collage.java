package edu.ucsb.cs56.drawings.nyl.advanced;
import java.awt.geom.GeneralPath;  
import java.awt.Shape; 
import java.awt.geom.Rectangle2D;

/**
   A Collage Frame
      
   @author Nery Yaritza Lara Mancia 
   @version for CS56, W17, UCSB
   
*/
public class Collage extends Frame implements Shape
{
    /**
     * Constructor for objects of class Collage
     */
    public Collage(double x, double y, double width, double height)
    {
	// construct basic frame outline
	super(x,y,width,height);
	
	// get the GeneralPath that we are going to append stuff to
	GeneralPath gp = this.get();
	
	// Make picture slot in the collage, spaced like this,
        //
	//	
	// || -------------- ||
	// || |        1   | ||
	// || -------------- ||
	// || -------------- ||
        // || |  2 | 4 | 3 | || 
        // || -------------- ||
	//
	// //the bottom has three pictures, one of them will be made using the space inbetween picture 2 and 3 of the coolage
	// the number of each picture in the collage is indicated inside the frame
	
	double coll1Topy = y + .125*height;
	double coll1Topx = x + .125*width; 
	double collheight = .3*height; //this is the height of every picture slot in the collage
	double coll1width = .75*width; //this is the width of the big collage
	double coll23width = .3*width;//this is the width of the smaller two collage slots
	
	Rectangle2D.Double coll1 =
	    new Rectangle2D.Double(coll1Topx, (y+.575*height), coll1width, collheight);
	Rectangle2D.Double coll2 =
	    new Rectangle2D.Double(coll1Topx, (y+.575*height), coll23width, collheight);
	Rectangle2D.Double coll3 =
	    new Rectangle2D.Double((x+.575*width), (y+.575*height), coll23width, collheight);
	
	// add the collage slots to the frame 
	// Look up the meaning of the second parameter of append
	// (Hint--is a method of "GeneralPath")
	
        GeneralPath wholecollage = this.get();
        wholecollage.append(coll1, false);
        wholecollage.append(coll2, false);
        wholecollage.append(coll3, false); 
    }    
}
