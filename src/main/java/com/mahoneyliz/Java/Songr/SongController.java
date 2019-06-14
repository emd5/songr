package com.mahoneyliz.Java.Songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SongController {

    @Autowired
    SongRepository songRepository;

    @GetMapping("/songs")
    public String index(Model m) {
        m.addAttribute("songs", songRepository.findAll());
        return "songs";
    }
}
