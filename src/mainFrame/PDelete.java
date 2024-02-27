package mainFrame;

import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import constants.Constants.ELoginDialog;

public class PDelete extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public PDelete() {
		JPanel panel = new JPanel();
		Label id = new Label(ELoginDialog.idLabel.getText());
		Label pw = new Label(ELoginDialog.passwordLabel.getText());
		add(id);
		add(pw);
		TextField t1 = new TextField();
		TextField t2 = new TextField();
		add(t1);
		add(t2);
		JButton b1 = new JButton(ELoginDialog.okButtonLabel.getText());
		JButton b2 = new JButton(ELoginDialog.cancelButtonLabel.getText());
		add(b1);
		add(b2);
		getRootPane().setDefaultButton(b1);
		id.setBounds(60,10,40,40);
		pw.setBounds(60,50,50,40);
		t1.setBounds(150,10,200,30);
		t2.setBounds(150,50,200,30);
		b1.setBounds(100,150,80,30);
		b2.setBounds(200,150,80,30);
		add(panel);
		setSize(400,300);
		setTitle(ELoginDialog.findButtonLabel.getText());
		setVisible(true);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent T) {
				if(t1.getText().equals("")||t2.getText().equals("")) {
					JOptionPane.showMessageDialog(null,  ELoginDialog.blankFilled.getText());
				} else {
					try {						
							BufferedReader br_1 = new BufferedReader (new FileReader("userInfo/userId"));
							String []array_1 = new String[200];
							String s;
							//���۵帮�� �̿��ؼ� ���� �о��.
							int cnt = 0; //�о�� �� �� ����.
							for(int i=0;(s=br_1.readLine())!=null;i++) {
								array_1[i]=s;
								cnt = i+1;
							}
							//���̵� ���� �� Ž���ϰ� �� ���� �����ٰ� ���ο� ��й�ȣ �� ����.
							for(int j=0; j<cnt; j++){
								if(array_1[j].equals(t1.getText())){
									array_1[j+1] = "-";
									break;
								}
							}
							//�ϳ��� �ٽ� ���Ͽ� write.
							File file1 = new File("userInfo/userId");
							BufferedWriter bw_1 = new BufferedWriter(new FileWriter(file1));
							for(int k=0; k<cnt; k++){
								bw_1.write(array_1[k]);
								bw_1.newLine();
							}
							bw_1.flush();
							bw_1.close();

							br_1.close();
							
							JOptionPane.showMessageDialog(null, ELoginDialog.delSuccess.getText());
							dispose();
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
