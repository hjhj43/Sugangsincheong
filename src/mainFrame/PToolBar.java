package mainFrame;
import java.awt.Desktop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

public class PToolBar extends JToolBar {
	private static final long serialVersionUID = 1L;

	public PToolBar() {
		
		Icon timerIcon = new ImageIcon("image/timer.gif");
		JButton button1 = new JButton(timerIcon);
		this.add(button1);
		
		Icon logoutIcon = new ImageIcon("image/logout.gif");
		JButton button2 = new JButton(logoutIcon);
		this.add(button2);
		
		Icon gradeIcon = new ImageIcon("image/grade.gif");
		JButton button3 = new JButton(gradeIcon);
		this.add(button3);
		
		Icon linkIcon = new ImageIcon("image/link.gif");
		JButton button4 = new JButton(linkIcon);
		this.add(button4);
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				@SuppressWarnings("unused")
				PTimer timer = new PTimer();
			}
		});
		
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					@SuppressWarnings("unused")
					PGrade grade = new PGrade();
			}
		});
		
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new URI("http://www.mju.ac.kr/"));
				} catch (IOException e1) {
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					e1.printStackTrace();
				}
			}
		});
	}
	public void initialize() {
	}
}