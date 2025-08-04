# Anderlechtse NGO - Evenementen Webapp

## Project Beschrijving

Dit is een prototype webapp voor een Anderlechtse NGO die zich inzet voor gemeenschapsbouwen en hulp aan mensen die het minder breed hebben. De webapp bestaat uit verschillende pagina's voor het beheren van evenementen.

## Functionaliteiten

- **Index**: Overzicht van de 10 laatste evenementen met titel en organisatie
- **New**: Formulier voor het toevoegen van nieuwe evenementen met validatie
- **Details**: Gedetailleerde weergave van een specifiek evenement
- **About**: Informatie over de NGO

## Technische Stack

- **Backend**: Java Spring Boot 2.x
- **Database**: H2 in-memory database
- **Frontend**: Thymeleaf templates
- **CSS Framework**: Tailwind CSS (via CDN)
- **Build Tool**: Maven

## Installatie en Deployment

### Vereisten
- Java 11 of hoger
- Maven 3.6 of hoger

### Stappen om de applicatie te starten:

1. **Clone het project**
   ```bash
   git clone <repository-url>
   cd <project-directory>
   ```

2. **Start de applicatie**
   ```bash
   # Via Maven wrapper
   ./mvnw spring-boot:run
   
   # Of via Maven (als je Maven geïnstalleerd hebt)
   mvn spring-boot:run
   ```

3. **Open de applicatie**
   - Ga naar: http://localhost:8080
   - H2 Database Console: http://localhost:8080/h2-console
     - JDBC URL: `jdbc:h2:mem:testdb`
     - Username: `sa`
     - Password: `password`

### Build voor productie
```bash
mvn clean package
java -jar target/taak-herex-0.0.1-SNAPSHOT.jar
```

## Project Structuur

```
src/
├── main/
│   ├── java/org/example/taakherex/
│   │   ├── Application.java              # Spring Boot main class
│   │   ├── Evenement.java               # Evenement entity
│   │   ├── Locatie.java                 # Locatie entity
│   │   ├── DataInitializer.java         # Testdata initializer
│   │   ├── controller/
│   │   │   └── EvenementController.java # Web controllers
│   │   ├── repository/
│   │   │   ├── EvenementRepository.java # Data access layer
│   │   │   └── LocatieRepository.java   # Data access layer
│   │   └── service/
│   │       ├── EvenementService.java    # Business logic
│   │       └── LocatieService.java      # Business logic
│   └── resources/
│       ├── application.properties       # Configuratie
│       └── templates/                   # Thymeleaf templates
│           ├── index.html              # Hoofdpagina
│           ├── new.html                # Nieuw evenement formulier
│           ├── details.html            # Evenement details
│           └── about.html              # Over ons pagina
```

## Gebruikte Bronnen en Documentatie

### Spring Boot
- [Spring Boot Reference Documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- [Spring Boot Getting Started Guide](https://spring.io/guides/gs/spring-boot/)

### Thymeleaf
- [Thymeleaf Documentation](https://www.thymeleaf.org/documentation.html)
- [Thymeleaf Tutorial](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html)

### Tailwind CSS
- [Tailwind CSS Documentation](https://tailwindcss.com/docs)
- [Tailwind CSS CDN](https://tailwindcss.com/docs/installation/play-cdn)

### JPA/Hibernate
- [Spring Data JPA Reference](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)
- [Hibernate Documentation](https://hibernate.org/orm/documentation/)

### H2 Database
- [H2 Database Documentation](http://www.h2database.com/html/main.html)

## Chat History AI Tools

Dit project is ontwikkeld met behulp van AI-assistentie. De volledige chat history en gebruikte prompts zijn beschikbaar in de project documentatie.

## Validatie

De applicatie bevat validatie voor:
- Verplichte velden (titel, omschrijving, organisatie, tijdstip)
- Geldig emailadres voor contactpersoon
- Locatie selectie

## Testdata

Bij het eerste opstarten wordt automatisch testdata toegevoegd:
- 3 locaties (Gemeenschapscentrum, Sportcomplex, Bibliotheek)
- 3 evenementen (Gemeenschapsontbijt, Voetbaltoernooi, Leesclub)

## Licentie

Dit project is ontwikkeld als onderdeel van een schoolopdracht. 