package com.github.Eduardotxteatro.projeto_integrador_arduino_java.controller;

import com.github.Eduardotxteatro.projeto_integrador_arduino_java.sensorDados.SensorData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository extends JpaRepository<SensorData, Long>{

}
