import ToolKit.QuadraticEquation;

import ToolKit.Stock;

public class Ex9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stock stock1 = new Stock("ORCL", "Oracle Corporation");
        stock1.setCurrentPrice(34.5);
        stock1.setCurrentPrice(34.35);
        System.out.println("Stock name: " + stock1.getName() + " Symbol: " + stock1.getSymbol());
        System.out.println("previous price: " + stock1.getPreviousClosingPrice());
        System.out.println("current price: " + stock1.getCurrentPrice());
        System.out.println("Percent changed: " + stock1.getChangePercent());


	}

}
