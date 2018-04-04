package wspolnota.wspolnotamieszkaniowa.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class MieszkaniecController {

    @Autowired
    private MieszkaniecController mieszkaniecRepository;

    public MieszkaniecController (MieszkaniecController mieszkaniecRepository) {
        this.mieszkaniecRepository = mieszkaniecRepository;
    }

}
