import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
 
public class filein {
	static ArrayList<City> ar = new ArrayList<City>();
	
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(new File("C:\\Users\\hp\\Desktop\\yq_in.txt"));
            System.setOut(new PrintStream(new BufferedOutputStream(
    				new FileOutputStream("C:\\Users\\hp\\Desktop\\yq_out.txt")),true));
 
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
        System.out.println(temp.getPro() + "\n" + temp.city + " " + temp.id);
        for(int i = 1; i < len; i++) {
        	temp = ar.get(i);
        	if(temp.getPro().equals(last.getPro())) {
        		System.out.println(temp.city + " " + temp.id);
        	}
        	else {
        		System.out.println("\n" + temp.getPro() + "\n" + temp.city + " " + temp.id);
        	}
        	last = temp;
        }
    }
}