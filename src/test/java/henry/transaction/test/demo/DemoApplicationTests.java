package henry.transaction.test.demo;

import henry.transaction.test.demo.Repository.PeopleRepository;
import henry.transaction.test.demo.Repository.RoleRepository;
import henry.transaction.test.demo.entity.People;
import henry.transaction.test.demo.entity.Role;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	PeopleRepository peopleRepository;

	@Resource
	RoleRepository roleRepository;

	@Before
	public void before(){
		peopleRepository.deleteAll();
		roleRepository.deleteAll();
	}

	@Test
	@Transactional
	public void insert() {
		People people = new People();
		people.setId("3");
		people.setName2("Henry1");

		People people2 = new People();
		people2.setId("4");
		people2.setName2("Henry2");

		peopleRepository.save(people);
		peopleRepository.save(people2);

		int i =1/0;

		Role role1 = new Role();
		role1.setId(1);
		role1.setName("Manage");
		Role role2 = new Role();
		role2.setId(2);
		role2.setName("employee");

		roleRepository.save(role1);
		roleRepository.save(role2);
	}

}
