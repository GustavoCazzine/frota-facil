package br.com.cazzine.frota_facil.controller;

import br.com.cazzine.frota_facil.model.Veiculo;
import br.com.cazzine.frota_facil.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {
    @Autowired
    private VeiculoService service;

    @GetMapping
    public List<Veiculo> listarFrota(){
        return service.listarFrota();
    }

    @PostMapping
    public Veiculo cadastrarVeiculo(@RequestBody Veiculo dados){
        return service.cadastrarVeiculo(dados.getModelo(), dados.getPlaca(), dados.getAno());
    }
}
