package hello.maven;


import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/")
public class HelloController {

    @Get("/")
    public String welcome() {
        return "Welcome to Micronaut!";
    }

    @Get("/hello/{name}")
    public String hello(String name) {
        return "Hello " + name + "!";
    }
}
