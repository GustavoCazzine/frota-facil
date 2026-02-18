package br.com.cazzine.frota_facil.model;

public class Veiculo {
    private Integer id;
    private String modelo;
    private String placa;
    private Integer ano;


    public Veiculo(){};

    public Veiculo(Integer id, String modelo, String placa, Integer ano) {
        this.id = id;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}
