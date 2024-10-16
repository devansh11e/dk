package com.hexaware.carrental.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hexaware.carrental.entity.Customer;
import com.hexaware.carrental.entity.Lease;
import com.hexaware.carrental.entity.Vehicle;
import com.hexaware.carrental.entity.Payment;
import com.hexaware.carrental.dao.DBUtil;

public class ICarLeaseRepositoryImpl implements ICarLeaseRepository{
	private Connection conn;

	public ICarLeaseRepositoryImpl() {

		conn = DBUtil.getDBConnection();
}


	@Override
	public int addCar(Vehicle vehicle) {
		int count=0;
		String insert="insert into Vehicle(vehicleId,make,model,year,dailyRate,status,passengerCapacity,engineCapacity) values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement pstmt=conn.prepareStatement(insert);
			pstmt.setInt(1, vehicle.getVehicleId());
			pstmt.setString(2, vehicle.getMake());
			pstmt.setString(3, vehicle.getModel());
			pstmt.setInt(4, vehicle.getYear());
			pstmt.setDouble(5, vehicle.getDailyRate());
			pstmt.setString(6, vehicle.getStatus());
			pstmt.setInt(7, vehicle.getPassengerCapacity());
			pstmt.setInt(8, vehicle.getEngineCapacity());
			
			count=pstmt.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
		
	}

