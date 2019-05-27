package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.services.VetService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class VetController {

    private final VetService vetService;

    @RequestMapping({"/vets", "/vets/index.html", "/vets/index"})
    public String lisOfVets(Model model) {
        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }
}
