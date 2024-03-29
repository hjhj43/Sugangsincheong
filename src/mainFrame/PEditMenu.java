package mainFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import constants.Constants;

public class PEditMenu extends JMenu {
	private static final long serialVersionUID = 1L;

	public PEditMenu() {
		this.setText(Constants.EMenuBar.EDIT.getText());

		for (Constants.EEditMenu eEditMenu: Constants.EEditMenu.values()) {
			JMenuItem menuItem = new JMenuItem(eEditMenu.getText());
			this.add(menuItem);
		}
	}

	public void initialize() {
	}
}
