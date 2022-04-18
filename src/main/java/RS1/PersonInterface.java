package RS1;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonInterface extends JpaRepository<Person, Integer>{
    Person findByName(String name);
}
