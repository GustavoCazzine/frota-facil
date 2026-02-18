package br.com.cazzine.frota_facil.service;

import br.com.cazzine.frota_facil.model.Veiculo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VeiculoService {
    private List<Veiculo> frota = new ArrayList<>();

    public Veiculo cadastrarVeiculo(String modelo, String placa, Integer ano){
        Integer novoId = frota.size() + 1;
        Veiculo novoVeiculo =  new Veiculo(novoId, modelo, placa, ano);
        frota.add(novoVeiculo);
        return novoVeiculo;
    }

    public List<Veiculo> listarFrota(){
        return frota;
    }
}
