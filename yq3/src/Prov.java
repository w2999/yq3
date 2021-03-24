import java.util.ArrayList;

public class Prov implements Comparable{
	private String name;
	private int sum = 0;
	private ArrayList<City> city = new ArrayList<City>();
	
	public Prov() {}
	public Prov(String name) {
		this.name = name;
	}
	public Prov(String name, int sum) {
		this.name = name;
		this.sum = sum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public ArrayList<City> getCity() {
		return city;
	}
	public void setCity(ArrayList<City> city) {
		this.city = city;
	}
	
	public void addCity(City city) {
		this.city.add(city);
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Prov prov = (Prov)o;
		if(this.sum > prov.getSum()) return -1;
		else if(this.sum < prov.getSum()) return 1;
		else {
			if(this.name.compareTo(prov.getName()) < 0) return -1;
			else  return 1;
		}
	}
	
	
}
