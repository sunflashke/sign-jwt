package com.sunflash.sign.auth;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/auth")

public class AuthenticationController {

    private final AuthenticationService service;

    @PostMapping("/register")
        public ResponseEntity <AuthenticationResponse> register(
        @RequestBody RegisterRequest registerRequest
){
       return ResponseEntity.ok(service.register(registerRequest));
    }
    @PostMapping("/authenticate")
    public ResponseEntity <AuthenticationResponse> register(
            @RequestBody AuthenticationRequest authenticationRequest
    ){
        return ResponseEntity.ok(service.authenticate(authenticationRequest));
    }

}
