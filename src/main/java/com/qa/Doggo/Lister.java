package com.qa.Doggo;

import java.util.ArrayList;

public class Lister {
	
	public static ArrayList<String> inputData(int Start, int Finish, int Position) {
		
		ArrayList<String> positions = new ArrayList<String>();
		
		for(int i=Start; i<=Finish; i++) {
		int secondToLast = (i/10)%10;
		int removeLastDigit=i / 10;
		if(i!=Position) {
		if(i<21) {
			positions.add(appender(i));
		}
		else if(secondToLast==1) {
			positions.add(i+"th");
		}
		else {
			if(i%10 == 0) {
			positions.add(removeLastDigit+"0th");
			}
			else {
			positions.add(removeLastDigit+appender(i % 10));
			}
		}
		}
		} return positions;
	}
	
	public static String appender(int position) {
		
		if(position==1) {
			return "1st";
		}
		else if(position==2) {
			return "2nd";
		}
		else if(position==3) {
			return "3rd";
		}
		else if(position>3) {
			return position+"th";
		}
		return null;
	}
	
}
