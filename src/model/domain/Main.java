package model.domain;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
            
            HashMap hm = new HashMap();
		
            hm.put("ADS","Eletiva Java");
            hm.put("LOG","Administração");
            hm.put("ADS","Eletiva PHP");
            hm.put("ADS","Eletiva WEB");
            
            System.out.println(hm.get("ADS"));
	}

}
