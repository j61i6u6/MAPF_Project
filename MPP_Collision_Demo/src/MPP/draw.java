package MPP;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.*;
	

public class draw {
	 public static ArrayList Colorset = new ArrayList();
	 public static JFrame frame = new JFrame("AWTDemo");
	 
	 public static void draw(ArrayList obs,ArrayList r) {
		 	//Frame frame = new Frame("AWTDemo");
	        //ArrayList Colorset = initializeColor(MPP.Main_Dynamic.num);
	        frame.setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
	        frame.setSize(525,525);
	        frame.getContentPane().removeAll();
	        ArrayList Trans_Obs = nodeTransform(obs);
	        ArrayList r_node = new ArrayList();
	        
	        for(int x=0;x<r.size();x++)
	        {
	        	r_node.add(((robot)r.get(x)).current_position);
	        }
	        ArrayList Trans_robot = nodeTransform(r_node);
	        
	        for(int i=0;i<100;i++) {
	        	
	        	JPanel panel = new JPanel();
	        	panel.setPreferredSize(new Dimension(50,50));
	 	        panel.setBackground(Color.WHITE);
	 	        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));
	 	        for(int j=0;j<Trans_Obs.size();j++)
	 	        {
	 	        	if((int)Trans_Obs.get(j)==i)
	 	        	{
	 	        		panel.setBackground(Color.black);
	 	        	}
	 	        }
	 	        
	 	        for(int k=0;k<Trans_robot.size();k++)
	 	        {
	 	        	if((int)Trans_robot.get(k)==i)
	 	        	{
	 	        		Color tempColor = (Color) Colorset.get(((robot)r.get(k)).number);
	 	        		panel.setBackground(tempColor);
	 	        		JLabel r_name = new JLabel("R"+((robot)r.get(k)).number);
	 	        		String pos = ((((robot)r.get(k)).current_position).getName());
	 	        		JLabel r_pos = new JLabel(pos);
	 	        		r_name.setHorizontalAlignment(JLabel.CENTER);
	 	        		r_pos.setHorizontalAlignment(JLabel.CENTER);
	 	        		r_name.setVerticalAlignment(JLabel.CENTER);
	 	        		r_pos.setVerticalAlignment(JLabel.CENTER);
	 	        		r_name.setForeground(Color.WHITE);
	 	        		r_pos.setForeground(Color.WHITE);
	 	        		panel.add(r_name);
	 	        		panel.add(r_pos);
	 	        		
	 	        	}
	 	        }
	 	        
