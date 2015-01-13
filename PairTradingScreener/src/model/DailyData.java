package model;

import java.math.BigDecimal;

public class DailyData {
	private String date;
	private String adjClose;
	private BigDecimal volatIndex;
	
	public String getAdjClose() {
		return adjClose;
	}
	public void setAdjClose(String adjClose) {
		this.adjClose = adjClose;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public BigDecimal getVolatile() {
		return volatIndex;
	}
	public void setVolatile(BigDecimal maValue) {
		this.volatIndex = maValue;
	}
}
