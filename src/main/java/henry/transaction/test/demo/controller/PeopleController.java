package henry.transaction.test.demo.controller;

import henry.transaction.test.demo.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/people")
public class PeopleController {
    @Autowired
    PeopleService peopleService;

    @GetMapping("/insert")
    @ResponseBody
    public String insert(){
        peopleService.insert();
        return "SUC";
    }

}
