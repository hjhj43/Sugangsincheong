package mainFrame;

import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PGrade extends JFrame {
	private static final long serialVersionUID = 1L;

	JComboBox combotime1;
	String []timelist1 = {"0", "1", "2", "3", "4", "5"};
	JComboBox combograde1;
	String []gradelist1 = {"선택", "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
	
	JComboBox combotime2;
	String []timelist2 = {"0", "1", "2", "3", "4", "5"};
	JComboBox combograde2;
	String []gradelist2 = {"선택", "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
	
	JComboBox combotime3;
	String []timelist3 = {"0", "1", "2", "3", "4", "5"};
	JComboBox combograde3;
	String []gradelist3 = {"선택", "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
	
	JComboBox combotime4;
	String []timelist4 = {"0", "1", "2", "3", "4", "5"};
	JComboBox combograde4;
	String []gradelist4 = {"선택", "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
	
	JComboBox combotime5;
	String []timelist5 = {"0", "1", "2", "3", "4", "5"};
	JComboBox combograde5;
	String []gradelist5 = {"선택", "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
	
	JComboBox combotime6;
	String []timelist6 = {"0", "1", "2", "3", "4", "5"};
	JComboBox combograde6;
	String []gradelist6 = {"선택", "A+", "A0", "B+", "B0", "C+", "C0", "D+", "D0", "F"};
	
	public PGrade() {
		JPanel panel1 = new JPanel();
		Label name1 = new Label("과목명");
		Label time1 = new Label("학점");
		Label grade1 = new Label("성적");
		add(name1);
		add(time1);
		add(grade1);
		TextField t1 = new TextField();
		combotime1 = new JComboBox(timelist1);
		combograde1 = new JComboBox(gradelist1);
		add(t1);
		add(combotime1);
		add(combograde1);
		name1.setBounds(30,10,40,20);
		t1.setBounds(80,10,120,20);
		time1.setBounds(220,10,30,20);
		combotime1.setBounds(260,10,60,20);
		grade1.setBounds(340,10,30,20);
		combograde1.setBounds(380,10,60,20);		
		add(panel1);
		
		JPanel panel2 = new JPanel();
		Label name2 = new Label("과목명");
		Label time2 = new Label("학점");
		Label grade2 = new Label("성적");
		add(name2);
		add(time2);
		add(grade2);
		TextField t2 = new TextField();
		combotime2 = new JComboBox(timelist2);
		combograde2 = new JComboBox(gradelist2);
		add(t2);
		add(combotime2);
		add(combograde2);
		name2.setBounds(30,50,40,20);
		t2.setBounds(80,50,120,20);
		time2.setBounds(220,50,30,20);
		combotime2.setBounds(260,50,60,20);
		grade2.setBounds(340,50,30,20);
		combograde2.setBounds(380,50,60,20);		
		add(panel2);
		
		JPanel panel3 = new JPanel();
		Label name3 = new Label("과목명");
		Label time3 = new Label("학점");
		Label grade3 = new Label("성적");
		add(name3);
		add(time3);
		add(grade3);
		TextField t3 = new TextField();
		combotime3 = new JComboBox(timelist3);
		combograde3 = new JComboBox(gradelist3);
		add(t3);
		add(combotime3);
		add(combograde3);
		name3.setBounds(30,90,40,20);
		t3.setBounds(80,90,120,20);
		time3.setBounds(220,90,30,20);
		combotime3.setBounds(260,90,60,20);
		grade3.setBounds(340,90,30,20);
		combograde3.setBounds(380,90,60,20);		
		add(panel3);
		
		JPanel panel4 = new JPanel();
		Label name4 = new Label("과목명");
		Label time4 = new Label("학점");
		Label grade4 = new Label("성적");
		add(name4);
		add(time4);
		add(grade4);
		TextField t4 = new TextField();
		combotime4 = new JComboBox(timelist4);
		combograde4 = new JComboBox(gradelist4);
		add(t4);
		add(combotime4);
		add(combograde4);
		name4.setBounds(30,130,40,20);
		t4.setBounds(80,130,120,20);
		time4.setBounds(220,130,30,20);
		combotime4.setBounds(260,130,60,20);
		grade4.setBounds(340,130,30,20);
		combograde4.setBounds(380,130,60,20);		
		add(panel4);
		
		JPanel panel5 = new JPanel();
		Label name5 = new Label("과목명");
		Label time5 = new Label("학점");
		Label grade5 = new Label("성적");
		add(name5);
		add(time5);
		add(grade5);
		TextField t5 = new TextField();
		combotime5 = new JComboBox(timelist5);
		combograde5 = new JComboBox(gradelist5);
		add(t5);
		add(combotime5);
		add(combograde5);
		name5.setBounds(30,170,40,20);
		t5.setBounds(80,170,120,20);
		time5.setBounds(220,170,30,20);
		combotime5.setBounds(260,170,60,20);
		grade5.setBounds(340,170,30,20);
		combograde5.setBounds(380,170,60,20);		
		add(panel5);
		
		JPanel panel6 = new JPanel();
		Label name6 = new Label("과목명");
		Label time6 = new Label("학점");
		Label grade6 = new Label("성적");
		add(name6);
		add(time6);
		add(grade6);
		TextField t6 = new TextField();
		combotime6 = new JComboBox(timelist6);
		combograde6 = new JComboBox(gradelist6);
		add(t6);
		add(combotime6);
		add(combograde6);
		name6.setBounds(30,210,40,20);
		t6.setBounds(80,210,120,20);
		time6.setBounds(220,210,30,20);
		combotime6.setBounds(260,210,60,20);
		grade6.setBounds(340,210,30,20);
		combograde6.setBounds(380,210,60,20);		
		add(panel6);
		
		JPanel panel7 = new JPanel();
		JButton b1 = new JButton("확인");
		add(b1);
		getRootPane().setDefaultButton(b1);
		b1.setBounds(200, 270, 80, 30);
		JLabel label1 = new JLabel();
		add(label1);
		label1.setBounds(205, 300, 100, 50);
		JLabel label2 = new JLabel();
		add(label2);
		label2.setBounds(200, 320, 100, 50);
		add(panel7);
		
		b1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent T) {
			    int data1 = Integer.parseInt((String) combotime1.getItemAt(combotime1.getSelectedIndex()));
			    int data2 = Integer.parseInt((String) combotime2.getItemAt(combotime2.getSelectedIndex()));
			    int data3 = Integer.parseInt((String) combotime3.getItemAt(combotime3.getSelectedIndex()));
			    int data4 = Integer.parseInt((String) combotime4.getItemAt(combotime4.getSelectedIndex()));
			    int data5 = Integer.parseInt((String) combotime5.getItemAt(combotime5.getSelectedIndex()));
			    int data6 = Integer.parseInt((String) combotime6.getItemAt(combotime6.getSelectedIndex()));
				int result = data1 + data2 + data3 + data4 + data5 + data6;
				label1.setText("취득 학점: " +result);
				
			    Object grade1 = combograde1.getItemAt(combograde1.getSelectedIndex());
			    Object grade2 = combograde2.getItemAt(combograde2.getSelectedIndex());
			    Object grade3 = combograde3.getItemAt(combograde3.getSelectedIndex());
			    Object grade4 = combograde4.getItemAt(combograde4.getSelectedIndex());
			    Object grade5 = combograde5.getItemAt(combograde5.getSelectedIndex());
			    Object grade6 = combograde6.getItemAt(combograde6.getSelectedIndex());

			    if(grade1 == "A+") {grade1 = 4.5;
			    }else if(grade1 == "A0"){grade1 = 4.0;
			    }else if(grade1 == "B+") {grade1 = 3.5;
			    }else if(grade1 == "B0") {grade1 = 3.0;
			    }else if(grade1 == "C+") {grade1 = 2.5;
			    }else if (grade1 == "C0") {grade1 = 2.0;
			    }else if (grade1 == "D+") {grade1 = 1.5;
			    }else if (grade1 == "D0") {grade1 = 1.0;
			    }else grade1 = 0.0;
			    
			    if(grade2 == "A+") {grade2 = 4.5;
			    }else if(grade2 == "A0"){grade2 = 4.0;
			    }else if(grade2 == "B+") {grade2 = 3.5;
			    }else if(grade2 == "B0") {grade2 = 3.0;
			    }else if(grade2 == "C+") {grade2 = 2.5;
			    }else if (grade2 == "C0") {grade2 = 2.0;
			    }else if (grade2 == "D+") {grade2 = 1.5;
			    }else if (grade2 == "D0") {grade2 = 1.0;
			    }else grade2 = 0.0;
			    
			    if(grade3 == "A+") {grade3 = 4.5;
			    }else if(grade3 == "A0"){grade3 = 4.0;
			    }else if(grade3 == "B+") {grade3 = 3.5;
			    }else if(grade3 == "B0") {grade3 = 3.0;
			    }else if(grade3 == "C+") {grade3 = 2.5;
			    }else if (grade3 == "C0") {grade3 = 2.0;
			    }else if (grade3 == "D+") {grade3 = 1.5;
			    }else if (grade3 == "D0") {grade3 = 1.0;
			    }else grade3 = 0.0;
			    
			    if(grade4 == "A+") {grade4 = 4.5;
			    }else if(grade4 == "A0"){grade4 = 4.0;
			    }else if(grade4 == "B+") {grade4 = 3.5;
			    }else if(grade4 == "B0") {grade4 = 3.0;
			    }else if(grade4 == "C+") {grade4 = 2.5;
			    }else if (grade4 == "C0") {grade4 = 2.0;
			    }else if (grade4 == "D+") {grade4 = 1.5;
			    }else if (grade4 == "D0") {grade4 = 1.0;
			    }else grade4 = 0.0;
			    
			    if(grade5 == "A+") {grade5 = 4.5;
			    }else if(grade5 == "A0"){grade5 = 4.0;
			    }else if(grade5 == "B+") {grade5 = 3.5;
			    }else if(grade5 == "B0") {grade5 = 3.0;
			    }else if(grade5 == "C+") {grade5 = 2.5;
			    }else if (grade5 == "C0") {grade5 = 2.0;
			    }else if (grade5 == "D+") {grade5 = 1.5;
			    }else if (grade5 == "D0") {grade5 = 1.0;
			    }else grade5 = 0.0;
			    
			    if(grade6 == "A+") {grade6 = 4.5;
			    }else if(grade6 == "A0"){grade6 = 4.0;
			    }else if(grade6 == "B+") {grade6 = 3.5;
			    }else if(grade6 == "B0") {grade6 = 3.0;
			    }else if(grade6 == "C+") {grade6 = 2.5;
			    }else if (grade6 == "C0") {grade6 = 2.0;
			    }else if (grade6 == "D+") {grade6 = 1.5;
			    }else if (grade6 == "D0") {grade6 = 1.0;
			    }else grade6 = 0.0;
			    
			    double sum =  data1 * (double) grade1 + data2 * (double) grade2 + data3 * (double) grade3
			    		+ data4 * (double) grade4 + data5 * (double) grade5 + data6 * (double) grade6;
			    double result2 = (Math.round((sum/result)*100)/100.0);
				label2.setText("평균 평점: " +result2);
			}
		});
		setSize(500,500);
		setTitle("학점계산기");
		setVisible(true);
	}
}