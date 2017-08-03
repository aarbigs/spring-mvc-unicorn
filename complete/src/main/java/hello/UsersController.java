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
public class UsersController {

    @RequestMapping("/users")
    public String users(Model model) {
        ArrayList<UserPojo> users = userData(5);
        model.addAttribute("users", users);
        return "users";
    }

    @RequestMapping("/user")
    public String user(Model model){
        UserPojo user = new UserPojo(1, "Aaron", "Bigelow");
        model.addAttribute("user",user);
        return "user";
    }

    public ArrayList<UserPojo> userData (int num){
        ArrayList<UserPojo> users = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            UserPojo user2 = new UserPojo(1, "Aaron2", "Bigelow2");
            users.add(user2);
        }
        return users;
    }

}

