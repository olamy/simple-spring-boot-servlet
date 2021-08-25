package org.eclipse.jetty.test.simplespringbootservlet.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeerService
{
    private static final String template = ",%s is a very good beer!";

    @GetMapping("/beer")
    public Beer greeting(@RequestParam(value = "name", defaultValue = "Pale Ale") String name)
    {
        return new Beer(String.format(template, name));
    }
}
