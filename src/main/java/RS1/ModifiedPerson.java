package RS1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("URL/persona")
public class ModifiedPerson {
    @Autowired
    PersonInterface personInterface;

    @PutMapping("modify/{id}")
    public void modifyPerson(@PathVariable int id, @RequestBody Person person){
        personInterface.findById(id).get();
        if (personInterface.findById(id).isPresent()){
            personInterface.findById(id).get().setName(person.getName());
            personInterface.findById(id).get().setPopulation(person.getPopulation());
            personInterface.findById(id).get().setAge(person.getAge());
        }
    }

}
