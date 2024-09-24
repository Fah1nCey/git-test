package com.example.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitDemoApplication.class, args);
        System.out.println("hello, git");
        System.out.println("hello, git2");
        System.out.println("hello, git3");
        System.out.println("hello, git4");
        System.out.println("hot-fix test");
    }

}
