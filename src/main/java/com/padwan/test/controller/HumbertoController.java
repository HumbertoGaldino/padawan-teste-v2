package com.padwan.test.controller;

import com.padwan.test.dto.GenericoDTO;
import com.padwan.test.service.HumbertoService;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping("/humberto")
public class HumbertoController {

    private HumbertoService humbertoService;

    @Autowired
    public HumbertoController(HumbertoService humbertoService){
        this.humbertoService = humbertoService;
    }

    @ResponseBody
    @RequestMapping(value = "/skills", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> skills() {
        try {
            JSONObject json = new JSONObject();
            json.put("Humberto Galdino", humbertoService.skills());
            return new ResponseEntity(json.toString(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
