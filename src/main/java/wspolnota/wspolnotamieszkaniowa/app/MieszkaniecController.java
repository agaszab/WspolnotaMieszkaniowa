package wspolnota.wspolnotamieszkaniowa.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class MieszkaniecController {

    @Autowired
    private MieszkanieController mieszkanieRepository;

    public MieszkaniecController (MieszkanieController mieszkanieRepository) {
        this.mieszkanieRepository = mieszkanieRepository;
    }

}
