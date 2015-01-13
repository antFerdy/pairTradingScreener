package model;

import java.math.BigDecimal;

public class SpreadData {
	private String date;
	private BigDecimal spreadValue;
	
	public SpreadData(String date, BigDecimal spreadValue) {
		this.date = date;
		this.spreadValue = spreadValue;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public BigDecimal getSpreadValue() {
		return spreadValue;
	}
	public void setSpreadValue(BigDecimal spreadValue) {
		this.spreadValue = spreadValue;
	}
}
