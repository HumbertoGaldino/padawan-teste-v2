package com.padwan.test.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HumbertoService {

    public List<String> skills(){
        List<String> skills = new ArrayList<>();
        skills.add("JavaScript");
        skills.add("React");
        skills.add("Next.js");
        skills.add("Node.js");
        skills.add("PostegreSQL");
        skills.add("MongoDB");
        skills.add("Tailwindcss");
        skills.add("Git");
        skills.add("GitHub");
        return skills;
    }

}