import javax.swing.border.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
//import javax.swing.border.LineBorder;
class diffFunction{
	char charOperation,a;
	double input1,input2,sol;
	private void module() {
		JFrame frame = new JFrame("Calculator");
		frame.setBounds(80,60,453,710);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setLayout(null);
		
		//TextField1 Code
			JTextField field1 = new JTextField();
			field1.setEditable(false);
			field1.setBorder(new CompoundBorder(new LineBorder(Color.white,3),new LineBorder(Color.black,4)));
			Font fontField1 = new Font("comic sans MS",Font.PLAIN,26);
			field1.setFont(fontField1);
			field1.setBounds(4,10,427,90);
			field1.setHorizontalAlignment(JTextField.RIGHT);
			frame.add(field1);
			field1.setText("0");
		//TextField2 Code
			JTextField field2 = new JTextField();
			field2.setEditable(false);
			field2.setBorder(new CompoundBorder(new LineBorder(Color.lightGray,3),new LineBorder(Color.black,4)));
			Font fontField2 = new Font("comic sans MS",Font.PLAIN,26);
			field2.setFont(fontField2);
			field2.setBounds(4,105,427,60);
			field2.setHorizontalAlignment(JTextField.RIGHT);
		    frame.add(field2);
		    
		//Button1 Code
			JButton button1 = new JButton("1");
			Color currentColor = button1.getBackground();
			button1.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {}
				public void mouseExited(MouseEvent b) {
					button1.setBackground(currentColor);
					}
				public void mouseReleased(MouseEvent c) {}
				public void mouseEntered(MouseEvent k) {
					 button1.setBackground(Color.lightGray);
				}
				public void mousePressed(MouseEvent m) {
					
				}
				
				 
			});
			button1.setBorder(new CompoundBorder(new LineBorder(Color.white,4),new LineBorder(Color.black,4)));
			Font font1 = new Font("comic sans MS",Font.PLAIN,43);
			button1.setFont(font1);
			button1.setBounds(12,180,90,80);
			button1.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				if(field1.getText().equals("0")) {
					field1.setText(null);
				}
				String str1 = field1.getText();
				field1.setText(str1+"1");	
			}});
			frame.add(button1);
		
		//Button2 Code
			JButton button2 = new JButton("2");
			button2.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {}
				public void mouseExited(MouseEvent b) {
					button2.setBackground(currentColor);
					}
				public void mouseReleased(MouseEvent c) {}
				public void mouseEntered(MouseEvent k) {
					 button2.setBackground(Color.lightGray);
				}
				public void mousePressed(MouseEvent m) {
					
				}});
			button2.setBorder(new CompoundBorder(new LineBorder(Color.white,4),new LineBorder(Color.black,4)));
			button2.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				if(field1.getText().equals("0")) {
					field1.setText(null);
				}
				String str2 = field1.getText();
				field1.setText(str2+"2");	
			}});
			Font font2 = new Font("comic sans MS",Font.PLAIN,43);
			button2.setFont(font2);
			button2.setBounds(118,180,90,80);
			frame.add(button2);
		
		//Button3 Code
			JButton button3 = new JButton("3");
			button3.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {}
				public void mouseExited(MouseEvent b) {
					button3.setBackground(currentColor);
					}
				public void mouseReleased(MouseEvent c) {}
				public void mouseEntered(MouseEvent k) {
					 button3.setBackground(Color.lightGray);
				}
				public void mousePressed(MouseEvent m) {
				}});
			button3.setBorder(new CompoundBorder(new LineBorder(Color.white,4),new LineBorder(Color.black,4)));
			button3.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				if(field1.getText().equals("0")) {
					field1.setText(null);
				}
				String str3 = field1.getText();
				field1.setText(str3+"3");	
			}});
			Font font3 = new Font("comic sans MS",Font.PLAIN,43);
			button3.setFont(font3);
			button3.setBounds(224,180,90,80);
			frame.add(button3);
		
		//Button4 Code
			JButton button4 = new JButton("<<");
			button4.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {}
				public void mouseExited(MouseEvent b) {
					button4.setBackground(currentColor);
					}
				public void mouseReleased(MouseEvent c) {}
				public void mouseEntered(MouseEvent k) {
					 button4.setBackground(Color.lightGray);
				}
				public void mousePressed(MouseEvent m) {
				}});
			button4.setBorder(new CompoundBorder(new LineBorder(Color.white,4),new LineBorder(Color.black,4)));
			Font font4 = new Font("comic sans MS",Font.PLAIN,43);
			button4.setFont(font4);
			button4.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				String textContent = field1.getText();
				StringBuilder textModifier = new StringBuilder(textContent);
				if(textContent.length()<2){
					field1.setText("0");
				}
				else{
				textModifier.deleteCharAt((textContent.length())-1);
				field1.setText(textModifier.toString());}
			}});
			
			button4.setBounds(330,180,90,80);
			frame.add(button4);
		
		//Button5 Code
			JButton button5 = new JButton("4");
			button5.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {}
				public void mouseExited(MouseEvent b) {
					button5.setBackground(currentColor);
					}
				public void mouseReleased(MouseEvent c) {}
				public void mouseEntered(MouseEvent k) {
					 button5.setBackground(Color.lightGray);
				}
				public void mousePressed(MouseEvent m) {
				}});
			button5.setBorder(new CompoundBorder(new LineBorder(Color.white,4),new LineBorder(Color.black,4)));
			button5.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				if(field1.getText().equals("0")) {
					field1.setText(null);
				}
				String str4 = field1.getText();
				field1.setText(str4+"4");	
			}});
			Font font5 = new Font("comic sans MS",Font.PLAIN,43);
			button5.setFont(font5);
			button5.setBounds(12,275,90,80);
			frame.add(button5);
		
		//Button6 Code
			JButton button6 = new JButton("5");
			button6.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {}
				public void mouseExited(MouseEvent b) {
					button6.setBackground(currentColor);
					}
				public void mouseReleased(MouseEvent c) {}
				public void mouseEntered(MouseEvent k) {
					 button6.setBackground(Color.lightGray);
				}
				public void mousePressed(MouseEvent m) {	
				}});
			button6.setBorder(new CompoundBorder(new LineBorder(Color.white,4),new LineBorder(Color.black,4)));
			button6.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				if(field1.getText().equals("0")) {
					field1.setText(null);
				}
				String str5 = field1.getText();
				field1.setText(str5+"5");	
			}});
			Font font6 = new Font("comic sans MS",Font.PLAIN,43);
			button6.setFont(font6);
			button6.setBounds(118,275,90,80);
			frame.add(button6);
		
		//Button7 Code
			JButton button7 = new JButton("6");
			button7.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {}
				public void mouseExited(MouseEvent b) {
					button7.setBackground(currentColor);
					}
				public void mouseReleased(MouseEvent c) {}
				public void mouseEntered(MouseEvent k) {
					 button7.setBackground(Color.lightGray);
				}
				public void mousePressed(MouseEvent m) {
				}});
			button7.setBorder(new CompoundBorder(new LineBorder(Color.white,4),new LineBorder(Color.black,4)));
			button7.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				if(field1.getText().equals("0")) {
					field1.setText(null);
				}
				String str6 = field1.getText();
				field1.setText(str6+"6");	
			}});
			Font font7 = new Font("comic sans MS",Font.PLAIN,43);
			button7.setFont(font7);
			button7.setBounds(224,275,90,80);
			frame.add(button7);
		
		/**///Button8 Code
			JButton button8 = new JButton("+");
			button8.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {}
				public void mouseExited(MouseEvent b) {
					button8.setBackground(currentColor);
					}
				public void mouseReleased(MouseEvent c) {}
				public void mouseEntered(MouseEvent k) {
					 button8.setBackground(Color.lightGray);
				}
				public void mousePressed(MouseEvent m) {
				}});
			button8.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e){
				int length = field1.getText().length();
				if(field1.getText().equals("0")) {
					field1.setText("0 + ");
				}
				else if("+-/*%".indexOf( (field1.getText()).charAt(length-2) ) >= 0) {
		                				
				}
				else {
					
				String str14 = field1.getText();
				field1.setText(str14+" + ");}
				
				input1 = Double.parseDouble(field1.getText().substring(0,length));
				field2.setText(field1.getText());
				field1.setText("0");
			}});
			button8.setBorder(new CompoundBorder(new LineBorder(Color.white,4),new LineBorder(Color.black,4)));
			Font font8 = new Font("comic sans MS",Font.PLAIN,43);
			button8.setFont(font8);
			button8.setBounds(330,275,90,80);
			frame.add(button8);
		
		//Button9 Code
			JButton button9 = new JButton("7");
			button9.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {}
				public void mouseExited(MouseEvent b) {
					button9.setBackground(currentColor);
					}
				public void mouseReleased(MouseEvent c) {}
				public void mouseEntered(MouseEvent k) {
					 button9.setBackground(Color.lightGray);
				}
				public void mousePressed(MouseEvent m) {	
				}});
			button9.setBorder(new CompoundBorder(new LineBorder(Color.white,4),new LineBorder(Color.black,4)));
			button9.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				if(field1.getText().equals("0")) {
					field1.setText(null);
				}
				String str7 = field1.getText();
				field1.setText(str7+"7");	
			}});
			Font font9 = new Font("comic sans MS",Font.PLAIN,43);
			button9.setFont(font9);
			button9.setBounds(12,370,90,80);
			frame.add(button9);
		
		//Button10 Code
			JButton button10 = new JButton("8");
			button10.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {}
				public void mouseExited(MouseEvent b) {
					button10.setBackground(currentColor);
					}
				public void mouseReleased(MouseEvent c) {}
				public void mouseEntered(MouseEvent k) {
					 button10.setBackground(Color.lightGray);
				}
				public void mousePressed(MouseEvent m) {
				}});
			button10.setBorder(new CompoundBorder(new LineBorder(Color.white,4),new LineBorder(Color.black,4)));
			button10.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				if(field1.getText().equals("0")) {
					field1.setText(null);
				}
				String str8 = field1.getText();
				field1.setText(str8+"8");	
			}});
			Font font10 = new Font("comic sans MS",Font.PLAIN,43);
			button10.setFont(font10);
			button10.setBounds(118,370,90,80);
			frame.add(button10);
		
		//Button11 Code
			JButton button11 = new JButton("9");
			button11.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {}
				public void mouseExited(MouseEvent b) {
					button11.setBackground(currentColor);
					}
				public void mouseReleased(MouseEvent c) {}
				public void mouseEntered(MouseEvent k) {
					 button11.setBackground(Color.lightGray);}
				public void mousePressed(MouseEvent m) {
				}});
			button11.setBorder(new CompoundBorder(new LineBorder(Color.white,4),new LineBorder(Color.black,4)));
			button11.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				if(field1.getText().equals("0")) {
					field1.setText(null);
				}
				String str9 = field1.getText();
				field1.setText(str9+"9");	
			}});
			Font font11 = new Font("comic sans MS",Font.PLAIN,43);
			button11.setFont(font11);
			button11.setBounds(224,370,90,80);
			frame.add(button11);
		
		//Button12 Code
			JButton button12 = new JButton("-");
			button12.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {}
				public void mouseExited(MouseEvent b) {
					button12.setBackground(currentColor);
					}
				public void mouseReleased(MouseEvent c) {}
				public void mouseEntered(MouseEvent k) {
					 button12.setBackground(Color.lightGray);
				}
				public void mousePressed(MouseEvent m) {
				}});
			button12.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				int length = field1.getText().length();
				if(field1.getText().equals("0")) {
					field1.setText("0 - ");
				}
				else if("+-/*%".indexOf( (field1.getText()).charAt(length-2) ) >= 0) {
    				
				}
				else {
				String str12 = field1.getText();
				field1.setText(str12+" - ");
				input1 = Double.parseDouble(field1.getText().substring(0,length));
				field2.setText(field1.getText());
				field1.setText("0");
				}	
			}});
			button12.setBorder(new CompoundBorder(new LineBorder(Color.white,4),new LineBorder(Color.black,4)));
			Font font12 = new Font("comic sans MS",Font.PLAIN,43);
			button12.setFont(font12);
			button12.setBounds(330,370,90,80);
			frame.add(button12);
		
		//Button13 Code
			JButton button13 = new JButton(".");
			button13.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {}
				public void mouseExited(MouseEvent b) {
					button13.setBackground(currentColor);
					}
				public void mouseReleased(MouseEvent c) {}
				public void mouseEntered(MouseEvent k) {
					 button13.setBackground(Color.lightGray);
				}
				public void mousePressed(MouseEvent m) {
				}});
			button13.setBorder(new CompoundBorder(new LineBorder(Color.white,4),new LineBorder(Color.black,4)));
			Font font13 = new Font("comic sans MS",Font.PLAIN,43);
			button13.setFont(font13);
			button13.setBounds(12,465,90,80);
			frame.add(button13);
			button13.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				int length = field1.getText().length();
			if(field1.getText().indexOf('.',0)>=0) {
				
			}
			else {
				field1.setText(field1.getText()+".");
			}
			}});
			
		//Button14 Code
			JButton button14 = new JButton("0");
			button14.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {}
				public void mouseExited(MouseEvent b) {
					button14.setBackground(currentColor);
					}
				public void mouseReleased(MouseEvent c) {}
				public void mouseEntered(MouseEvent k) {
					 button14.setBackground(Color.lightGray);
				}
				public void mousePressed(MouseEvent m) {
			    }});
			button14.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				if(field1.getText().equals("0")) {
					field1.setText("0");}
				else {
				String str14 = field1.getText();
				field1.setText(str14+"0");}	
			}});
			button14.setBorder(new CompoundBorder(new LineBorder(Color.white,4),new LineBorder(Color.black,4)));
			Font font14 = new Font("comic sans MS",Font.PLAIN,43);
			button14.setFont(font14);
			button14.setBounds(118,465,90,80);
			frame.add(button14);
		
		//Button15 Code
			JButton button15 = new JButton("*");
			button15.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {}
				public void mouseExited(MouseEvent b) {
					button15.setBackground(currentColor);
					}
				public void mouseReleased(MouseEvent c) {}
				public void mouseEntered(MouseEvent k) {
					 button15.setBackground(Color.lightGray);
				}
				public void mousePressed(MouseEvent m) {
				}});
			button15.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				int length = field1.getText().length();
				if(field1.getText().equals("0")) {
					field1.setText("0 * ");
				}
				else if("+-/*%".indexOf( (field1.getText()).charAt(length-2) ) >= 0) {
    				
				}
				else {
				String str15 = field1.getText();
				field1.setText(str15+" * ");
				input1 = Double.parseDouble(field1.getText().substring(0,length));
				field2.setText(field1.getText());
				field1.setText("0");}	
			}});
			button15.setBorder(new CompoundBorder(new LineBorder(Color.white,4),new LineBorder(Color.black,4)));
			Font font15 = new Font("comic sans MS",Font.PLAIN,43);
			button15.setFont(font15);
			button15.setBounds(224,465,90,80);
			frame.add(button15);
		
		//Button16 Code
			JButton button16 = new JButton("/");
			button16.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {}
				public void mouseExited(MouseEvent b) {
					button16.setBackground(currentColor);
					}
				public void mouseReleased(MouseEvent c) {}
				public void mouseEntered(MouseEvent k) {
					 button16.setBackground(Color.lightGray);
				}
				public void mousePressed(MouseEvent m) {
					
				}
				});
			button16.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				int length = field1.getText().length();
				if(field1.getText().equals("0")){
					field1.setText("0 / ");
				}
                else if("+-/*%".indexOf( (field1.getText()).charAt(length-2) ) >= 0) {
    				
				}
				else {
				String str16 = field1.getText();
				field1.setText(str16+" / ");
				input1 = Double.parseDouble(field1.getText().substring(0,length));
				field2.setText(field1.getText());
				field1.setText("0");}	
			}});
			button16.setBorder(new CompoundBorder(new LineBorder(Color.white,4),new LineBorder(Color.black,4)));
			Font font16 = new Font("comic sans MS",Font.PLAIN,43);
			button16.setFont(font16);
			button16.setBounds(330,465,90,80);
			frame.add(button16);
		
		//Button17 Code
			JButton button17 = new JButton("AC");
			button17.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {}
				public void mouseExited(MouseEvent b) {
					button17.setBackground(currentColor);
					}
				public void mouseReleased(MouseEvent c) {}
				public void mouseEntered(MouseEvent k) {
					 button17.setBackground(Color.lightGray);
				}
				public void mousePressed(MouseEvent m) {	
				}});
			button17.setBorder(new CompoundBorder(new LineBorder(Color.white,4),new LineBorder(Color.black,4)));
			Font font17 = new Font("comic sans MS",Font.PLAIN,30);
			button17.setFont(font17);
			button17.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
			field2.setText("0");
			field1.setText("0");
			}
			});
			button17.setBounds(12,560,90,80);
			frame.add(button17);
		
		//Button18 Code
			JButton button18 = new JButton("%");
			button18.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {}
				public void mouseExited(MouseEvent b) {
					button18.setBackground(currentColor);
					}
				public void mouseReleased(MouseEvent c) {}
				public void mouseEntered(MouseEvent k) {
					 button18.setBackground(Color.lightGray);
				}
				public void mousePressed(MouseEvent m) {
				}});
			button18.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				int length = field1.getText().length();
				if(field1.getText().equals("0")) {
					field1.setText("0 % ");
				}

                else if("+-/*%".indexOf( (field1.getText()).charAt(length-2) ) >= 0) {
    				
                }
				else {
				String str18 = field1.getText();
				field1.setText(str18+" % ");
				input1 = Double.parseDouble(field1.getText().substring(0,length));
				field2.setText(field1.getText());
				field1.setText("0");}	
			}});
			button18.setBorder(new CompoundBorder(new LineBorder(Color.white,4),new LineBorder(Color.black,4)));
			Font font18 = new Font("comic sans MS",Font.PLAIN,40);
			button18.setFont(font18);
			button18.setBounds(118,560,90,80);
			frame.add(button18);
		
		//Button19 Code
			JButton button19 = new JButton("=");
			button19.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {}
				public void mouseExited(MouseEvent b) {
					button19.setBackground(currentColor);
					}
				public void mouseReleased(MouseEvent c) {}
				public void mouseEntered(MouseEvent k) {
					 button19.setBackground(Color.lightGray);
				}
				public void mousePressed(MouseEvent m) {
				}});
			button19.setBorder(new CompoundBorder(new LineBorder(Color.white,4),new LineBorder(Color.black,4)));
			Font font19 = new Font("comic sans MS",Font.PLAIN,45);
			button19.setFont(font19);
			button19.addActionListener(new ActionListener() {public void actionPerformed(ActionEvent e) {
				int length = field2.getText().length();
				int length1 = field1.getText().length();
				try{a = field2.getText().charAt(length-2);}catch(Exception d) {field2.setText(field1.getText());}
				//field2.setText(field2.getText()+field1.getText());
				switch(a) {
				case '+':
					input2 = Double.parseDouble(field1.getText());
					if(field2.getText().indexOf('.',0)>=0){
						sol = input1+input2;
						field2.setText(field2.getText()+field1.getText());
						field1.setText(Double.toString(sol));
						
					}
					else if(field1.getText().indexOf('.',0)>=0) {
						sol = input1+input2;
						field2.setText(field2.getText()+field1.getText());
						field1.setText(Double.toString(sol));
					}
					else {
						sol = input1+input2;
						int a = (int)sol;
						field2.setText(field2.getText()+field1.getText());
				        field1.setText(Integer.toString(a));
					}
					
					break;
				case '-':
					input2 = Double.parseDouble(field1.getText());
					if(field2.getText().indexOf('.',0)>=0){
						sol = input1-input2;
						field2.setText(field2.getText()+field1.getText());
						field1.setText(Double.toString(sol));
						
					}
					else if(field1.getText().indexOf('.',0)>=0) {
						sol = input1-input2;
						field2.setText(field2.getText()+field1.getText());
						field1.setText(Double.toString(sol));
					}
					else {
						sol = input1-input2;
						int a = (int)sol;
						field2.setText(field2.getText()+field1.getText());
						field1.setText(Integer.toString(a));
					}
					
					break;
				case '/':
					input2 = Double.parseDouble(field1.getText());
					try{sol = input1/input2;
					if(input1%input2==0) {
						long solDivide = (long) sol;
						field2.setText(field2.getText()+field1.getText());
						field1.setText(Long.toString(solDivide));
					}
					else {
						field2.setText(field2.getText()+field1.getText());
						field1.setText(Double.toString(sol));
					}
					}catch(Exception g) {field2.setText("Can't Divide");}
				
					break;
				case '*':
					input2 = Double.parseDouble(field1.getText());
					if(field2.getText().indexOf('.',0)>=0){
						sol = input1*input2;
						field2.setText(field2.getText()+field1.getText());
						field1.setText(Double.toString(sol));
					}
					else if(field1.getText().indexOf('.',0)>=0) {
						sol = input1*input2;
						field2.setText(field2.getText()+field1.getText());
						field1.setText(Double.toString(sol));
					}
					else {
						sol = input1*input2;
						int a = (int)sol;
						field2.setText(field2.getText()+field1.getText());
				        field1.setText(Integer.toString(a));
					}
					break;
					case '%':
						int modSol=0;
					input2 = Double.parseDouble(field1.getText());
					try{sol =input1%input2;
					modSol = (int)sol;
					}catch(Exception c) {field2.setText("0");}
					field2.setText(field2.getText()+field1.getText());
					field1.setText(Integer.toString(modSol));
					break;
			}
				try{if("-+/*%".indexOf(field2.getText().charAt(length-2))<0)
					field2.setText(field1.getText());}catch(Exception f) {}
				}
				
				});
			button19.setBounds(224,560,200,80);
			frame.add(button19);	
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void caller() {
		module();
	}
}
public class Calculator {
public static void main(String ar[]) {
	diffFunction Obj = new diffFunction();
	Obj.caller();
}
}
