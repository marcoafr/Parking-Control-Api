package com.api.parkingcontrol.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_PARKING_SPOT") //Nome da tabela no BD
public class ParkingSpotModel implements Serializable {
    private static final long serialVersionUID = 1L;

    // Por ser uma entidade, essa classe precisa de um identificador, chamado de id, do tipo UUID (únicos, universais
    // que podem ser gerados em qualquer lugar), são mais aconselháveis;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //o id vai ser gerado de forma automática!
    private UUID id;

    // Número da Vaga (String, pois pode haver letras na vaga), não pode ser nulo, será único e tamanho limitado a 10
    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber;

    // Placa (não pode ser nulo, será único e tamanho limitado a 7)
    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar;

    // Marca do Carro (não pode ser nulo e tamanho limitado a 70)
    @Column(nullable = false, length = 70)
    private String brandCar;

    // Modelo do Carro (não pode ser nulo e tamanho limitado a 70)
    @Column(nullable = false, length = 70)
    private String modelCar;

    // Cor do Carro (não pode ser nulo e tamanho limitado a 70)
    @Column(nullable = false, length = 70)
    private String colorCar;

    // Data de Registro (não pode ser nulo e do tipo LocalDateTime)
    @Column(nullable = false)
    private LocalDateTime registrationDate;

    // Nome do Responsável (não pode ser nulo e tamanho limitado a 130)
    @Column(nullable = false, length = 130)
    private String responsibleName;

    // Número do Apartamento (não pode ser nulo e tamanho limitado a 30)
    @Column(nullable = false, length = 30)
    private String apartment;

    // Número do Bloco (não pode ser nulo e tamanho limitado a 30)
    @Column(nullable = false, length = 30)
    private String block;

    // Gerar Getters e Setters
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}
