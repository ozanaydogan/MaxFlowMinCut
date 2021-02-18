package deneme;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class panel_6 extends JPanel{

	/**
	 * 
	 */
	static int h;
	static int t;
	
	double phi;
    int barb;
    public static int t_t;
    JLabel[] success ;
	public static int [][]matris1;
	public static int [][]matris2;
	public static int [][]matrismincut;
	private static final long serialVersionUID = 1L;
	public static JButton  button1 = new JButton("back");

	public panel_6(int[][]matrismincut, int[][]matris3, int[][]matrisxy,int t_t) {
		
		panel_6.matris1=matris3;
		panel_6.matris2=matrisxy;
		panel_6.matrismincut=matrismincut;
		panel_6.t_t = t_t;
		success = new JLabel[t_t];
		
		for(int i =0;i<t_t;i++) {
			  success[i] = new JLabel();
			  success[i].setBounds(60,500+i*50,60,30);
			  success[i].setText(Integer.toString(matrismincut[i][0]+1)+"-"+Integer.toString(matrismincut[i][1]+1));
			  this.add(success[i]);
			}	
		
		button1.setBounds(200,500,120,30);
		
		this.add(button1);
		
		
		
		this.setLayout(null);		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);
		
        for(int i=0 ; i<this.matris1.length;i++) {
        	
        	if(i==h) {
        		g2.setColor(Color.GREEN);
        		g2.drawOval(this.matris2[i][0],this.matris2[i][1],50,50);
        		
        		g2.setColor(Color.BLACK);

		        g2.drawString(Integer.toString(i+1),this.matris2[i][0]+22,this.matris2[i][1]+28);
        		continue;
        	}
        	
        	if(i==t)
        	{
        		g2.setColor(Color.ORANGE);
        		g2.drawOval(this.matris2[i][0],this.matris2[i][1],50,50);
        		
        		g2.setColor(Color.BLACK);
        		g2.drawString(Integer.toString(i+1),this.matris2[i][0]+22,this.matris2[i][1]+28);
        		continue;
        	}
        	
        	
        	g2.setColor(Color.RED);
			g2.drawOval(this.matris2[i][0],this.matris2[i][1],50,50);
			
			g2.setColor(Color.BLACK);
			g2.drawString(Integer.toString(i+1),this.matris2[i][0]+22,this.matris2[i][1]+28);
        	
						
		}
		
		
		for(int i=0 ; i<this.matris1.length;i++) {
			
				for(int j=0 ; j<this.matris1.length;j++) {
				
				if(this.matris1[i][j]>0) {
					int sayac=0;
					int flag =0;
					while(sayac<t_t) {
						
						if(matrismincut[sayac][0]==i && matrismincut[sayac][1]==j ) {
							flag++;
						}
						sayac++;
						
					}
					
					int  m= ((matris2[i][0]+25)+(matris2[j][0]+25))/2;
					int  n= ((matris2[i][1]+25)+(matris2[j][1]+25))/2;
					
					int k= (m+(matris2[i][0]+25))/2;
					int l= (n+matris2[i][1]+25)/2;
					
					int k1= (k+(matris2[i][0]+25))/2;
					int l1= (l+matris2[i][1]+25)/2;
					
					int a = (m+matris2[j][0]+25)/2;
					int b = (n+matris2[j][1]+25)/2;
					
					int a1 = (a+matris2[j][0]+25)/2;
					int b1 = (b+matris2[j][1]+25)/2;
					
					int a2 = (a1+m)/2;
					int b2 = (b1+n)/2;
					
					if(Math.abs(matris2[i][0]-matris2[j][0])>299 || Math.abs(matris2[i][1]-matris2[j][1])>299) {
						
						k= (k1+(matris2[i][0]+25))/2;
						l= (l1+matris2[i][1]+25)/2;
						
						a = (a1+matris2[j][0]+25)/2;
						b = (b1+matris2[j][1]+25)/2;
						
						Point sw = new Point(k,l);
				        Point ne = new Point(a,b);
				       
				        
				        if(flag>0) {
				        g2.setColor(Color.RED);
				        g2.draw(new Line2D.Double(sw, ne));
				       	}
				       else{
				    	   g2.setColor(Color.BLACK);
				    	   g2.draw(new Line2D.Double(sw, ne));
					       }
				        
				        
				     // drawArrowHead(g2, sw, ne, Color.red);
				        drawArrowHead(g2, ne, sw, Color.blue);	
				        continue;
					}
					
					Point sw = new Point(k1,l1);
			        Point ne = new Point(a1,b1);
			        if(flag>0) {
				        g2.setColor(Color.RED);
				        g2.draw(new Line2D.Double(sw, ne));
				       	}
				       else{
				    	   g2.setColor(Color.BLACK);
				    	   g2.draw(new Line2D.Double(sw, ne));
					       } // drawArrowHead(g2, sw, ne, Color.red);
			        drawArrowHead(g2, ne, sw, Color.blue);			     
					System.out.println("1231");
				}
			
		}
		 	
		}
		
		for(int i=0 ; i<this.matris1.length;i++) {
			
					for(int j=0 ; j<this.matris1.length;j++) {
				
				if(this.matris1[i][j]>0) {
					int  m= ((matris2[i][0]+25)+(matris2[j][0]+25))/2;
					int  n= ((matris2[i][1]+25)+(matris2[j][1]+25))/2;
					
					int k= (m+(matris2[i][0]+25))/2;
					int l= (n+matris2[i][1]+25)/2;
					
					int k1= (k+(matris2[i][0]+25))/2;
					int l1= (l+matris2[i][1]+25)/2;
					
					int a = (m+matris2[j][0]+25)/2;
					int b = (n+matris2[j][1]+25)/2;
					
					int a1 = (a+matris2[j][0]+25)/2;
					int b1 = (b+matris2[j][1]+25)/2;
					
					int a2 = (a1+m)/2;
					int b2 = (b1+n)/2;
					
						if(Math.abs(matris2[i][0]-matris2[j][0])>250 || Math.abs(matris2[i][1]-matris2[j][1])>250) {
						
						a1 = (a2+matris2[j][0]+25)/2;
						b1 = (b2+matris2[j][1]+25)/2;
				       
				        g2.setColor(Color.WHITE);
				        g2.fillOval(a1-7, b1-7, 15, 15);
				        
				        g2.setColor(Color.MAGENTA);
				        g2.drawString(Integer.toString(matris1[i][j]),a1-5,b1+7);
						System.out.println("444");	
				        continue;
					}
					
			       
			        g2.setColor(Color.WHITE);
			        g2.fillOval(a2-7, b2-7, 15, 15);
					System.out.println("555");
					
					g2.setColor(Color.MAGENTA);
					g2.drawString(Integer.toString(matris1[i][j]),a2-5,b2+7);
				}
			
		}
			
		}
		        
		
		
	
		}
		
		 private void drawArrowHead(Graphics2D g2, Point tip, Point tail, Color color)
		    { 	phi = Math.toRadians(40);
		    	barb = 5;
		        g2.setPaint(color);
		        double dy = tip.y - tail.y;
		        double dx = tip.x - tail.x;
		        double theta = Math.atan2(dy, dx);
		        //System.out.println("theta = " + Math.toDegrees(theta));
		        double x, y, rho = theta + phi;
		        for(int j = 0; j < 2; j++)
		        {
		            x = tip.x - barb * Math.cos(rho);
		            y = tip.y - barb * Math.sin(rho);
		            g2.draw(new Line2D.Double(tip.x, tip.y, x, y));
		            rho = theta - phi;
		        }
		    }
		 
}
