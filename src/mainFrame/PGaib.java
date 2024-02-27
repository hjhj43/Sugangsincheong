package mainFrame;

import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import constants.Constants.EConfiguration;
import constants.Constants.ELoginDialog;

public class PGaib extends JFrame {
	private static final long serialVersionUID = 1L;

	public PGaib() {
		JPanel panel = new JPanel();
		Label name = new Label(ELoginDialog.nameLabel.getText());
		Label id = new Label(ELoginDialog.idLabel.getText());
		Label pw = new Label(ELoginDialog.passwordLabel.getText());
		Label num = new Label(ELoginDialog.birthLabel.getText());
		add(name);
		add(id);
		add(pw);
		add(num);
		TextField t1 = new TextField();
		TextField t2 = new TextField();
		JPasswordField t3 = new JPasswordField();
		TextField t4 = new TextField();
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		JButton b1 = new JButton(ELoginDialog.okButtonLabel.getText());
		JButton b2 = new JButton(ELoginDialog.cancelButtonLabel.getText());
		add(b1);
		add(b2);
		getRootPane().setDefaultButton(b1);
		name.setBounds(40,10,40,40);
		id.setBounds(40,50,40,40);
		pw.setBounds(40,90,60,40);
		num.setBounds(40,130,60,40);
		t1.setBounds(120,10,200,30);
		t2.setBounds(120,50,200,30);
		t3.setBounds(120,90,200,30);
		t4.setBounds(120,130,280,30);
		b1.setBounds(125,330,80,30);
		b2.setBounds(240,330,80,30);
		add(panel);
		setSize(500,500);
		setTitle(ELoginDialog.gaibButtonLabel.getText());
		setVisible(true);

		b1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent T) {
				String name = t1.getText();
				String id = t2.getText();
				char[] pass = t3.getPassword();
				String password = new String(pass);
				String num = t4.getText();
				
				if(name.equals("")||id.equals("")||password.equals("")||num.equals("")) {
					JOptionPane.showMessageDialog(null,  ELoginDialog.blankFilled.getText());
				}else {
					try {
						BufferedWriter bf = new BufferedWriter (new FileWriter("userInfo/"+t2.getText(),true));
						bf.write(t2.getText()+"\n");
						bf.write(t1.getText()+"\n");
						bf.write(t4.getText()+"\n");
						bf.write(t3.getText()+"\n");
						bf.close();
						
						BufferedWriter bf1 = new BufferedWriter (new FileWriter("userInfo/userId",true));
						bf1.write(t2.getText()+"\n");
						bf1.write(t3.getText()+"\n");
						bf1.close();
						
						BufferedWriter bf2 = new BufferedWriter (new FileWriter("lectureInfo/"+t2.getText()+EConfiguration.miridamgiFilePostfix.getText(),true));
						BufferedWriter bf3 = new BufferedWriter (new FileWriter("lectureInfo/"+t2.getText()+EConfiguration.sincheongFilePostfix.getText(),true));
						
						JOptionPane.showMessageDialog(null,  ELoginDialog.gaibSuccess.getText());
						dispose();
					} catch (IOException e) {
						JOptionPane.showMessageDialog(null,  ELoginDialog.gaibFail.getText());
					}
				}
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}