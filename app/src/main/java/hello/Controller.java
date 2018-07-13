package hello;

import hello.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    @Autowired
    public CustomerRepository repository;
    @Autowired
    public CustomerService customerService;

    @RequestMapping("/customers")
    public List<Customer> getAll() {

        return customerService.getAllCustomers();
    }

    @RequestMapping("/customers/{firstName}")
    public List<Customer> getCustomer(@PathVariable("firstName") String firstName){
        return customerService.getCustomerByFirstName(firstName);
    }
}

