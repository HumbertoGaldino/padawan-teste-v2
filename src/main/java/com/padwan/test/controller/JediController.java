package com.padwan.test.controller;

import org.json.JSONArray;
import org.json.JSONObject;
import com.padwan.test.repository.JediRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.padwan.test.model.Jedi;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/jedi")
public class JediController {

    private final JediRepository jediRepository;

    public JediController(JediRepository jediRepository) {
        this.jediRepository = jediRepository;
    }

   @GetMapping("/mentors")
    public ResponseEntity<List<Map<String, String>>> getAllMentorsAndapprentices() {
        try {
            List<Object[]> results = jediRepository.findAllMestresWithApprentices();

            List<Map<String, String>> formattedResults = results.stream().map(result -> {
                Map<String, String> map = new HashMap<>();
                map.put("mestre", result[0] != null ? result[0].toString() : ""); 
                map.put("aprendiz", result[1] != null ? result[1].toString() : ""); 
                return map;
            }).collect(Collectors.toList());

            return ResponseEntity.ok(formattedResults);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("")
    public ResponseEntity<String> setMentorAndAprendizes(@RequestBody List<Jedi> jedis) {
        try {
            jediRepository.saveAll(jedis);
            return ResponseEntity.status(HttpStatus.CREATED).body("Mestres e aprendizes inseridos com sucesso.");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao inserir mestres e aprendizes.");
        }
    }

    @GetMapping("/midichlorians-9000")
    public ResponseEntity<List<Map<String, String>>> getJedisByMidichloriansGreaterThan9000() {
        try {
            List<Jedi> results = jediRepository.findByMidichloriansGreaterThan9000();

            List<Map<String, String>> formattedResults = results.stream().map(jedi -> {
                Map<String, String> map = new HashMap<>();
                map.put("name", jedi.getName() != null ? jedi.getName() : ""); 
                map.put("status", jedi.getStatus() != null ? jedi.getStatus() : "");
                map.put("midichlorians", String.valueOf(jedi.getMidichlorians()));
                return map;
            }).collect(Collectors.toList());

            return ResponseEntity.ok(formattedResults);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/category")
    public ResponseEntity<List<Map<String, String>>> getJediCountByCategory() {
        try {

            List<Object[]> results = jediRepository.countJedisByStatus();

            List<Map<String, String>> formattedResults = results.stream().map(result -> {
                Map<String, String> map = new HashMap<>();
                map.put("status", result[0] != null ? result[0].toString() : "Desconhecido"); 
                map.put("quantidade", result[1] != null ? result[1].toString() : "0");
                return map;
            }).collect(Collectors.toList());

            return ResponseEntity.ok(formattedResults);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

}
