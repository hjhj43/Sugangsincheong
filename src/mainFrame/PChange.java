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

public class PChange extends JFrame {
	private static final long serialVersionUID = 1L;

	public PChange() {
		JPanel panel = new JPanel();
		Label id = new Label(ELoginDialog.idLabel.getText());
		Label nowpw = new Label(ELoginDialog.nowpwLabel.getText());
		Label newpw = new Label(ELoginDialog.newpwLabel.getText());
		add(id);
		add(nowpw);
		add(newpw);
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
		id.setBounds(50,10,40,40);
		nowpw.setBounds(50,50,80,40);
		newpw.setBounds(50,90,90,40);
		t1.setBounds(150,10,200,30);
		t2.setBounds(150,50,200,30);
		t3.setBounds(150,90,200,30);
		b1.setBounds(100,200,80,30);
		b2.setBounds(200,200,80,30);
		add(panel);
		setSize(400,300);
		setTitle(ELoginDialog.changeButtonLabel.getText());
		setVisible(true);
	
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent T) {
				if(t1.getText().equals("")||t2.getText().equals("")||t3.getText().equals("")) {
					JOptionPane.showMessageDialog(null,  ELoginDialog.blankFilled.getText());
				} else if((t2.getText()).equals(t3.getText())){
					JOptionPane.showMessageDialog(null, ELoginDialog.equalFailed.getText());
				} else {
						try {
							BufferedReader br = new BufferedReader (new FileReader("userInfo/"+t1.getText()));
							String s;
							String[] array = new String[4];
							String newpw = t3.getText();
							int temp = 0;
							for(int i=0;(s=br.readLine())!=null;i++) {
								array[i]=s;
								if(t1.getText().equals(array[0])&&t2.getText().equals(array[3])) {
									temp = 1;
									break;
								}
							}
							if(temp==1) {
								array[3] =newpw;
								File file = new File("userInfo/"+t1.getText());
								BufferedWriter bw = new BufferedWriter(new FileWriter(file));
								
								bw.write(array[0]);
								bw.newLine();
								bw.write(array[1]);
								bw.newLine();
								bw.write(array[2]);
								bw.newLine();
								bw.write(array[3]);
								bw.newLine();
								
								bw.flush();
								bw.close();
								
								BufferedReader br_1 = new BufferedReader (new FileReader("userInfo/userId"));
								String []array_1 = new String[200];
								//버퍼드리더 이용해서 전부 읽어옴.
								int cnt = 0; //읽어온 줄 수 저장.
								for(int i=0;(s=br_1.readLine())!=null;i++) {
									array_1[i]=s;
									cnt = i+1;
								}
								//아이디 같은 것 탐색하고 그 다음 값에다가 새로운 비밀번호 값 넣음.
								for(int j=0; j<cnt; j++){
									if(array_1[j].equals(array[0])){
										array_1[j+1] = newpw;
										break;
									}
								}
								//하나씩 다시 파일에 write.
								File file1 = new File("userInfo/userId");
								BufferedWriter bw_1 = new BufferedWriter(new FileWriter(file1));
								for(int k=0; k<cnt; k++){
									bw_1.write(array_1[k]);
									bw_1.newLine();
								}
								bw_1.flush();
								bw_1.close();

								br_1.close();
								br.close();
								
								JOptionPane.showMessageDialog(null, ELoginDialog.changedLabel.getText());
								dispose();
							} else {
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
