package deneme;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class panel_1 extends JPanel {
		
		   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public panel_1() {
		dugumLabel.setBounds(60,40,160,50);
		dugumText.setBounds(60,80,120,30);
		success.setBounds(60,160,60,30);
		button.setBounds(60,120,60,30);
		dugumLabel2.setBounds(60,200,160,50);
		dugumText2.setBounds(60,240,40,30);
		dugumLabel3.setBounds(60,280,180,50);
		dugumText3.setBounds(60,320,40,30);
		this.add(dugumLabel);
		this.add(dugumText);
		this.add(success);
		this.add(button);
		
		this.add(dugumText2);
		this.add(dugumText3);
		
		this.add(dugumLabel2);
		this.add(dugumLabel3);
		
		this.setLayout(null);
	}
	
		   JLabel dugumLabel = new JLabel("Düðüm sayisi giriniz..");	  
		   JLabel dugumLabel2 = new JLabel("giriþ vanasi hangi dügüm ?");
		   JLabel dugumLabel3 = new JLabel("cikis muslugu hangi dügüm ?");
		   
		   JTextField  dugumText = new JTextField(20);
		   JLabel success = new JLabel();		   
		   JButton button = new JButton("giriþ");
		   
		   JTextField  dugumText2 = new JTextField(20);
		   JTextField  dugumText3 = new JTextField(20);
		   
}
