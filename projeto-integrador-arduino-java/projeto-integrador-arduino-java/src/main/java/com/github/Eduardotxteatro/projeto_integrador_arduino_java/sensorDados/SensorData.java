package com.github.Eduardotxteatro.projeto_integrador_arduino_java.sensorDados;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class SensorData {

    @Id
    @GeneratedValue

    private long id;
    private float temperatura;
    private float umidade;
    private Integer luminosidade;
    private LocalDateTime timestamp = LocalDateTime.now();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public float getUmidade() {
        return umidade;
    }

    public void setUmidade(float umidade) {
        this.umidade = umidade;
    }

    public Integer getLuminosidade() {
        return luminosidade;
    }

    public void setLuminosidade(Integer luminosidade) {
        this.luminosidade = luminosidade;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
