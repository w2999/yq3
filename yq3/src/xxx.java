
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class xxx {
	static ArrayList<City> ar = new ArrayList<City>();
	static String a;
    public static void main(String[] args) {
    	System.out.println(" ‰»Î °∑›");
    	Scanner p = new Scanner(System.in);
    	a = p.next();
            try {
                Scanner in = new Scanner(new File("H:\\yq\\yq_in.txt"));
                System.setOut(new PrintStream(new BufferedOutputStream(
        				new FileOutputStream("H:\\yq\\yq_"+ a +".txt")),true));
     
                while (in.hasNextLine()) {
                    String str = in.nextLine();
                    String[] strArr = str.split("	");
                    ar.add(new City(strArr));
                }
                in.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            int len = ar.size();
            City temp = ar.get(0), last = ar.get(0);
            for(int i = 0;i<ar.size();i++) {
            	temp = ar.get(i);
            	if(a.equals(temp.getPro())){
            		System.out.println(temp.city + " " + temp.id);
            	}
            }

            
           /* for(int i = 1; i < len; i++) {
            	temp = ar.get(i);
            	if(temp.getPro().equals(last.getPro())) {
            		System.out.println(temp.city + " " + temp.id);
            	}
            	else {
            		System.out.println("\n" + temp.getPro() + "\n" + temp.city + " " + temp.id);
            	}
            	last = temp;
            }*/
       

    }
}
