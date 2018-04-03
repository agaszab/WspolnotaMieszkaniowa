package wspolnota.wspolnotamieszkaniowa.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class MieszkanieController {

    @Autowired
    private MieszkanieController mieszkanieRepository;
    private MieszkaniecController mieszkaniecRepository;

    public MieszkanieController (MieszkanieController mieszkanieRepository, MieszkaniecController mieszkaniecRepository) {
        this.mieszkanieRepository = mieszkanieRepository;
        this.mieszkaniecRepository = mieszkaniecRepository;
    }



}
