package model;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
	private List<Stock> watchList = new ArrayList<Stock>();
	
	public void addStock(Stock currStock) {
		watchList.add(currStock);
	}
	
	public Stock getStock(String ticker) {
		for(Stock listItem : watchList) {
			if(listItem.getTicker() == ticker) {
				return listItem;
			}
		}
		return null;
	}
	
	public List<Stock> getWatchList() {
		return watchList;
	}

	public static Portfolio newInstance(Portfolio port) {
        Portfolio p = new Portfolio();
        for(Stock stock : port.getWatchList()) {
        	p.addStock(stock);
        }
        return p;
    }
	
	public void clear() {
		watchList.clear();
	}
	
//	public static void delete(String ticker) {
//		for (int i = 0; i < watchList.size(); i++) {
//			Stock st = watchList.get(i);
//			if(st.getTicker() == ticker) {
//				watchList.remove(i);
//			}
//		}
//	}

}
