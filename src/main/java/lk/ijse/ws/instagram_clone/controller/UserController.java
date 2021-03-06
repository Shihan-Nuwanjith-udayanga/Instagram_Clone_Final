package lk.ijse.ws.instagram_clone.controller;

import lk.ijse.ws.instagram_clone.enitiy.InstaUser;
import lk.ijse.ws.instagram_clone.service.InstaUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class UserController {

    @Autowired
    private InstaUserService instaUserService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public boolean createAdmin(@RequestBody() InstaUser user){
        return instaUserService.saveUser(user);
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public InstaUser getAdmin(){
        return new InstaUser();
    }

}
