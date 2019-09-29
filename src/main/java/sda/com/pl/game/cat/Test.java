package sda.com.pl.game.cat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Test {

    @GetMapping ("/hello-world")
    public String getHelloWorld2() {
        return "catsView";
    }
}
