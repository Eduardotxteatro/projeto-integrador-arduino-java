package com.github.Eduardotxteatro.projeto_integrador_arduino_java.controller;

import com.github.Eduardotxteatro.projeto_integrador_arduino_java.sensorDados.SensorData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sensor")

public class SensorController {
    @Autowired private SensorRepository repository;

    @PostMapping
    public ResponseEntity<SensorData> receberDados(@RequestBody SensorData dados){

        SensorData saved = repository.save(dados);
        return ResponseEntity.ok(saved);
    }
}
