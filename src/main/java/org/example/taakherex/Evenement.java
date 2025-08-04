package org.example.taakherex;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
public class Evenement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @NotNull(message = "Tijdstip is verplicht") ❌ verwijderen
    private LocalDateTime tijdstip;


    @NotBlank(message = "Titel is verplicht")
    private String titel;
    
    @NotBlank(message = "Omschrijving is verplicht")
    private String omschrijving;
    
    @NotBlank(message = "Organisatie is verplicht")
    private String organisatie;
    
    @NotBlank(message = "Email is verplicht")
    @Email(message = "Voer een geldig emailadres in")
    private String contactEmail;

    @ManyToOne
    @JoinColumn(name = "locatie_id")
    private Locatie locatie;

    // Getters en setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public LocalDateTime getTijdstip() { return tijdstip; }
    public void setTijdstip(LocalDateTime tijdstip) { this.tijdstip = tijdstip; }

    public String getTitel() { return titel; }
    public void setTitel(String titel) { this.titel = titel; }

    public String getOmschrijving() { return omschrijving; }
    public void setOmschrijving(String omschrijving) { this.omschrijving = omschrijving; }

    public String getOrganisatie() { return organisatie; }
    public void setOrganisatie(String organisatie) { this.organisatie = organisatie; }

    public String getContactEmail() { return contactEmail; }
    public void setContactEmail(String contactEmail) { this.contactEmail = contactEmail; }

    public Locatie getLocatie() { return locatie; }
    public void setLocatie(Locatie locatie) { this.locatie = locatie; }
} 