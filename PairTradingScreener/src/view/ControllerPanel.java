package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ControllerPanel extends JPanel {
	private JButton loadBtn;
	private JTextArea textArea;
	private JPanel tickerPanel;
	private JPanel datePanel;
	private JLabel labelFrom;
	private JComboBox monthFromBox;
	private JComboBox monthToBox;
	private JTextField dayField;
	private JTextField yearFiled;
	private JLabel labelTo;
	private JTextField dayEndField;
	private JTextField yearEndFiled;
	
	public ControllerPanel() {
		super();
		textArea = new JTextArea("Insert tickers...",5,20);
		loadBtn = new JButton("Get Quotes");
		setLayout(new BorderLayout());
		
		//������ � ��������
		tickerPanel = new JPanel();
		tickerPanel.setSize(500, 400);
//		Dimension dim = getPreferredSize();
//		dim.width = 250;
//		setPreferredSize(dim);
		
		
		tickerPanel.add(textArea);
		
//		JLabel l = new JLabel("Hello");
//		tickerPanel.add(l);
		add(tickerPanel, BorderLayout.NORTH);
		
		//������ � ����������� ��� �� � ��
		datePanel = new JPanel();
		datePanel.setLayout(new GridLayout(2, 4));
		//������ ������
		labelFrom = new JLabel("Start Date: ");
		String [] monthlist = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
		monthFromBox = new JComboBox(monthlist);
		dayField = new JTextField();
		yearFiled = new JTextField();
		//������ ������
		labelTo = new JLabel("End Date: ");
		monthToBox = new JComboBox(monthlist);
		dayEndField = new JTextField();
		yearEndFiled = new JTextField();
		//��������� ����������
		datePanel.add(labelFrom);
		datePanel.add(monthFromBox);
		datePanel.add(dayField);
		datePanel.add(yearFiled);
		datePanel.add(labelTo);
		datePanel.add(monthToBox);
		datePanel.add(dayEndField);
		datePanel.add(yearEndFiled);
		add(datePanel,BorderLayout.CENTER);
		
		//��������� ������ �������� ���������
		add(loadBtn,BorderLayout.SOUTH);
		
		
	}
}
