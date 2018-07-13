package hello.Service;

import hello.Customer;
import hello.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    public CustomerRepository customerRepository;


    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public List<Customer> getCustomerByFirstName(String firstName) {
        return customerRepository.findByFirstName(firstName);
    }
}
