package org.devivo.blackwhite;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public final AtomicLong counter = new AtomicLong();
    public final String template = "Hello, %s!!!!";

    @RequestMapping("/greeting")
    public Greeting index
    (@RequestParam(value= "name", defaultValue = "World") String name)
    {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
    
}
