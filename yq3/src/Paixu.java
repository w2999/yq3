import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Paixu {
			 public static Integer changeint(String c) {
				int parseInt = Integer.parseInt(c);
				return parseInt;
			}
			static ArrayList<City> ar = new ArrayList<City>();
			static ArrayList<Prov> pr = new ArrayList<Prov>();
			static String a;
			static int z = 0;
		    public static void main(String[] args) {
		            try {
		                Scanner in = new Scanner(new File("D:\\yq_in.txt"));
		                
		     
		                while (in.hasNextLine()) {
		                    String str = in.nextLine();
		                    String[] strArr = str.split("	");
		                    ar.add(new City(strArr));
		                }
		                in.close();
		            } catch (FileNotFoundException e) {
		                e.printStackTrace();
		            }
		            City temp = ar.get(0), last = ar.get(0);
		            int a = 0;
		            Prov pro = new Prov(temp.getPro());
		            for(int i = 0;i < ar.size(); i++) {
		            	temp = ar.get(i);
		            	a = changeint(temp.id);
		            	if(!last.getPro().equals(temp.pro)) {
		            		pr.add(pro);
		            		pro = new Prov(temp.pro);
		            		last = ar.get(i);
		            	}
		            	pro.addCity(temp);
		            	pro.setSum(pro.getSum() + a);
		            	
		            }
		            pr.add(pro);
		            Collections.sort(pr);
		            for(Prov p : pr) {
		            	Collections.sort(p.getCity());
		            	System.out.println(p.getName() + " " + p.getSum());
		            	for(City c : p.getCity()) {
		            		System.out.println(c.getCity() + " " + c.getId());
		            	}
		            	System.out.println();
		            }
		            
		            
		}
    }