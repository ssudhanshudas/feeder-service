package com.jedify.feederservice.api;

import com.jedify.feederservice.Routes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by j1013575 on 3/26/2016.
 */
@RestController
@RequestMapping(value = Routes.MESSAGE)
public class MessageController {
    @RequestMapping(method = RequestMethod.GET)
    public String message() {
        return "Welcome to Jedify.com";
    }
}
