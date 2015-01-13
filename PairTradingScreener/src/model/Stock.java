package model;

import java.util.ArrayList;
import java.util.List;

public class Stock {
	private String ticker;
	private List<DailyData> data = new ArrayList<DailyData>();
	
	public void addData(DailyData currData) {
		data.add(currData);
		
	}
	
	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	public List<DailyData> getData() {
		return data;
	}

	public void setData(List<DailyData> data) {
		this.data = data;
	}
	
}
