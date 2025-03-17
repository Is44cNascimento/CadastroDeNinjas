package java10x.CadastroDeNnjas.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CadastroDeNinjasController {


    @GetMapping("/boasvindas")
    public String boasVindas(){

        return "Essa é minha primeira mensagem nessa rota";
    }


    @GetMapping("/olamundo")
    public String OlaMundo(){

        return "Ola mundo";
    }

}
