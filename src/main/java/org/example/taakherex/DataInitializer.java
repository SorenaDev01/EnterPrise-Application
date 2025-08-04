package org.example.taakherex;

import org.example.taakherex.repository.EvenementRepository;
import org.example.taakherex.repository.LocatieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private LocatieRepository locatieRepository;

    @Autowired
    private EvenementRepository evenementRepository;

    @Override
    public void run(String... args) throws Exception {
        // Alleen data toevoegen als er nog geen locaties zijn
        if (locatieRepository.count() == 0) {
            // Locaties aanmaken
            Locatie locatie1 = new Locatie();
            locatie1.setNaam("Gemeenschapscentrum Anderlecht");
            locatie1.setAdres("Gemeenschapsstraat 123, 1070 Anderlecht");
            locatie1.setCapaciteit(100);
            locatieRepository.save(locatie1);

            Locatie locatie2 = new Locatie();
            locatie2.setNaam("Sportcomplex Anderlecht");
            locatie2.setAdres("Sportlaan 45, 1070 Anderlecht");
            locatie2.setCapaciteit(200);
            locatieRepository.save(locatie2);

            Locatie locatie3 = new Locatie();
            locatie3.setNaam("Bibliotheek Anderlecht");
            locatie3.setAdres("Kennisstraat 78, 1070 Anderlecht");
            locatie3.setCapaciteit(50);
            locatieRepository.save(locatie3);

            // Evenementen aanmaken
            Evenement evenement1 = new Evenement();
            evenement1.setTitel("Gemeenschapsontbijt");
            evenement1.setTijdstip(LocalDateTime.now().plusDays(7).withHour(9).withMinute(0));
            evenement1.setOmschrijving("Een gezellig ontbijt voor alle buurtbewoners om elkaar beter te leren kennen.");
            evenement1.setOrganisatie("Anderlechtse NGO");
            evenement1.setContactEmail("info@anderlechtse-ngo.be");
            evenement1.setLocatie(locatie1);
            evenementRepository.save(evenement1);

            Evenement evenement2 = new Evenement();
            evenement2.setTitel("Voetbaltoernooi voor Jongeren");
            evenement2.setTijdstip(LocalDateTime.now().plusDays(14).withHour(14).withMinute(0));
            evenement2.setOmschrijving("Een voetbaltoernooi voor jongeren uit de buurt om sport en samenwerking te bevorderen.");
            evenement2.setOrganisatie("Sportclub Anderlecht");
            evenement2.setContactEmail("sport@anderlechtse-ngo.be");
            evenement2.setLocatie(locatie2);
            evenementRepository.save(evenement2);

            Evenement evenement3 = new Evenement();
            evenement3.setTitel("Leesclub voor Volwassenen");
            evenement3.setTijdstip(LocalDateTime.now().plusDays(21).withHour(19).withMinute(30));
            evenement3.setOmschrijving("Een maandelijkse leesclub waar volwassenen samen boeken bespreken en discussiëren.");
            evenement3.setOrganisatie("Bibliotheek Anderlecht");
            evenement3.setContactEmail("leesclub@anderlechtse-ngo.be");
            evenement3.setLocatie(locatie3);
            evenementRepository.save(evenement3);

            System.out.println("Testdata succesvol toegevoegd!");
        }
    }
} 