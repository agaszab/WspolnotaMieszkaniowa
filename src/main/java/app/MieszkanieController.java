package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class MieszkanieController {

    @Autowired
    private MieszkanieController mieszkanieRepository;

    public MieszkanieController (MieszkanieController mieszkanieRepository) {
        this.mieszkanieRepository = mieszkanieRepository;
    }

}
