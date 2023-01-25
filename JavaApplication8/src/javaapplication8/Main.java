
package javaapplication8;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class Main extends JFrame implements MouseListener, MouseMotionListener,KeyListener, ActionListener, Runnable{


    int rectX1 = 0, rectY1 = 0, rectX2 = 0, rectY2 = 0;
    int rec, xrec, yrec, srec;
    
    Color color1;
    JRadioButton rB1 = new JRadioButton("circle");
    JRadioButton rB2 = new JRadioButton("square");
    JRadioButton rB3 = new JRadioButton("rect");
    JRadioButton rB4 = new JRadioButton("oval");
    JRadioButton rB5 = new JRadioButton("Clear Shape");
    JButton colorB = new JButton("Select Color");
    JRadioButton rBb=new JRadioButton();
    ArrayList<MyShape> myShapes = new ArrayList<MyShape>();
    
    MyShape myshape;
    
    public Main(){
        rB1.setName("circle");
           rB2.setName("square");
              rB3.setName("rect");
                 rB4.setName("oval");
        Container c = getContentPane();
        setSize(900, 600);
        setLocation(250, 100);
        FlowLayout layout = new FlowLayout();
        c.setLayout(layout);
        JPanel panel = new JPanel();
        panel.setLayout(layout);
        panel.setBackground(Color.WHITE);
        

        ButtonGroup bg = new ButtonGroup();
        bg.add(rB1);
        bg.add(rB2);
        bg.add(rB3);
        bg.add(rB4);
        bg.add(rB5);
        panel.add(rB1);
        panel.add(rB2);
        panel.add(rB3);
        panel.add(rB4);
        panel.add(rB5);
        panel.add(colorB);
//     panel.add(tip);
        c.add(panel);
       
        addMouseListener(this);
        addMouseMotionListener(this);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        rB1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
              rBb=rB1;
            }
        });
          rB2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
              rBb=rB2;
            }
        });
          rB3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
              rBb=rB3;
            }
        });
          rB4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
              rBb=rB4;
            }
        });
        
        colorB.addActionListener(this);
    }
    
    public static void main(String[] args) {
        new Main();
    }
    
    public void actionPerformed(ActionEvent e) {
        color1 = JColorChooser.showDialog(this, "Select a color", null);
    }

    public void mouseClicked(MouseEvent e) {

    }

    public void mousePressed(MouseEvent e) {
        rectX1 = e.getX();
            rectY1 = e.getY();
    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mouseDragged(MouseEvent e) {
        DateShape dateshape = new DateShape();
        Graphics graf1 = getGraphics();
        Graphics graf2 = getGraphics();
        Graphics graf3 = getGraphics();
        Graphics graf4 = getGraphics();
        
           
            rectX2 = e.getX();
            rectY2 = e.getY();
            xrec = Math.min(rectX1, rectX2);
            yrec = Math.min(rectY1, rectY2);
            
            if(rB3.isSelected() || rB4.isSelected()){
                srec = Math.abs(rectX2 - rectX1);
                rec = Math.abs(rectY2 - rectY1);
                
                Shape rectShape = new Rectangle(xrec, yrec, srec, rec);
                graf1.setClip(rectShape);

                Shape ovalshape = new Ellipse2D.Double(xrec, yrec, srec, rec);
                graf2.setClip(ovalshape);
                
            }else if(rB1.isSelected() || rB2.isSelected()){
                srec = Math.max(Math.abs(rectY2 - rectY1), Math.abs(rectX2 - rectX1));
                rec = Math.max(Math.abs(rectY2 - rectY1), Math.abs(rectX2 - rectX1));
                
                Shape circshape = new Ellipse2D.Double(xrec, yrec, srec, rec);
                graf3.setClip(circshape);
                
                Shape sqrShape = new Rectangle(xrec, yrec, srec, rec);
                graf4.setClip(sqrShape);
                
            }
            
            

            
            graf1.setColor(color1);
            dateshape.setgr1(graf1);
            
            graf2.setColor(color1);
            dateshape.setgr2(graf2);
            
            graf3.setColor(color1);
            dateshape.setgr3(graf3);
            
            graf4.setColor(color1);
            dateshape.setgr4(graf4);

            dateshape.setrb(rBb);
            
            myshape = new MyShape(dateshape);
           myshape.paint(getGraphics());

    }

    public void mouseMoved(MouseEvent e) {

    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }

    public void run() {

    }

}
