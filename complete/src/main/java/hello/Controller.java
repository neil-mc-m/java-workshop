package hello;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private CustomerRepository repository;

    @RequestMapping("/customers")
    public List<Customers> getAll() {
        return repository.findAll();
    }

    @RequestMapping("/customers/{firstName}")
    public List<Customers> getCustomer(@PathVariable("firstName") String firstName){
        return repository.findByFirstName(firstName);
    }
}

