package deneme;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class panel_2 extends JPanel{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	public static int kac_dugum;
	
	public panel_2(int x) {
			
			kac_dugum = x;
			dugumtext    = new  JTextField[x][x];
			dugumlabell  = new  JLabel[x];
			dugumlabell2 = new  JLabel[x];
			dugumtext2 = new JTextField[x][2] ;
			
			dugumLabel = new JLabel("xd");
			dugumLabel.setBounds(20,20,20,20);
			this.add(dugumLabel);
			
			button = new JButton("deneme");
			button.setBounds(30,(40*(x+1))+40,100,30);
			this.add(button);
			

			
			for(int i=0;i<x;i++) {
				for(int j=0;j<x;j++) {
					
					dugumtext[i][j] = new JTextField(20);
					dugumtext[i][j].setBounds((40*(j+2)),(40*(i+2)),30,30);
					this.add(dugumtext[i][j]);
					
				}	
				dugumlabell[i] = new JLabel();
				dugumlabell2[i] = new  JLabel();
				dugumlabell[i].setText(Integer.toString(i+1));
				dugumlabell2[i].setText(Integer.toString(i+1));
				dugumlabell[i].setBounds((41*(i+2)),30,30,30);
				dugumlabell2[i].setBounds(40,(40*(i+2)),30,30);
				this.add(dugumlabell[i]);
				this.add(dugumlabell2[i]);
				
			}
			
			
		/*	for(int m=0 ; m<x ; m++) {
				for(int n=0 ; n<2 ; n++) {
					dugumtext2[m][n] = new JTextField(20);
					dugumtext2[m][n].setBounds((40*(x+n+3)),(40*(m+2)),30,30);
					this.add(dugumtext2[m][n]);
				}	
			}
		*/	
			
			

		this.setLayout(null);
		
		
	}
	
	   JLabel dugumLabel;
	   JButton button ;	   
	   JLabel dugumLabel2 ;  
	   JLabel dugumLabel3 ; 
	   JLabel dugumLabel4 ;  
	   JLabel[] dugumlabell ;
	   JLabel[] dugumlabell2 ;
	   
	   JTextField[][] dugumtext;
	   JTextField[][] dugumtext2;
	   

}
