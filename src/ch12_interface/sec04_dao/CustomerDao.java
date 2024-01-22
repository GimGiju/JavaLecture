package ch12_interface.sec04_dao;

import java.util.List;

// DAO(Data Access Object) - DB를 액세스하기 위한 코드
public interface CustomerDao {
	Customer getCustomer(int cid);  // cid값을 주면 Customer 객체를 가져와라
	
	List<Customer> getCustomerList();
	
	void insertCustomer(Customer customer);
	
	void updateCustomer(Customer customer);  
	
	void deleteCustomer(int cid);   // cid 내용을 주니까 db(데이터 베이스) 내용을 삭제해라

	

	
	
}