	 	        frame.add(panel);
	 	        frame.addWindowListener(new WindowAdapter() {
	 	        	public void windowClosing(WindowEvent we) {
	 	        		//MPP.Main_Dynamic.windowCheck = true;
	 	        		frame.dispose();
	 	        		
	 	        	}
	 	        });
//	 	        JPanel p = new JPanel();
//	 	        p.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
//	 	        frame.add(p);
	        }
	        //frame.revalidate();
	        frame.setVisible(true);
	        frame.setLocationRelativeTo(null);
	        
	    }
	public static ArrayList initializeColor(int robotnum)
	{
		ArrayList Colorset = new ArrayList();
		for(int i=0; i<robotnum;i++)
		{
			Color tempColor = new Color((int)(Math.random() * 0x1000000));
			Colorset.add(tempColor);
		}
		
		return Colorset;
	}
	 
	 
	public static ArrayList nodeTransform(ArrayList nodeArr)
	{
		ArrayList tempArr = new ArrayList();
		for(int i=0;i<nodeArr.size();i++)
		{
			switch(((Node) nodeArr.get(i)).getName())
			{
				case "A":
					tempArr.add(0);
					break;
				case "B":
					tempArr.add(1);
					break;
				case "C":
					tempArr.add(2);
					break;
				case "D":
					tempArr.add(3);
					break;
				case "E":
					tempArr.add(4);
					break;
				case "AA":
					tempArr.add(5);
					break;
				case "AB":
					tempArr.add(6);
					break;
				case "AC":
					tempArr.add(7);
					break;
				case "AD":
					tempArr.add(8);
					break;
				case "AE":
					tempArr.add(9);
					break;
				case "F":
					tempArr.add(10);
					break;	
				case "G":
					tempArr.add(11);
					break;
				case "H":
					tempArr.add(12);
					break;
				case "I":
					tempArr.add(13);
					break;
				case "J":
					tempArr.add(14);
					break;
				case "AF":
					tempArr.add(15);
					break;
				case "AG":
					tempArr.add(16);
					break;
				case "AH":
					tempArr.add(17);
					break;
				case "AI":
					tempArr.add(18);
					break;
				case "AJ":
					tempArr.add(19);
					break;
				case "K":
					tempArr.add(20);
					break;
				case "L":
					tempArr.add(21);
					break;
				case "M":
					tempArr.add(22);
					break;
				case "N":
					tempArr.add(23);
					break;
				case "O":
					tempArr.add(24);
					break;
				case "AK":
					tempArr.add(25);
					break;
				case "AL":
					tempArr.add(26);
					break;
				case "AM":
					tempArr.add(27);
					break;
				case "AN":
					tempArr.add(28);
					break;
				case "AO":
					tempArr.add(29);
					break;
				case "P":
					tempArr.add(30);
					break;
				case "Q":
					tempArr.add(31);
					break;
				case "R":
					tempArr.add(32);
					break;
				case "S":
					tempArr.add(33);
					break;
				case "T":
					tempArr.add(34);
					break;
				case "AP":
					tempArr.add(35);
					break;
				case "AQ":
					tempArr.add(36);
					break;
				case "AR":
					tempArr.add(37);
					break;
				case "AS":
					tempArr.add(38);
					break;
				case "AT":
					tempArr.add(39);
					break;
				case "U":
					tempArr.add(40);
					break;
				case "V":
					tempArr.add(41);
					break;
				case "W":
					tempArr.add(42);
					break;
				case "X":
					tempArr.add(43);
					break;
				case "Y":
					tempArr.add(44);
					break;
				case "AU":
					tempArr.add(45);
					break;
				case "AV":
					tempArr.add(46);
					break;
				case "AW":
					tempArr.add(47);
					break;
				case "AX":
					tempArr.add(48);
					break;
				case "AY":
					tempArr.add(49);
					break;
				case "BA":
					tempArr.add(50);
					break;
				case "BB":
					tempArr.add(51);
					break;
				case "BC":
					tempArr.add(52);
					break;
				case "BD":
					tempArr.add(53);
					break;
				case "BE":
					tempArr.add(54);
					break;
				case "CA":
					tempArr.add(55);
					break;
				case "CB":
					tempArr.add(56);
					break;
				case "CC":
					tempArr.add(57);
					break;
				case "CD":
					tempArr.add(58);
					break;
				case "CE":
					tempArr.add(59);
					break;
				case "BF":
					tempArr.add(60);
					break;
				case "BG":
					tempArr.add(61);
					break;
				case "BH":
					tempArr.add(62);
					break;
				case "BI":
					tempArr.add(63);
					break;
				case "BJ":
					tempArr.add(64);
					break;
				case "CF":
					tempArr.add(65);
					break;
				case "CG":
					tempArr.add(66);
					break;
				case "CH":
					tempArr.add(67);
					break;
				case "CI":
					tempArr.add(68);
					break;
				case "CJ":
					tempArr.add(69);
					break;
				case "BK":
					tempArr.add(70);
					break;
				case "BL":
					tempArr.add(71);
					break;
				case "BM":
					tempArr.add(72);
					break;
				case "BN":
					tempArr.add(73);
					break;
				case "BO":
					tempArr.add(74);
					break;
				case "CK":
					tempArr.add(75);
					break;
				case "CL":
					tempArr.add(76);
					break;
				case "CM":
					tempArr.add(77);
					break;
				case "CN":
					tempArr.add(78);
					break;
				case "CO":
					tempArr.add(79);
					break;
				case "BP":
					tempArr.add(80);
					break;
				case "BQ":
					tempArr.add(81);
					break;
				case "BR":
					tempArr.add(82);
					break;
				case "BS":
					tempArr.add(83);
					break;
				case "BT":
					tempArr.add(84);
					break;
				case "CP":
					tempArr.add(85);
					break;
				case "CQ":
					tempArr.add(86);
					break;
				case "CR":
					tempArr.add(87);
					break;
				case "CS":
					tempArr.add(88);
					break;
				case "CT":
					tempArr.add(89);
					break;
				case "BU":
					tempArr.add(90);
					break;
				case "BV":
					tempArr.add(91);
					break;
				case "BW":
					tempArr.add(92);
					break;
				case "BX":
					tempArr.add(93);
					break;
				case "BY":
					tempArr.add(94);
					break;
				case "CU":
					tempArr.add(95);
					break;
				case "CV":
					tempArr.add(96);
					break;
				case "CW":
					tempArr.add(97);
					break;
				case "CX":
					tempArr.add(98);
					break;
				case "CY":
					tempArr.add(99);
					break;
			}
		}
		return tempArr;
	}
	
	}
	 
//	class AdapterDemo extends WindowAdapter {
//	    public void windowClosing(WindowEvent e) {
//	       MPP.Main_Dynamic.thread.notify();
//	       dispose();
//	    }
//	}
