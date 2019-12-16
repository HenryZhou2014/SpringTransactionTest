package henry.transaction.test.demo.service;

import henry.transaction.test.demo.Repository.PeopleRepository;
import henry.transaction.test.demo.entity.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PeopleService {
    @Autowired
    PeopleRepository peopleRepository;

    @Transactional
    public void insert(){
        People people = new People();
		people.setId("3");
		people.setName2("Henry1");

        People people2 = new People();
		people2.setId("4");
		people2.setName2("Henry2");

		peopleRepository.save(people);
		peopleRepository.save(people2);

        insert2();
    }

    @Transactional
    public void insert2(){
        People people2 = new People();
        people2.setId("5");
        people2.setName2("Henry2");

        peopleRepository.save(people2);
        int i=1/0;
    }
}
