

package javaapplication8;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JFrame;


public class MyShape extends JFrame{
    
    ArrayList<DateShape> garray = new ArrayList<DateShape>();
    
    
    public MyShape(DateShape dshape){
        garray.add(dshape);

    }

    @Override
    public void paint(Graphics g) {

          super.paint(g);
        for(DateShape dsh: garray){
            
            if(dsh.getrb().getName().toString().equals("circle"))
            {              
                        g.setColor(dsh.getgr3().getColor());
             g.fillOval((int) dsh.getgr3().getClip().getBounds2D().getX(),(int) dsh.getgr3().getClip().getBounds2D().getY(),
             (int) dsh.getgr3().getClip().getBounds2D().getWidth(),(int) dsh.getgr3().getClip().getBounds2D().getHeight());

             
            }
            if(dsh.getrb().getName().toString().equals("square"))
            {              
                        g.setColor(dsh.getgr4().getColor());
             g.fillRect(dsh.getgr4().getClipBounds().x, dsh.getgr4().getClipBounds().y,
                              dsh.getgr4().getClipBounds().width, dsh.getgr4().getClipBounds().height);
            }
            if(dsh.getrb().getName().toString().equals("rect"))
            {              

                g.setColor(dsh.getgr1().getColor());
                      g.fillRect(dsh.getgr1().getClipBounds().x, dsh.getgr1().getClipBounds().y,
                              dsh.getgr1().getClipBounds().width, dsh.getgr1().getClipBounds().height);
                      
                      
            
            }
            if(dsh.getrb().getName().toString().equals("oval"))
            {              
                        g.setColor(dsh.getgr2().getColor());
             g.fillOval((int) dsh.getgr2().getClip().getBounds2D().getX(),(int) dsh.getgr2().getClip().getBounds2D().getY(),
             (int) dsh.getgr2().getClip().getBounds2D().getWidth(),(int) dsh.getgr2().getClip().getBounds2D().getHeight());

            }
           

        }

 
    }
    
    
}
