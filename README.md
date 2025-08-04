# Anderlechtse NGO - Evenementen Webapp

## Beschrijving
Een eenvoudige webapp voor een Anderlechtse NGO om evenementen te beheren. Je kan evenementen bekijken, toevoegen en de details bekijken.

## Functionaliteiten
- Overzicht van de 10 laatste evenementen  
- Formulier voor nieuwe evenementen met validatie  
- Detailpagina per evenement  
- Over ons pagina  

## Technologieën
- Java Spring Boot (Backend)  
- H2 in-memory database  
- Thymeleaf templates (Frontend)  
- Tailwind CSS via CDN  
- Maven als build tool  

## Installatie & Starten
1. Clone het project:  
   ```bash
   git clone <repository-url>
   cd <project-directory>
Start de app:

bash
Copier
Modifier
./mvnw spring-boot:run
# of als Maven geïnstalleerd is:
mvn spring-boot:run
Open in browser: http://localhost:8080

Projectstructuur
src/main/java — Java code (controllers, services, entities)

src/main/resources/templates — Thymeleaf pagina’s

application.properties — Configuratie

Validatie & Testdata
Validatie op verplichte velden en e-mailadres

Testdata (3 locaties + 3 evenementen) wordt automatisch geladen bij start

Licentie
Dit project is onderdeel van een schoolopdracht.
