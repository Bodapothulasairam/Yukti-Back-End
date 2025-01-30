package com.example.Yukti.Controller;
import com.example.Yukti.Model.User;
import com.example.Yukti.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/registerUser")
    public HttpStatusCode registerUser(@RequestBody User user)
    {
        if(user.getEmail()!=null)
        {
            this.userService.saveUser(user);
            return HttpStatus.OK;
        }
        return HttpStatus.BAD_REQUEST;
    }
}
