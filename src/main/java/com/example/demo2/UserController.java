package com.example.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/checkDuplicate")

    public ResponseEntity<String> checkDuplicate(@RequestBody UserEntity user) {
        if (userService.checkDuplicate(user.getAlternateContact(), user.getAlternateContact())) {
            return new ResponseEntity<>("http:409 - status:  record already exists", HttpStatus.CONFLICT);
        } else {
            return new ResponseEntity<>("http:200 - status: No  record exists", HttpStatus.OK );
        }


    }


}
