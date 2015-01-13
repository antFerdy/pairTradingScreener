package view;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{
	
	private JPanel graphPanel;
	private ControllerPanel controllerPanel;
//	private JButton loadBtn;
//	private JTextArea textArea;
	
	
	public MainFrame(String name) {
		super(name);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		controllerPanel = new ControllerPanel();
		
		JPanel constPanel = new JPanel();
		constPanel.setLayout(new GridBagLayout());
		constPanel.add(controllerPanel, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0, GridBagConstraints.CENTER, GridBagConstraints.NONE, new Insets(1, 1, 1, 1), 0, 0));
		
		
		add(constPanel, BorderLayout.NORTH);
		pack();
		setVisible(true);
	}
}
