package henry.transaction.test.demo.Repository;

import henry.transaction.test.demo.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<People, String> {

}
