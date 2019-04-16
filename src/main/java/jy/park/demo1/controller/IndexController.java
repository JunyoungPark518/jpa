package jy.park.demo1.controller;

import jy.park.demo1.model.MainDto;
import jy.park.demo1.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping
public class IndexController {

    @Autowired
    IndexService service;

    @GetMapping
    @ResponseBody
    public String index() {
        return "Hello world!";
    }

    @GetMapping("/login")
    @ResponseBody
    public String login(){
        return "redirect:index.html";
    }


    @GetMapping("/selectTest")
    @ResponseBody
    public List<MainDto> selectTest(){
        return service.selectAll();
    }


    @GetMapping("/insert")
    public String insertTestData(@RequestParam(value = "filePath", defaultValue = "", required = false) String filePath){
        return service.insertAll(StringUtils.isEmpty(filePath) ? "/Users/jyp/Desktop/demo1/src/main/resources/static/file/data.txt" : filePath);
    }


}
