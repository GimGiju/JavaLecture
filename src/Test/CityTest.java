package Test;

import java.util.List;

public class CityTest {

	public static void main(String[] args) {
		CityDao cDao = new CityDao();
		City city = null;
		
		List<City>list = cDao.getCityList("countrycode" , "as", 5, 0);
		list.forEach(x -> System.out.println(x));
		
		cDao.close();
		

	}

}
