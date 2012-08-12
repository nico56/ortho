package datas;

import java.util.ArrayList;

public class test {
	
	private static exo e;
	private static ArrayList<String>  sms;
	private static ArrayList<String> ped;
	private static ArrayList<String> seg;
	private static ArrayList<String> bm;
	private static ArrayList<String>  sms1;
	private static ArrayList<String> ped1;
	private static ArrayList<String> seg1;
	private static ArrayList<String> bm1;
	
	public static void main(String[] args){
		
		e = new exo();
		sms= e.getSmsInco();
		ped= e.getPedInco();
		seg= e.getSegInco();
		bm= e.getBmInco();
		sms1= e.getSmsCo();
		ped1= e.getPedCo();
		seg1= e.getSegCo();
		bm1= e.getBmCo();
		
		
	}
}
