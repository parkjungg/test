package org.example.chatproject.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Log4j2
@RestController
public class ChatController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/chat")
    public String chat(@RequestParam("username") String username) {
        return ("redirect:/chat?username=" + username);
    }
    ///chat 엔드포인트인 컨트롤러
    @GetMapping("/chat")
    public String chatGET() {
        log.info("@ChatController.chatGET()");
        return "chat"; //리턴으로 템플릿엔진 chat.html 을 반환하도록 설정
    }

}
