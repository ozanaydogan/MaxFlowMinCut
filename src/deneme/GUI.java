package deneme;



import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

import deneme.MaxFlow_Ford_Fulkerson.Graphx;

public class GUI implements ActionListener{
	
	public GUI() {
		frame = new JFrame();
		frame.setSize(800,800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static JFrame frame ;
	public static int dugum_Sayisi;
	static int page = 0 ;
	static int giris;
	static int cikis;
	
	public static int matrisxy[][];
	public static int matrisgirilen[][];
	public static int matrismincut[][];
	
	public static panel_1 panel1 = new panel_1();
	public static panel_2 panel2 ;
	public static panel_3 panel3 ;
	public static panel_4 panel4 ;
	public static panel_5 panel5 ;
	public static panel_6 panel6 ;
	
	public static JPanel pn ;
	
	public static void main(String args[]) { 	   
		
		GUI ekran = new GUI();
		GUI.frame.add(panel1);
		GUI.frame.setVisible(true);
		panel1.button.addActionListener(al);
				
	    }
	
	static ActionListener al =new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("qeqw");
			GUI.panel1.setVisible(false);
			GUI.frame.remove(panel1);
			dugum_Sayisi=Integer.parseInt(panel1.dugumText.getText());
			panel2 = new panel_2(Integer.parseInt(panel1.dugumText.getText()));	
			GUI.frame.add(panel2);
			GUI.panel2.setVisible(true);
			pn=panel2;
			panel2.button.addActionListener(al2);
			
			giris=(Integer.parseInt(panel1.dugumText2.getText()));
			cikis=(Integer.parseInt(panel1.dugumText3.getText()));
			
		}
	};
	
