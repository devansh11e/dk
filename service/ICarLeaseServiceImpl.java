package com.hexaware.carrental.service;

import java.util.List;

import com.hexaware.carrental.dao.ICarLeaseRepository;
import com.hexaware.carrental.dao.ICarLeaseRepositoryImpl;
import com.hexaware.carrental.entity.Customer;
import com.hexaware.carrental.entity.Lease;
import com.hexaware.carrental.entity.Payment;
import com.hexaware.carrental.entity.Vehicle;

public class ICarLeaseServiceImpl implements ICarLeaseService{
	private ICarLeaseRepository dao;
	public ICarLeaseServiceImpl()
	{ dao=new ICarLeaseRepositoryImpl();}

	@Override
	public int addCar(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return dao.addCar(vehicle);
	}

	@Override
	public int removeCar(int vehicleID) {
		// TODO Auto-generated method stub
		return dao.removeCar(vehicleID);
	}

	@Override
	public List<Vehicle> listAvailableCars() {
		// TODO Auto-generated method stub
		return dao.listAvailableCars();
	}

	@Override
	public List<Vehicle> listRentedCars() {
		// TODO Auto-generated method stub
		return dao.listRentedCars();
	}

	@Override
	public Vehicle findCarbyId(int vehicleID) {
		// TODO Auto-generated method stub
		return dao.findCarbyId(vehicleID);
	}

	@Override
	public int addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return dao.addCustomer(customer);
	}

	@Override
	public int removeCustomer(int customerID) {
		// TODO Auto-generated method stub
		return dao.removeCustomer(customerID);
	}

	@Override
	public List<Customer> listofAllCustomers() {
		// TODO Auto-generated method stub
		return dao.listofAllCustomers();
	}

	@Override
	public Customer findCustomerbyId(int customerID) {
		// TODO Auto-generated method stub
		return dao.findCustomerbyId(customerID);
	}

	@Override
	public int createLease(Lease lease) {
		// TODO Auto-generated method stub
		return dao.createLease(lease);
	}

	@Override
	public Lease returnCar(int leaseID) {
		// TODO Auto-generated method stub
		return dao.returnCar(leaseID);
	}

	@Override
	public List<Lease> listActiveLeases() {
		// TODO Auto-generated method stub
		return dao.listActiveLeases();
	}

	@Override
	public List<Lease> listLeaseHistory() {
		// TODO Auto-generated method stub
		return dao.listLeaseHistory();
	}

	@Override
	public int recordPayment(Payment payment) {
		// TODO Auto-generated method stub
		return dao.recordPayment(payment);
	}

}
