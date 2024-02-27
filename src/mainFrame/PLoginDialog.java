package mainFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import constants.Constants.ELoginDialog;
import control.CLogin;
import control.CUser;
import mainFrame.Main.ActionHandler;
import valueObject.VLogin;
import valueObject.VUser;

public class PLoginDialog extends JDialog {
	// attribute
	private static final long serialVersionUID = 1L;

	// components
	private JLabel userIdLabel;
	private JTextField UserIdTextField;
	private JLabel passwordLabel;
	private JPasswordField passwordTextField;
	private JButton okButton;
	private JButton cancelButton;
	private JButton gaibButton;
	private JButton findButton;
	private JButton changeButton;
	private JButton delButton;

	// control
	private CLogin cLogin;
	private CUser cUser;

	public PLoginDialog(ActionHandler actionHandler) {
		//attributes
		this.setSize(ELoginDialog.width.getInt(), ELoginDialog.height.getInt());
		this.setLocationRelativeTo(null);
		this.setResizable(false);

		this.setLayout(new FlowLayout());

		// components
		JPanel line1 = new JPanel();
		this.userIdLabel = new JLabel(ELoginDialog.idLabel.getText());
		line1.add(this.userIdLabel);
		this.UserIdTextField = new JTextField(ELoginDialog.sizeNameText.getInt());
		line1.add(this.UserIdTextField);
		this.add(line1);

		JPanel line2 = new JPanel();
		this.passwordLabel = new JLabel(ELoginDialog.passwordLabel.getText());
		line2.add(this.passwordLabel);
		this.passwordTextField = new JPasswordField(ELoginDialog.sizePasswordText.getInt());
		line2.add(this.passwordTextField);
		this.add(line2);
		
		JPanel line3 = new JPanel();
		this.okButton = new JButton(ELoginDialog.okButtonLabel.getText());
		this.okButton.addActionListener(actionHandler);
		this.okButton.setActionCommand(this.okButton.getText());
		this.getRootPane().setDefaultButton(this.okButton);
		line3.add(this.okButton);
		
		this.cancelButton = new JButton(ELoginDialog.cancelButtonLabel.getText());
		this.cancelButton.addActionListener(actionHandler);
		this.cancelButton.setActionCommand(this.cancelButton.getText());
		line3.add(this.cancelButton);
		
		this.gaibButton = new JButton(ELoginDialog.gaibButtonLabel.getText());
		line3.add(this.gaibButton);
		this.add(line3);
		
		gaibButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (gaibButton.getText().equals(ELoginDialog.gaibButtonLabel.getText())) {
					@SuppressWarnings("unused")
					PGaib f1 = new PGaib();
				}
			}
		});
		
		JPanel line4 = new JPanel();
		this.findButton = new JButton(ELoginDialog.findButtonLabel.getText());
		line4.add(this.findButton);
		
		findButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (findButton.getText().equals(ELoginDialog.findButtonLabel.getText())) {
					@SuppressWarnings("unused")
					PFind f1 = new PFind();
				}
			}
		});
		
		this.changeButton = new JButton(ELoginDialog.changeButtonLabel.getText());
		line4.add(this.changeButton);
		
		
		changeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (changeButton.getText().equals(ELoginDialog.changeButtonLabel.getText())) {
					@SuppressWarnings("unused")
					PChange f1 = new PChange();
				}
			}
		});
		this.add(line4);
		
		JPanel line5 = new JPanel();
		
		this.delButton = new JButton("회원탈퇴");
		line5.add(this.delButton);
		
		delButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (delButton.getText().equals(ELoginDialog.delLabel.getText())) {
					@SuppressWarnings("unused")
					PDelete f1 = new PDelete();
				}
			}
		});
		this.add(line5);
		
		// control
		this.cLogin = new CLogin();
		this.cUser = new CUser();
	}

	public void initialize() {
	}
	
	@SuppressWarnings("deprecation")
	public VUser validateUser(String actionCommand) {
		VUser vUser = null;
		if(actionCommand.contentEquals(this.okButton.getText())) {
			VLogin vLogin = new VLogin(this.UserIdTextField.getText(), this.passwordTextField.getText());
			boolean bLoginSuccess = this.cLogin.validate(vLogin);

			if(bLoginSuccess) {
				vUser = this.cUser.getUser(vLogin.getUserId());
				if (vUser==null) {
					// 시스템 에러 - 회원 정보가 존재하지 않음
					JOptionPane.showMessageDialog(null, ELoginDialog.noAccountInfo.getText());
				}
			}else if(UserIdTextField.getText().equals("")||(passwordTextField.getText().equals(""))){
				JOptionPane.showMessageDialog(null, ELoginDialog.blankFilled.getText());
				@SuppressWarnings("unused")
				Main main = new Main();
			}else {
				// 비번 틀릴 때, 아이디 잘 못 입력, 회원 가입을 안했을 때
				JOptionPane.showMessageDialog(null, ELoginDialog.noAccountInfo.getText());
				@SuppressWarnings("unused")
				Main main = new Main();
			}
		}
		return vUser;
	}
}