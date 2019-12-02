package org.sunbeam.kdac;

public class Convert {

	public static Object changeType(String strNumber, String params) {
		switch (params) {
		case "int":
			return Integer.parseInt(strNumber);
		case "float":
			return Float.parseFloat(strNumber);
		case "double":
			return Double.parseDouble(strNumber);
		default:
			break;
		}
		return null;
	}

}
