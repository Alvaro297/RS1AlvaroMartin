package RS1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@RestController
@RequestMapping("person")
public class GetPerson {

    @Autowired
    PersonInterface personInterface;

    @GetMapping("/id/{id}")
    public Optional<Person> getPersonById(@PathVariable Integer id) {

        return personInterface.findById(id);
    }

    @GetMapping("/name/{name}")
    public Person getPersonByName(@PathVariable String name) {
       return personInterface.findByName(name);
    }
}