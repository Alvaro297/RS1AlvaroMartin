package RS1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("URL/persona")
public class DeletePerson {

    @Autowired
    PersonInterface personInterface;

    @GetMapping("{id}")
    public void deletePerson(@PathVariable int id){
        personInterface.deleteById(id);
    }

}