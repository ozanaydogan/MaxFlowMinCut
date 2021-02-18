package deneme;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class panel_3 extends JPanel {
	

	/**
	 * 
	 */
	public static int[][] matris1;
	public static int[][] matris2;
	private static final long serialVersionUID = 1L;
	public panel_3(int[][] matris1,int[][] matris2) {
	
		dugumLabel = new JLabel[matris1.length][matris1.length];
		dugumLabel2 = new JLabel[matris1.length][2];
		this.matris1=matris1;
		this.matris2=matris2;
		for(int i=0; i< matris1.length; i++)
		{
			for(int j=0; j<matris1.length ; j++)
			{
				dugumLabel[i][j] = new JLabel();
				dugumLabel[i][j].setBounds((40*(j+2)),(40*(i+2)),30,30);
				dugumLabel[i][j].setText(Integer.toString(this.matris1[i][j]));
				this.add(dugumLabel[i][j]);
			}
		}
		
		for(int i=0; i< matris1.length; i++)
		{
			for(int j=0; j<2 ; j++)
			{
				dugumLabel2[i][j] = new JLabel();
				dugumLabel2[i][j].setBounds((40*(matris1.length+j+3)),(40*(i+2)),30,30);
				dugumLabel2[i][j].setText(Integer.toString(this.matris2[i][j]));
				this.add(dugumLabel2[i][j]);
			}
		}
		/*dugumLabel = new JLabel();
		dugumLabel.setText(Integer.toString(this.matris[0][0]));
		dugumLabel.setBounds(60,40,160,50);
		this.add(dugumLabel);*/
		this.setLayout(null);
	}
	 	JLabel dugumLabel[][];
	 	JLabel dugumLabel2[][];
	   JTextField  dugumText;
	   JLabel success ;		   
	   JButton button ;
}
