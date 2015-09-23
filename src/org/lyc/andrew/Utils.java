package org.lyc.andrew;

public class Utils {

	/**
	 * to get each hex value from 100% to 0% alpha
	 * @return
	 */
	public static String getAlphaToHex(){
		StringBuilder sb = new StringBuilder();
		for (double i = 1; i >= 0; i -= 0.01) {
		    i = Math.round(i * 100) / 100.0d;
		    int alpha = (int) Math.round(i * 255);
		    String hex = Integer.toHexString(alpha).toUpperCase();
		    if (hex.length() == 1) hex = "0" + hex;
		    int percent = (int) (i * 100);
		    sb.append(String.format("%d%% ———— %s", percent, hex)+"\n");
		}
		return sb.toString();
	}
	
	 /**
	 * @param originalColor color, without alpha
	 * @param alpha from 0.0 to 1.0
	 * @return
	 */
	public static String addAlpha(String originalColor, double alpha) {
	    long alphaFixed = Math.round(alpha * 255);
	    String alphaHex = Long.toHexString(alphaFixed);
	    if (alphaHex.length() == 1) {
	        alphaHex = "0" + alphaHex;
	    }
	    originalColor = originalColor.replace("#", "#" + alphaHex);


	    return originalColor;
	}
}
