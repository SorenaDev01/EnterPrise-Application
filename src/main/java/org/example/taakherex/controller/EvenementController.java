package org.example.taakherex.controller;

import org.example.taakherex.Evenement;
import org.example.taakherex.Locatie;
import org.example.taakherex.service.EvenementService;
import org.example.taakherex.service.LocatieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.time.LocalDateTime;
import java.util.List;

@Controller
public class EvenementController {

    @Autowired
    private EvenementService evenementService;

    @Autowired
    private LocatieService locatieService;

    // Index pagina - toon laatste 10 evenementen
    @GetMapping("/")
    public String index(Model model) {
        List<Evenement> evenementen = evenementService.getLaatste10Evenementen();
        model.addAttribute("evenementen", evenementen);
        return "index";
    }

    // New pagina - formulier voor nieuw evenement
    @GetMapping("/new")
    public String newEvenement(Model model) {
        model.addAttribute("evenement", new Evenement());
        List<Locatie> locaties = locatieService.getAllLocaties();
        model.addAttribute("locaties", locaties);
        return "new";
    }

    // POST voor nieuw evenement
    @PostMapping("/new")
    public String createEvenement(@Valid @ModelAttribute Evenement evenement, 
                                  BindingResult result, 
                                  @RequestParam("locatieId") Long locatieId,
                                  Model model) {
        if (result.hasErrors()) {
            List<Locatie> locaties = locatieService.getAllLocaties();
            model.addAttribute("locaties", locaties);
            return "new";
        }

        // Locatie ophalen en instellen
        locatieService.getLocatieById(locatieId).ifPresent(evenement::setLocatie);
        
        // Tijdstip instellen als het niet is ingevuld
        if (evenement.getTijdstip() == null) {
            evenement.setTijdstip(LocalDateTime.now());
        }

        evenementService.saveEvenement(evenement);
        return "redirect:/";
    }

    // Details pagina - toon details van een evenement
    @GetMapping("/details/{id}")
    public String details(@PathVariable Long id, Model model) {
        return evenementService.getEvenementById(id)
                .map(evenement -> {
                    model.addAttribute("evenement", evenement);
                    return "details";
                })
                .orElse("redirect:/");
    }

    // About pagina
    @GetMapping("/about")
    public String about() {
        return "about";
    }
} 