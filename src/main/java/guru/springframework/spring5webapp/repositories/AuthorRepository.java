package guru.springframework.spring5webapp.repositories;


import guru.springframework.spring5webapp.Model.Author;
import org.springframework.data.repository.CrudRepository;
//import spring.MyFirstSpring.Model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
