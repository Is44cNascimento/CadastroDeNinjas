package java10x.CadastroDeNnjas.missoes.controller;


import java10x.CadastroDeNnjas.missoes.model.MissoesModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissoesController extends MissoesModel {



    @GetMapping("/missoes")
    public String Missoes(){
        return getNomeMissao();
    }

}
