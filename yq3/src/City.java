public class City implements Comparable{
	String pro, city, id;
	
	public City() {}
	
	public City(String[] arr) {
		pro = arr[0];
		city = arr[1];
		id = arr[2];
	}

	public String getPro() {
		return pro;
	}

	public void setPro(String pro) {
		this.pro = pro;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		City c = (City)o;
		int cnt1 = Integer.parseInt(this.id);
		int cnt2 = Integer.parseInt(c.getId());
		if(cnt1 < cnt2) return 1;
		else if(cnt1 > cnt2) return -1;
		else {
			if(this.city.compareTo(c.getCity()) < 0) return -1;
			else return 1;
		}
	}
	
	
}
