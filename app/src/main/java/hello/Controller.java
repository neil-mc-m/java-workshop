package hello;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private CustomerRepository repository;

    @RequestMapping("/customers")
    public List<Customer> getAll() {

        return repository.findAll();
    }

    @RequestMapping("/customers/{firstName}")
    public List<Customer> getCustomer(@PathVariable("firstName") String firstName){
        return repository.findByFirstName(firstName);
    }
}

