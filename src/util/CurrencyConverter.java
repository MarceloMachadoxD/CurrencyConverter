package util;

public class CurrencyConverter {

	public static double conv(double dollarPrice, double bought) {
		return (bought * dollarPrice) * 1.06;

	}

}
