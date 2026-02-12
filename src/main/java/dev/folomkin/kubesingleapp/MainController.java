package dev.folomkin.kubesingleapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/demo")
public class MainController {

    @GetMapping("/hello")
    public String hello() {
        return "hello from Kubernetes with volume!";
    }
}
