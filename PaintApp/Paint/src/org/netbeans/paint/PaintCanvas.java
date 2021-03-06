/*
 * Copyright (c) 2010, Oracle. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * * Neither the name of Oracle nor the names of its contributors
 *   may be used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */
 
 
 /*
 
  EM DIC AITOR CERECETO I SER� EL REI DELS PIRATES NINJA SUPERGUERRER DEL ESPAI
 
 */
package org.netbeans.paint;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import javax.swing.JComponent;

/**
 *
 * @author Tim Boudreau
 * Modificacio que canvia tot el funcionament del programa - By Arnau Gonzalez
 */
 
 //Arnau Gonzalez Pujado ha pasat per aqui...
public class PaintCanvas extends JComponent {
    private int brushDiameter = 10;
    private final MouseL mouseListener = new MouseL();
    private BufferedImage backingImage = null;
    private final BrushSizeView brushView = new BrushSizeView();
    private Color color = Color.BLUE;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> 7565adb58f25900f2019934d9df5d21e8e4ac1f8
    //oussama
=======
	//JordiMunozRuiz
	private boolean maleitTemps = true;
>>>>>>> devel_fx_munoz_jordi


	// modificacion ihar sidliarevich

    public PaintCanvas() {
        addMouseListener(mouseListener);
        addMouseMotionListener(mouseListener);
        setBackground(Color.WHITE);
        setFocusable(true);
    }

    
    //aquest comentari pertanys a oussama

	//Jordi Rabell's comment

//comentari Ester

    public void setBrush(int diam) {
        this.brushDiameter = diam;
    }
    public int Ejercicio5IvanMendez(){
      return 5;  //Ejercicio 5 b)
    }

    public void setBrushDiameter(int val) {
        this.brushDiameter = val;
        brushView.repaint();
    }

    public int getBrushDiameter() {
        return brushDiameter;
    }

    public void setColor(Color c) {
        this.color = c;
        brushView.repaint();
    }

    public Color getColor() {
        return color;
    }

    public void clear() {
        backingImage = null;
        repaint();
    }
    public int MENDEZLOBATO(){
    return 7; //Comentario hecho por ivan mendez
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawRenderedImage(getImage(), AffineTransform.getTranslateInstance(0, 0));
    }

    JComponent getBrushSizeView() {
		
        return brushView;
    }


    
    public BufferedImage getImage() {
        int width = Math.min(getWidth(), 1900);
        int height = Math.min(getHeight(), 1200);
        if (backingImage == null || backingImage.getWidth() != width || backingImage.getHeight() != height) {
            int newWidth = backingImage == null ? width : Math.max(width, backingImage.getWidth());
            int newHeight = backingImage == null ? height : Math.max(height, backingImage.getHeight());
            if (newHeight > height && newWidth > width && backingImage != null) {
                return backingImage;
            }
            BufferedImage old = backingImage;
            backingImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB_PRE);
            Graphics2D g = backingImage.createGraphics();
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, width, height);
            if (old != null) {
                g.drawRenderedImage(old,
                        AffineTransform.getTranslateInstance(0, 0));
            }
            g.dispose();
            setPreferredSize(new Dimension (newWidth, newHeight));
        }
        return backingImage;
    }

    private class BrushSizeView extends JComponent {
        @Override
        public void paint(Graphics g) {
            ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            Point p = new Point(getWidth() / 2, getHeight() / 2);
            int half = getBrushDiameter() / 2;
            int diam = getBrushDiameter();
            g.setColor(getColor());
            g.fillOval(p.x - half, p.y - half, diam, diam);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension (32, 32);
        }
    }
<<<<<<< HEAD
<<<<<<< HEAD
=======
    
    public void chorrimangueraSupportFactory(){
        
    }
=======
>>>>>>> 7565adb58f25900f2019934d9df5d21e8e4ac1f8
	
	// MadeInJordiMunozRuiz
	private boolean hesuspes(){
		return true;
	}
<<<<<<< HEAD
=======
    
    public void chorrimangueraSupportFactory(){
        
    }
>>>>>>> devel_fx_munoz_jordi

    public void batamanta(){
		//JordiMunozRuiz
		int a = 5;
		int b = 4;
		int c = a+b;
        
=======
<<<<<<< HEAD
>>>>>>> origin/master
=======
>>>>>>> fa141faeaecdd2d847f4323e07718b0c90aaae32
>>>>>>> origin/master

    public void batamanta(){
        // Toni Morales
>>>>>>> 7565adb58f25900f2019934d9df5d21e8e4ac1f8
    }
        
    private final class MouseL extends MouseAdapter implements MouseMotionListener {
        @Override
        public void mouseClicked(MouseEvent e) {
            Point p = e.getPoint();
            int half = brushDiameter / 2;
            Graphics2D g = getImage().createGraphics();
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                               RenderingHints.VALUE_ANTIALIAS_ON);
            g.setPaint(getColor());
            g.fillOval(p.x - half, p.y - half, brushDiameter, brushDiameter);
            g.dispose();
            repaint(p.x - half, p.y - half, brushDiameter, brushDiameter);
        }
        //Cristian TroLopez
        //Cristian Lopez

        @Override
        public void mouseDragged(MouseEvent e) {
            mouseClicked(e);
        }
    }
<<<<<<< HEAD

    // ROMUL FEIXAS A PASSAT PER AQUI
    //UN ALTRE CANVI
=======
    //Cristian Guillén was here..
>>>>>>> ec9a142ce88fb68e850a48ddaf029361262128fe
}
//pppp
