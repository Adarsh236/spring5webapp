package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.Model.Publisher;
import org.springframework.data.repository.CrudRepository;
//import spring.MyFirstSpring.Model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
