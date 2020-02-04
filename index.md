---
layout: default
---
Regelmatig is er discussie over de manier waarop concepten, theorieën of paradigma's aan studenten uitgelegd moeten worden. Het doel van deze repository is om overeenstemming te krijgen tussen docenten over de definitie die wij onze studenten willen aanleren. Het resultaat zou moeten zijn dat verschillende docenten in hun theorie, tijdens de lessen en beoordelingen consistenter zijn. 

!! Uiteindelijk wordt deze repository óók aan studenten beschikbaar gesteld.

---

## Concrete handvatten voor docenten (TL;DR)

Suggesties zijn welkom! Het idee is om hier de concrete handvatten op te sommen als conclusie op basis van volgende hoofdstukken.

### Jaar 1
- Elke klasse heeft één verantwoordelijkheid (ABSTRACTIE/OVERERVING)
- Klassen modelleren naar gedrag, niet naar data (ENCAPSULATIE)
```Java
class Main {
    static int main() {
        // Wrong
        Car.setSpeed(30);
        
        // Right
        Car.accelerate();
    }
}
```
- Polymorfisme en delegatie worden gebruikt (POLYMORFISME)

### Jaar 2
- Type switching is verboden (oa Liskov Substution)
  - Polymorfisme en delegatie worden gebruikt waar mogelijk

### Jaar 3
- TODO

---

## Object Oriented Programming

[SOLID](https://nl.wikipedia.org/wiki/SOLID) als practisch uitgangspunt voor het schrijven van OO. Dit zijn de vijf belangrijkste OO-principes (bedacht door Robert C. Martin).

|   | Toelichting
|---|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
| S | Single responsibility (SR)<br>_een klasse zou maar één reden mogen hebben om te veranderen._
| O | Open for extension, closed for modification (OC)<br>_“software-entiteiten … moeten open zijn voor uitbreiding, maar gesloten voor wijziging.”_
| L | Liskov substitution (LS)<br>_“objecten in een programma zouden vervangbaar moeten zijn door instanties van hun subtypes zonder dat de juiste werking van het programma beïnvloed wordt.”_
| I | Interface segregation (IS)<br>_“veel client-specifieke interfaces zijn beter dan één algemene interface.”_
| D | Dependency Inversion (DI)<br>_"men zou afhankelijk moeten zijn van abstracties, niet van concrete implementaties"[[8]](https://nl.wikipedia.org/wiki/SOLID#cite_note-martin-design-principles-8)[Dependency injection](https://nl.wikipedia.org/wiki/Dependency_injection) is een manier om dit principe toe te passen._

[Detailuitleg SOLID](OO/SOLID.html)

### De vier concepten van OO als theoretische basis
http://codebetter.com/raymondlewallen/2005/07/19/4-major-principles-of-object-oriented-programming/

Naast SOLID worden [vier concepten](OO/Concepten.html) van OO uitgelegd. Deze worden hieronder gekoppeld aan de SOLID-principces.

### Regels
- geen instance variabelen public maken
- geen getters gebruiken om variabelen naar hoger level te halen (ingewanden opvragen)
    - leidt tot nare A.get().get().get() constructies, die zijn niet helder
- scheding van verantwoordelijkheden à kleine klassen
- gebruik polymorfisme waar mogelijk

---

## Architectuur
Een goede architectuur bereikt dat overleg met stakeholders eenvoudiger wordt en fundamentele ontwerpbeslissingen inzichtelijk worden. Daarnaast kunnen elementen uit die architectuur eenvoudig gebruikt worden in andere projecten. [Bron](https://nl.wikipedia.org/wiki/Software-architectuur)

Op verschillende vlakken kun je een architectuur opstellen: software, applicatie, systeem, data enzovoort.

### Software architectuur
Bij onze opleiding leggen wij de nadruk op de volgende architecturen:

- [MVC](Architectuur/Software/MVC)
- MVVM
- TODO...
