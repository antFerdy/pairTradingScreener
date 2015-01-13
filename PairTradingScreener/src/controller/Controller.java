package controller;


import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import util.QuoteLoader;
import util.SpreadCounter;
import util.UtilHelper;
import view.App;
import model.Portfolio;
import model.SpreadObject;
import model.Stock;

public class Controller {
	private static App inst;
	private static QuoteLoader loader;
	private static Portfolio p;
	
	public static void main(String[] args) {
		loader = new QuoteLoader();
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				inst = new App();
				inst.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				inst.setLocationRelativeTo(null);
				inst.setVisible(true);
			}
		});
	}
		
	public static void getQuotes(String [] tickers) {
		for(String ticker : tickers) {
			loader.loadQuotes(ticker);
		}
		
		p = loader.getPortfolio();
		
		//����������� ����� � ������ �� ���, ������� ��� ������� ��� ����������
		
		for(Stock item : p.getWatchList()) {
			UtilHelper.loadMath(item.getData(), item);
		}
		
		//������� �����
		SpreadCounter spCounter = new SpreadCounter();
		List<SpreadObject> list = spCounter.loadSpread(p);
		
		//��������� ������ � ������� � �������
		inst.addData(list);

	}
	
	public static void clearPortfolio() {
		p.clear();
	}
	

}
  