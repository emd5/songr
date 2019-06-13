package com.mahoneyliz.Java.Songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String gtAllAlbums(Model m){
        Iterable<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
    }

}
