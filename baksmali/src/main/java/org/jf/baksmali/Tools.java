package org.jf.baksmali;

public class Tools {
	public static String getJavaDataType(String type) {
		String returnString = "";
		
		/** void */
		if(type.charAt(0)=='V') {
			returnString="void";
		}
		
		/** boolean */
		else if(type.charAt(0)=='Z') {
			returnString="boolean";
		}
		
		/** byte */
		else if(type.charAt(0)=='B') {
			returnString="byte";
		}
		
		/** short */
		else if(type.charAt(0)=='S') {
			returnString="short";
		}
		
		/** char */
		else if(type.charAt(0)=='C') {
			returnString="char";
		}
		
		/** integer */
		else if(type.charAt(0)=='I') {
			returnString="int";
		}
		
		/** long */
		else if(type.charAt(0)=='J') {
			returnString="long";
		}
		
		/** float */
		else if(type.charAt(0)=='F') {
			returnString="float";
		}
		
		/** double */
		else if(type.charAt(0)=='D') {
			returnString="double";
		}
		
		/** object */
		else if(type.charAt(0)=='L') {
			returnString=type.substring(1, type.length()-1).replace("/",".");
		}

		return returnString;
	}
}
