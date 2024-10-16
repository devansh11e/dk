package com.hexaware.carrental.dao;

import java.sql.Date;
import java.util.List;

import com.hexaware.carrental.entity.Customer;
import com.hexaware.carrental.entity.Lease;
import com.hexaware.carrental.entity.Payment;
import com.hexaware.carrental.entity.Vehicle;

public interface ICarLeaseRepository {
       int addCar(Vehicle vehicle);
       int removeCar(int vehicleID);
       List<Vehicle> listAvailableCars();
       List<Vehicle> listRentedCars();
       Vehicle findCarbyId(int vehicleID);
       int addCustomer(Customer customer);
       int removeCustomer(int customerID);
       List<Customer> listofAllCustomers();
       Customer findCustomerbyId(int customerID);
       int createLease(Lease lease);
       Lease returnCar(int leaseID);
       List<Lease> listActiveLeases();
       List<Lease> listLeaseHistory();
       int recordPayment(Payment payment);
       
       
}
