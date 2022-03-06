package com.example.gestionPost.controller;


import com.example.gestionPost.dto.RegisterRequest;
import com.example.gestionPost.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private AuthService authService;



    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody RegisterRequest registerRequest)
    {
     authService.signup(registerRequest);
     return new ResponseEntity<>("User Register succesfulmly", HttpStatus.OK);
    }

    @GetMapping("accountVerification/{token}")
    public ResponseEntity<String> veriyAccount(@PathVariable String token)
    {
        authService.verifyAccount(token);

        return new ResponseEntity<>("Account Activated succesfulmly", HttpStatus.OK);
    }
}
