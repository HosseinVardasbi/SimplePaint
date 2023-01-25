

package javaapplication8;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;
import javax.swing.JRadioButton;

public class DateShape {
    private JRadioButton rB;
      private  Color color;
      private Shape shape;
      private Graphics graphics1;
      private Graphics graphics2;
      private Graphics graphics3;
      private Graphics graphics4;
      
      public void setgr1(Graphics _graphics1)
       {
           this.graphics1=_graphics1;
       }
        public Graphics getgr1()
       {
           return graphics1;
       }
        
        public void setgr2(Graphics _graphics2)
       {
           this.graphics2=_graphics2;
       }
        public Graphics getgr2()
       {
           return graphics2;
       }
        
        public void setgr3(Graphics _graphics3)
       {
           this.graphics3=_graphics3;
       }
        public Graphics getgr3()
       {
           return graphics3;
       }
        
        public void setgr4(Graphics _graphics4)
       {
           this.graphics4=_graphics4;
       }
        public Graphics getgr4()
       {
           return graphics4;
       }
      
      
      
       public void setrb(JRadioButton _rb)
       {
           this.rB=_rb;
       }
        public JRadioButton getrb()
       {
           return rB;
       }
       
          
}
