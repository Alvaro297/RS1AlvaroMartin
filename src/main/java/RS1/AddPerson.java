package RS1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("URL/persona")
public class AddPerson {

    @Autowired
    PersonInterface personInterface;

    @PostMapping("add")
    public void addPersonList(@RequestBody Person person){
        personInterface.save(person);
    }

}
