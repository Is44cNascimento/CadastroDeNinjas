package java10x.CadastroDeNnjas.missoes.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissoesController {



    @GetMapping("/Missoes")
    public String Missoes(){
        return "Lista de missoes";
    }

}
