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
    @Autowired
    SongRepository songRepository;

    @GetMapping("/albums")
    public String getAllAlbums(Model m){
        m.addAttribute("newAlbum", new Album());

        Iterable<Album> albums = albumRepository.findAll();
        m.addAttribute("albums", albums);
        return "album";
    }

    @PostMapping("/albums")
     public RedirectView albumSubmit(@ModelAttribute Album newAlbum){
        albumRepository.save(newAlbum);
        return new RedirectView("/albums");
    }

    @GetMapping("/albumDetail/{id}")
    public String getOneAlbum(@PathVariable Long id, Model m){

        //adding song to the list
        m.addAttribute("oneSong", new Song());

        Album a = albumRepository.findById(id).get();
        m.addAttribute("oneAlbum", a);

        return "albumDetails";
    }

    @PostMapping("/albumDetail/{id}")
    public String songSubmit(@PathVariable Long id , @RequestParam String title, @RequestParam int length,
                                   @RequestParam int trackNumber){
        Album a = albumRepository.findById(id).get();
        Song newSong = new Song(title,length,trackNumber, a);
        songRepository.save(newSong);
        return "redirect:/albumDetail/{id}";
    }




}
