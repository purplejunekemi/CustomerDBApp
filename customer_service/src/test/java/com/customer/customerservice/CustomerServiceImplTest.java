package com.customer.customerservice;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.springframework.test.context.ContextConfiguration;

import com.customer.entities.Customer;


@ContextConfiguration(value= {"ServiceContextConfig"})
public class CustomerServiceImplTest {
	
	Customer customer;
	
	
	@Mock
	CustomerService customerServiceImpl;

	@Before
	public void setUp() throws Exception {
		
		customerServiceImpl = mock(CustomerService.class);
		 customer = new Customer();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void saveCustomerMethodTest() {
		
		
		
		doNothing().when(customerServiceImpl).saveCustomer(customer);
		customerServiceImpl.saveCustomer(customer);
		
		verify(customerServiceImpl, times(1)).saveCustomer(customer);
	}
	
	@Test
	public void findCustomerByIdTest() {
		
		when(customerServiceImpl.findById(1)).thenReturn(isA(Customer.class));
		customerServiceImpl.findById(1);
		
		verify(customerServiceImpl, times(1)).findById(1);
	}
	
	@Test
	public void findAllCustomersTest() {
			
		List<Customer> customers = new ArrayList<>();
		when(customerServiceImpl.findAll()).thenReturn(customers);
		customerServiceImpl.findById(1);
		
		verify(customerServiceImpl, times(1)).findById(1);
		
	}

}
