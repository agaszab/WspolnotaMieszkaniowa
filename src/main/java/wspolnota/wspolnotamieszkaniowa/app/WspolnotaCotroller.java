package wspolnota.wspolnotamieszkaniowa.app;

import wspolnota.wspolnotamieszkaniowa.data.Wspolnota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import wspolnota.wspolnotamieszkaniowa.repository.WspolnotaRepository;

import java.util.List;

@Controller
public class WspolnotaCotroller {

    @Autowired
    private WspolnotaRepository wspolnotaRepository;

    public WspolnotaCotroller (WspolnotaRepository wspolnotaRepository) {
        this.wspolnotaRepository = wspolnotaRepository;
    }

/*    @GetMapping ("/")
    public String main() {
        return "index_new";
    }*/

 @GetMapping("/")
    public String list(Model model) {
        List<Wspolnota> wspolnoty = wspolnotaRepository.findAll();
        model.addAttribute("wspolnoty", wspolnoty);
        return "index";
}



    @GetMapping("/dodaj")
    public String home(Model model) {
        model.addAttribute("wspolnota", new Wspolnota());

        return "form_wspolnota";
    }

    @PostMapping("/addwspolnota")
    public String addWspolnota(Wspolnota wspolnota) {
        wspolnotaRepository.save(wspolnota);
        return "redirect:/";
    }

}