	@Override
	public int removeCar(int vehicleID) {
		 int count=0;
			
			String delete="delete from Vehicle where vehicleID=?";
			
			
			try {
				PreparedStatement pstmt = conn.prepareStatement(delete);
				pstmt.setInt(1,vehicleID);
				
				count=pstmt.executeUpdate();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		
			return count;
		
	}

	@Override
	public List<Vehicle> listAvailableCars() {
		// TODO Auto-generated method stub
       List<Vehicle> list=new ArrayList<Vehicle>();
		
		String selectAll="select * from vehicle where status='available' ";
		try {
			PreparedStatement pstmt=conn.prepareStatement(selectAll);
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				int vehicleId=rs.getInt("vehicleID");
				String make=rs.getString("Make");
				String model=rs.getString("model");
				int year=rs.getInt("year");
				Double dailyRate=rs.getDouble("DailyRate");
				String Status=rs.getString("Status");
				int passengerCapacity=rs.getInt("PassengerCapacity");
				int EngineCapacity=rs.getInt("EngineCapacity");
				
				Vehicle vehicle=new Vehicle(vehicleId,make,model,year,dailyRate,Status,passengerCapacity,EngineCapacity);
				list.add(vehicle);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	

	@Override
	public List<Vehicle> listRentedCars() {
		// TODO Auto-generated method stub
		 List<Vehicle> list=new ArrayList<Vehicle>();
			
			String selectAll="select * from vehicle where status='not available' ";
			try {
				PreparedStatement pstmt=conn.prepareStatement(selectAll);
				
				ResultSet rs=pstmt.executeQuery();
				while(rs.next()) {
					int vehicleId=rs.getInt("vehicleID");
					String make=rs.getString("Make");
					String model=rs.getString("model");
					int year=rs.getInt("year");
					Double dailyRate=rs.getDouble("DailyRate");
					String Status=rs.getString("Status");
					int passengerCapacity=rs.getInt("PassengerCapacity");
					int EngineCapacity=rs.getInt("EngineCapacity");
					
					Vehicle vehicle=new Vehicle(vehicleId,make,model,year,dailyRate,Status,passengerCapacity,EngineCapacity);
					list.add(vehicle);
					
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return list;
	}

	@Override
	public Vehicle findCarbyId(int vehicleID) {
		Vehicle vehicle=null;
		String selectAll="select * from vehicle where vehicleid = ?";
		try {
			PreparedStatement pstmt=conn.prepareStatement(selectAll);
			pstmt.setInt(1,vehicleID);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				int vehicleId=rs.getInt("vehicleID");
				String make=rs.getString("Make");
				String model=rs.getString("model");
				int year=rs.getInt("year");
				Double dailyRate=rs.getDouble("DailyRate");
				String Status=rs.getString("Status");
				int passengerCapacity=rs.getInt("PassengerCapacity");
				int EngineCapacity=rs.getInt("EngineCapacity");
				
				
				  vehicle=new Vehicle(vehicleId,make,model,year,dailyRate,Status,passengerCapacity,EngineCapacity);
			}	
				
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return vehicle;
	}

	@Override
	public int addCustomer(Customer customer) {
		int count=0;
		String insert="insert into customer(customerId,firstname,lastname,email,phonenumber) values(?,?,?,?,?)";
		try {
			PreparedStatement pstmt=conn.prepareStatement(insert);
			pstmt.setInt(1, customer.getCustomerId());
			pstmt.setString(2, customer.getFirstName());
			pstmt.setString(3, customer.getLastName());
			pstmt.setString(4, customer.getEmail());
			pstmt.setLong(5, customer.getPhoneNumber());
			
			count=pstmt.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	
		
	}

	@Override
	public int removeCustomer(int customerID) {
       int count=0;
		
		String delete="delete from Vehicle where customerID=?";
		
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(delete);
			pstmt.setInt(1,customerID);
			
			count=pstmt.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	
		return count;
		
	}

	@Override
	public List<Customer> listofAllCustomers() {
      List<Customer> list=new ArrayList<Customer>();
		
		String selectAll="select * from customer ";
		try {
			PreparedStatement pstmt=conn.prepareStatement(selectAll);
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				int customerId=rs.getInt("customerID");
				String firstName=rs.getString("firstname");
				String lastName=rs.getString("lastname");
				String email=rs.getString("email");
			    long phoneNumber=rs.getLong("phonenumber");
				
				
				Customer customer=new Customer(customerId,firstName,lastName,email,phoneNumber);
				list.add(customer);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public Customer findCustomerbyId(int customerID) {
       
		Customer customer=null;
		String selectAll="select * from customer where customerid = ?";
		try {
			PreparedStatement pstmt=conn.prepareStatement(selectAll);
			pstmt.setInt(1,customerID);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				int customerId=rs.getInt("customerID");
				String firstName=rs.getString("firstname");
				String lastName=rs.getString("lastname");
				String email=rs.getString("email");
				long phoneNumber=rs.getLong("phonenumber");
				
				
				  customer=new Customer(customerId,firstName,lastName,email,phoneNumber);
			}	
				
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return customer;
	}

	@Override
	public int createLease(Lease lease) {
		int count=0;
		String insert="insert into lease(leaseId,startdate,enddate,type) values(?,?,?,?)";
		try {
			PreparedStatement pstmt=conn.prepareStatement(insert);
			pstmt.setInt(1, lease.getLeaseId());
			pstmt.setDate(2, lease.getStartDate());
			pstmt.setDate(3, lease.getEndDate());
			pstmt.setString(4,lease.getType());
			
			count=pstmt.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public Lease returnCar(int leaseID) {
		Lease lease =null;
		String selectAll="select * from lease where leaseId = ?";
		try {
			PreparedStatement pstmt=conn.prepareStatement(selectAll);
			pstmt.setInt(1,leaseID);
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				int leaseId=rs.getInt("LeaseID");
				Date startDate=rs.getDate("startDate");
				Date endDate=rs.getDate("endDate");
				String type=rs.getString("Type");
				
				
				
				  lease=new Lease(leaseID,startDate,endDate,type);
			}	
				
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lease;
	}

	@Override
	public List<Lease> listActiveLeases() {
		 List<Lease> list=new ArrayList<Lease>();
			
			String selectAll="select * from lease where type='active'";
			try {
				PreparedStatement pstmt=conn.prepareStatement(selectAll);
				
				ResultSet rs=pstmt.executeQuery();
				while(rs.next()) {
					int leaseId=rs.getInt("LeaseID");
					Date startDate=rs.getDate("startDate");
					Date endDate=rs.getDate("endDate");
					String type=rs.getString("Type");
				    
					
					
					Lease lease=new Lease(leaseId,startDate,endDate,type);
					list.add(lease);
					
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return list;
	}

	@Override
	public List<Lease> listLeaseHistory() {
       List<Lease> list=new ArrayList<Lease>();
		
		String selectAll="select * from lease ";
		try {
			PreparedStatement pstmt=conn.prepareStatement(selectAll);
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()) {
				int leaseId=rs.getInt("LeaseID");
				Date startDate=rs.getDate("startDate");
				Date endDate=rs.getDate("endDate");
				String type=rs.getString("Type");
			    
				
				
				Lease lease=new Lease(leaseId,startDate,endDate,type);
				list.add(lease);
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public int recordPayment(Payment payment) {
		int count=0;
		String insert="insert into payment(paymentID,paymentDate,amount) values(?,?,?)";
		try {
			PreparedStatement pstmt=conn.prepareStatement(insert);
			pstmt.setInt(1, payment.getPaymentId());
			pstmt.setDate(2, payment.getPaymentDate());
			pstmt.setDouble(3, payment.getAmount());
			
			count=pstmt.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
		
	
	

}
