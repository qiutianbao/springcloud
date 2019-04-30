package com.jxtb.cloud.test.controller;

import com.jxtb.cloud.test.entity.XmlUser;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jxtb on 2019/1/31.
 */
@RestController
public class XmlUserController {
    //http://localhost:8762/json
    @GetMapping(value = "/json",produces = MediaType.APPLICATION_JSON_VALUE)
    public XmlUser index(){
        XmlUser user = new XmlUser("dalaoyang", "26", "北京");
        return user;
    }


    //http://localhost:8762/xml
    @GetMapping(value = "/xml",produces = MediaType.APPLICATION_XML_VALUE)
    public XmlUser XML(){
        XmlUser user = new XmlUser("dalaoyang", "26", "北京");
        return user;
    }
}
