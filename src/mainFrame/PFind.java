package mainFrame;

import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import constants.Constants.ELoginDialog;

public class PFind extends JFrame {
	private static final long serialVersionUID = 1L;

	public PFind() {
		JPanel panel = new JPanel();
		Label id = new Label(ELoginDialog.idLabel.getText());
		Label name = new Label(ELoginDialog.nameLabel.getText());
		Label num = new Label(ELoginDialog.birthLabel.getText());
		add(id);
		add(name);
		add(num);
		TextField t1 = new TextField();
		TextField t2 = new TextField();
		TextField t3 = new TextField();
		add(t1);
		add(t2);
		add(t3);
		JButton b1 = new JButton(ELoginDialog.okButtonLabel.getText());
		JButton b2 = new JButton(ELoginDialog.cancelButtonLabel.getText());
		add(b1);
		add(b2);
		getRootPane().setDefaultButton(b1);
		id.setBounds(60,10,40,40);
		name.setBounds(60,50,40,40);
		num.setBounds(60,90,50,40);
		t1.setBounds(150,10,200,30);
		t2.setBounds(150,50,200,30);
		t3.setBounds(150,90,200,30);
		b1.setBounds(100,200,80,30);
		b2.setBounds(200,200,80,30);
		add(panel);
		setSize(400,300);
		setTitle(ELoginDialog.findButtonLabel.getText());
		setVisible(true);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent T) {
				if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")) {
					JOptionPane.showMessageDialog(null,  ELoginDialog.blankFilled.getText());
				} else {
					try {
						BufferedReader br = new BufferedReader (new FileReader("userInfo/"+t1.getText()));
						String s;
						String[] array = new String[4];
						int temp = 0;
						for(int i=0;(s=br.readLine())!=null;i++) {
							array[i]=s;
							if((t1.getText().equals(array[0])&&t2.getText().equals(array[1])&&t3.getText().equals(array[2]))&&i==3) {
								temp = 1;
								break;
							}
						}
						if(temp==1) {
							JOptionPane.showMessageDialog(null, "비밀번호 : "+array[3]);
							dispose();
						}else {
							JOptionPane.showMessageDialog(null,  ELoginDialog.noAccountInfo.getText());
						}
						br.close();
					} catch (IOException e) {
						JOptionPane.showMessageDialog(null,  ELoginDialog.noAccountInfo.getText());
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
