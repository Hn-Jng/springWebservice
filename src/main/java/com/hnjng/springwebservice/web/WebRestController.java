package com.hnjng.springwebservice.web;

import com.hnjng.springwebservice.domain.PostsRepository;
import com.hnjng.springwebservice.dto.posts.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor

public class WebRestController {

    private PostsRepository postsRepository;

    @GetMapping("/hello")
    public String hello(){
        return "hnjng Welcome";
    }
    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto){
        postsRepository.save(dto.toEntity());
    }
}
