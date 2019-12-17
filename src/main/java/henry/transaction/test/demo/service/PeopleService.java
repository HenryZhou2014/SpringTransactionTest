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

    //事务方法调用事务方法，发生异常正常回滚
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

    //无事务注解，插入抛异常，插入成功
    public void insert3(){
        People people = new People();
        people.setId("222");
        people.setName2("Henry1");

        peopleRepository.save(people);
        int i=1/0;
    }

    //有事务注解，插入抛异常，回滚
    @Transactional
    public void insert4(){
        People people = new People();
        people.setId("333");
        people.setName2("Henry1");

        peopleRepository.save(people);
        int i=1/0;
    }

    //有事务方法，调用非事务方法，非事务方法异常 回滚
    @Transactional
    public void insert5(){
        People people = new People();
        people.setId("5555");
        people.setName2("Henry1");

        peopleRepository.save(people);
        insert6();
    }

    public void insert6(){
        People people = new People();
        people.setId("6666");
        people.setName2("Henry1");

        peopleRepository.save(people);
        int i=1/0;
    }

    //非事务方法，调用事务方法，事务方法异常 ,不回滚
    public void insert7(){
        People people = new People();
        people.setId("77777");
        people.setName2("Henry1");

        peopleRepository.save(people);
        insert8();
    }

    @Transactional
    public void insert8(){
        People people = new People();
        people.setId("8888");
        people.setName2("Henry1");

        peopleRepository.save(people);
        int i=1/0;
    }

}
