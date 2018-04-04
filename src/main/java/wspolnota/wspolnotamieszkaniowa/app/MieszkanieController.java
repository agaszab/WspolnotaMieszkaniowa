package wspolnota.wspolnotamieszkaniowa.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import wspolnota.wspolnotamieszkaniowa.data.Mieszkanie;
import wspolnota.wspolnotamieszkaniowa.data.Mieszkaniec;


@Controller
public class MieszkanieController {

    @Autowired
    private MieszkanieController mieszkanieRepository;
    private Mieszkaniec mieszkaniec;

    public MieszkanieController (MieszkanieController mieszkanieRepository, Mieszkanie mieszkanie) {
        this.mieszkanieRepository = mieszkanieRepository;
        this.mieszkaniec = mieszkaniec;
    }



}
