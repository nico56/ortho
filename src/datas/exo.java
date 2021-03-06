package datas;

import java.io.*;
import java.util.ArrayList;

public class exo {
	
	private ArrayList<String>  smsInco;
	private ArrayList<String> pedInco;
	private ArrayList<String> segInco;
	private ArrayList<String> bmInco;
	private ArrayList<String>  smsCo;
	private ArrayList<String> pedCo;
	private ArrayList<String> segCo;
	private ArrayList<String> bmCo;
	/*lit les fichier txt et les mets dans larraylist 		correspondantes
	**/
	public exo(){
		smsInco=exo.lire("smsInco.txt");
		pedInco=exo.lire("pedInco.txt");
		segInco=exo.lire("segInco.txt");
		bmInco=exo.lire("bmInco.txt");
		smsCo=exo.lire("smsCo.txt");
		pedCo=exo.lire("pedCo.txt");
		segCo=exo.lire("segCo.txt");
		bmCo=exo.lire("bmCo.txt");
	}
	public ArrayList<String> getSmsInco() {
		return smsInco;
	}
	
	public ArrayList<String> getSmsCo() {
		return smsCo;
	}
	
	public ArrayList<String> getPedInco() {
		return pedInco;
	}
	
	public ArrayList<String> getPedCo() {
		return pedCo;
	}
	
	public ArrayList<String> getSegCo() {
		return segCo;
	}
	
	public ArrayList<String> getBmCo() {
		return bmCo;
	}
	
	public ArrayList<String> getSegInco() {
		return segInco;
	}

	public ArrayList<String> getBmInco() {
		return bmInco;
	}
	
	/*lit le fichier nom passer en parametre et retourne une 		arraylist du contenu de ce dernier
	**/
	public static ArrayList<String> lire(String nFichier){
		ArrayList<String> res = new ArrayList<String>();
		try{
			InputStream ips=new FileInputStream(nFichier); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			while ((ligne=br.readLine())!=null){
				res.add(ligne);
			}
			br.close(); 
		}		
		catch (Exception e){
			System.out.println(e.toString());
		}
		return res;
	}
	
	/**int n correspond a lexercice
	et la string passer en parametre est la string a rechercher dans les fichiers correcte
0=> exo sms
1=> exo ped
2=>exo seg
3=> exo bon mot
**/
	public boolean comparer(String s,int n){
		boolean res=false;
		int i=0;
		if (n==0){
			while(res==false && i<smsCo.size()){
				if (s.equals(smsCo.get(i))){
					res=true;
				}
				i++;
			}
		}
			else if (n==1){
				while(res==false && i<pedCo.size()){
					if (s.equals(pedCo.get(i))){
					res=true;
					}
					i++;
				}
			}
				else if (n==2){
					while(res==false && i<segCo.size()){
						if (s.equals(segCo.get(i))){
							res=true;
						}
						i++;
					}
				}
					else if (n==3){
						while(res==false && i<bmCo.size()){
							if (s.equals(bmCo.get(i))){
								res=true;
							}
							i++;
						}
					}
		
		return res;
	
	}
}
