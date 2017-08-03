package hello;

import org.springframework.stereotype.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

/**
 * Created by aaron on 8/2/17.
 */
@Controller
public class UnicornController {

    @RequestMapping("/unicorn")
    public String unicorn(Model model) {
        return "unicorn";
    }

    @RequestMapping("/unicorns")
    public String unicorns(Model model){
        ArrayList<Integer> unicorn = unicornArr(20);
        model.addAttribute("unicorns", unicorn);
        return "unicorns";
    }

    public ArrayList<Integer> unicornArr(int num){
        ArrayList<Integer> unicorns = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < num; i++) {
            unicorns.add(count);
            count++;
        }
        return unicorns;
    }

}