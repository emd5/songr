package com.mahoneyliz.Java.Songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class AlbumController {

    @Autowired
    AlbumRepository albumRepository;

    @GetMapping("/albums")
    public String getAllAlbums(Model m){
        m.addAttribute("newAlbum", new Album());

        Iterable<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "album";
    }

    @PostMapping("/albums")
     public RedirectView albumSubmit(@ModelAttribute Album newAlbum){
        System.out.println(newAlbum.artist);
        albumRepository.save(newAlbum);
        return new RedirectView("/albums");
    }
}
