package com.utad.Platos.Favoritos.controller;

import com.utad.Platos.Favoritos.model.Plato;
import com.utad.Platos.Favoritos.service.PlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/platos")
public class PlatoController {

    private final PlatoService platorService;
    @Autowired
    public PlatoController(PlatoService platorService) {
        this.platorService = platorService;
    }

    @GetMapping
    public ResponseEntity<List<Plato>> fetAll(){
        List<Plato> list = platorService.getPlatos();
        return ResponseEntity.ok(list);
    }
}
