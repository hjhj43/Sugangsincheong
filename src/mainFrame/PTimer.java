package mainFrame;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import constants.Constants.ELoginDialog;

public class PTimer extends JFrame implements Runnable{
	private static final long serialVersionUID = 1L;

	private JLabel label;

	public PTimer() {
		JButton b1 = new JButton(ELoginDialog.exitButtonLabel.getText());
		add(b1);
		getRootPane().setDefaultButton(b1);
		b1.setBounds(150,200,80,30);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		String time = getCurrentTime();
		label = new JLabel(time);
		label.setFont(new Font("TimesRoman", Font.BOLD, 50));
		label.setHorizontalAlignment(JLabel.CENTER);
		add(label, BorderLayout.CENTER);

		setSize(400, 300);
		this.setResizable(false);
		Thread t1 = new Thread(this);
		t1.start();
		setVisible(true);

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				String time = getCurrentTime();
				label.setText(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public String getCurrentTime() {
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);

		String time = hour+":"+min+":"+sec;
		return time;
	}
}