	static ActionListener al2 =new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {			
			int[][] matris = new int[panel2.kac_dugum][panel2.kac_dugum];
			int[][] matris2 = new int[panel2.kac_dugum][2];
			System.out.println("basarili");
			
			if(pn == panel2) {
			GUI.panel2.setVisible(false);
			}
			if(pn == panel3) {
				GUI.panel3.setVisible(false);
				}
			if(pn == panel4) {
				GUI.panel4.setVisible(false);
				}
			if(pn == panel5) {
				GUI.panel5.setVisible(false);
				}
			if(pn == panel6) {
				GUI.panel6.setVisible(false);
				}
			//GUI.frame.remove(panel2);
			for(int i=0;i<panel2.kac_dugum;i++) {
				for(int j=0;j<panel2.kac_dugum;j++) {
					matris[i][j] = 	Integer.parseInt(panel2.dugumtext[i][j].getText());				
				}
				System.out.println();
			}
			//-----------------------------------------------------------------------------------------------------------------------------------------
			
			/*for(int i=0;i<panel2.kac_dugum;i++) {
				for(int j=0;j<2;j++) {
					System.out.print(Integer.parseInt(panel2.dugumtext2[i][j].getText()));
					matris2[i][j] = 	Integer.parseInt(panel2.dugumtext2[i][j].getText());				
				}
				System.out.println();
				
			}*/
			
			
			matrisgirilen=matris;
			System.out.println("->>>>>>>>>>>"+giris);
			System.out.println("->>>>>>>>>>>"+cikis);
			
			
			
			if(panel2.kac_dugum==12) {
				matris2[0][0]=50;
				matris2[0][1]=200;
				
				matris2[3][0]=225;
				matris2[3][1]=100;
				
				matris2[4][0]=225;
				matris2[4][1]=300;
							
				matris2[1][0]=150;
				matris2[1][1]=100;
				
				matris2[2][0]=150;
				matris2[2][1]=300;
				
				matris2[5][0]=300;
				matris2[5][1]=100;
				
				matris2[6][0]=300;
				matris2[6][1]=300;
				
				matris2[7][0]=450;
				matris2[7][1]=100;
				
				matris2[8][0]=450;
				matris2[8][1]=300;
				
				matris2[9][0]=600;
				matris2[9][1]=100;
				
				matris2[10][0]=600;
				matris2[10][1]=300;
				
				matris2[11][0]=700;
				matris2[11][1]=200;
			}
			
			if(panel2.kac_dugum==11) {
				matris2[0][0]=50;
				matris2[0][1]=200;
				
				matris2[3][0]=225;
				matris2[3][1]=100;
				
				matris2[1][0]=150;
				matris2[1][1]=100;
				
				matris2[2][0]=150;
				matris2[2][1]=300;
				
				matris2[4][0]=300;
				matris2[4][1]=100;
				
				matris2[5][0]=300;
				matris2[5][1]=300;
				
				matris2[6][0]=450;
				matris2[6][1]=100;
				
				matris2[7][0]=450;
				matris2[7][1]=300;
				
				matris2[8][0]=600;
				matris2[8][1]=100;
				
				matris2[9][0]=600;
				matris2[9][1]=300;
				
				matris2[10][0]=700;
				matris2[10][1]=200;
			}
			
			if(panel2.kac_dugum==10) {
				matris2[0][0]=50;
				matris2[0][1]=200;
				
				matris2[1][0]=150;
				matris2[1][1]=100;
				
				matris2[2][0]=150;
				matris2[2][1]=300;
				
				matris2[3][0]=300;
				matris2[3][1]=100;
				
				matris2[4][0]=300;
				matris2[4][1]=300;
				
				matris2[5][0]=450;
				matris2[5][1]=100;
				
				matris2[6][0]=450;
				matris2[6][1]=300;
				
				matris2[7][0]=600;
				matris2[7][1]=100;
				
				matris2[8][0]=600;
				matris2[8][1]=300;
				
				matris2[9][0]=700;
				matris2[9][1]=200;
			}
			
			if(panel2.kac_dugum==9) {
				matris2[0][0]=50;
				matris2[0][1]=200;
				
				matris2[1][0]=150;
				matris2[1][1]=100;
				
				matris2[2][0]=150;
				matris2[2][1]=300;
				
				matris2[3][0]=300;
				matris2[3][1]=100;
				
				matris2[4][0]=300;
				matris2[4][1]=300;
				
				matris2[5][0]=450;
				matris2[5][1]=100;
				
				matris2[6][0]=450;
				matris2[6][1]=300;
				
				matris2[7][0]=600;
				matris2[7][1]=100;
				
				matris2[8][0]=600;
				matris2[8][1]=300;
			}
			
			if(panel2.kac_dugum==8) {
				matris2[0][0]=50;
				matris2[0][1]=200;
				
				matris2[1][0]=150;
				matris2[1][1]=100;
				
				matris2[2][0]=150;
				matris2[2][1]=300;
				
				matris2[3][0]=300;
				matris2[3][1]=100;
				
				matris2[4][0]=300;
				matris2[4][1]=300;
				
				matris2[5][0]=450;
				matris2[5][1]=100;
				
				matris2[6][0]=450;
				matris2[6][1]=300;
				
				matris2[7][0]=550;
				matris2[7][1]=200;
			}
			
			if(panel2.kac_dugum==7) {
				matris2[0][0]=50;
				matris2[0][1]=200;
				
				matris2[1][0]=150;
				matris2[1][1]=100;
				
				matris2[2][0]=150;
				matris2[2][1]=300;
				
				matris2[3][0]=300;
				matris2[3][1]=100;
				
				matris2[4][0]=300;
				matris2[4][1]=300;
				
				matris2[5][0]=450;
				matris2[5][1]=100;
				
				matris2[6][0]=450;
				matris2[6][1]=300;
			
			}
			
			if(panel2.kac_dugum==6) {
				matris2[0][0]=50;
				matris2[0][1]=200;
				
				matris2[1][0]=150;
				matris2[1][1]=100;
				
				matris2[2][0]=150;
				matris2[2][1]=300;
				
				matris2[3][0]=300;
				matris2[3][1]=100;
				
				matris2[4][0]=300;
				matris2[4][1]=300;
				
				matris2[5][0]=400;
				matris2[5][1]=200;
			
			}
			
			if(panel2.kac_dugum==5) {
				matris2[0][0]=50;
				matris2[0][1]=200;
				
				matris2[1][0]=150;
				matris2[1][1]=100;
				
				matris2[2][0]=150;
				matris2[2][1]=300;
				
				matris2[3][0]=300;
				matris2[3][1]=100;
				
				matris2[4][0]=300;
				matris2[4][1]=300;
				
			}
			
			if(panel2.kac_dugum==4) {
				matris2[0][0]=50;
				matris2[0][1]=200;
				
				matris2[1][0]=150;
				matris2[1][1]=100;
				
				matris2[2][0]=150;
				matris2[2][1]=300;
				
				matris2[3][0]=300;
				matris2[3][1]=100;
			
			}
			
			if(panel2.kac_dugum==3) {
				matris2[0][0]=50;
				matris2[0][1]=200;
				
				matris2[1][0]=150;
				matris2[1][1]=100;
				
				matris2[2][0]=150;
				matris2[2][1]=300;
			
			}
			
			if(panel2.kac_dugum==2) {
				matris2[0][0]=50;
				matris2[0][1]=200;
				
				matris2[1][0]=150;
				matris2[1][1]=100;
							
			}
			//-----------------------------------------------------------------------------------------------------------------------------------------
			System.out.println("basarili2");
			for(int i=0;i<panel2.kac_dugum;i++) {
				for(int j=0;j<panel2.kac_dugum;j++) {
					System.out.print(" "+matris[i][j]);
				}
				System.out.println();
			}

			//-----------------------------------------------------------------------------------------------------------------------------------------
			for(int i=0;i<panel2.kac_dugum;i++) {
				for(int j=0;j<2;j++) {
					System.out.print(" "+matris2[i][j]);
				}
				System.out.println();
			}
			//-----------------------------------------------------------------------------------------------------------------------------------------
			
			
			System.out.println("basarili3");
			panel4 = new panel_4(matris,matris2);
			matrisxy=matris2;
			panel4.t=cikis;
			panel4.h=giris;
			GUI.frame.add(panel4);
			GUI.panel4.setVisible(true);
			pn = panel4;
			panel4.button1.addActionListener(al3);
			panel4.button2.addActionListener(al4);
			//panel4.button2.addActionListener(al4);
			
			/*panel3 = new panel_3(matris,matris2);	
			GUI.frame.add(panel3);
			GUI.panel3.setVisible(true);*/
		}
	};
	
	static ActionListener al3 =new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			int[][] matris3 = new int[panel2.kac_dugum][panel2.kac_dugum];
			int v;
			panel5.t=cikis;
			panel5.h=giris;
			MaxFlow_Ford_Fulkerson mf = new MaxFlow_Ford_Fulkerson();
			System.out.println("--------------->"+dugum_Sayisi);
			Graphx gf = new Graphx(dugum_Sayisi,panel4.matris1);
			
			v=gf.findMaxFlow(giris, cikis);
			matris3 = mf.xxresidualGraph;
			
			
			System.out.println("--->>->->");
			for(int i=0;i<panel2.kac_dugum;i++) {
				for(int j=0;j<panel2.kac_dugum;j++) {
				
				System.out.print(" "+matris3[i][j]);
			}
			System.out.println();
			
		}
			
			GUI.panel4.setVisible(false);
			GUI.frame.remove(panel4);
			panel5 = new panel_5(v,matris3,matrisxy);
			panel5.button1.addActionListener(al2);
			GUI.frame.add(panel5);
			GUI.panel5.setVisible(true);	
			pn=panel5;
		}
	};
	
	static ActionListener al4 =new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			panel6.t=cikis;
			panel6.h=giris;
			
			System.out.println("1");
			
			System.out.println("2");
			Graphy grp = new Graphy();
			System.out.println("3");
			grp.minCut(matrisgirilen,giris,cikis);
			System.out.println("4");
			matrismincut=Graphy.matrismc;
			System.out.println("5");
			panel6 = new panel_6(matrismincut,matrisgirilen,matrisxy,grp.t_t);
			System.out.println("6");
			panel6.button1.addActionListener(al2);
			GUI.panel4.setVisible(false);
			GUI.frame.remove(panel4);
			GUI.frame.add(panel6);
			GUI.panel6.setVisible(true);
			pn=panel6;
			System.out.println("7");
			
		}
	};

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	} 
	
		
}
