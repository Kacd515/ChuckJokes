package pl.akademiakodu.chuckNorrisJokes;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(ModelMap modelMap) {
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
        modelMap.put("quote", chuckNorrisQuotes.getRandomQuote());
        return "home";
    }
}
