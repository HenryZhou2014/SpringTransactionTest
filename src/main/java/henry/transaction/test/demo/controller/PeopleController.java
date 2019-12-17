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

    @GetMapping("/insert3")
    @ResponseBody
    public String insert3(){
        peopleService.insert3();
        return "SUC";
    }

    @GetMapping("/insert4")
    @ResponseBody
    public String insert4(){
        peopleService.insert4();
        return "SUC";
    }

    @GetMapping("/insert5")
    @ResponseBody
    public String insert5(){
        peopleService.insert5();
        return "SUC";
    }

    @GetMapping("/insert7")
    @ResponseBody
    public String insert7(){
        peopleService.insert7();
        return "SUC";
    }
}
