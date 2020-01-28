# Introductie

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

[Detailuitleg SOLID](OO/SOLID.md)


### De vier concepten van OO als theoretische basis
http://codebetter.com/raymondlewallen/2005/07/19/4-major-principles-of-object-oriented-programming/

Naast SOLID worden vier concepten van OO uitgelegd. Deze worden hieronder gekoppeld aan de SOLID-principces.

#### Encapsulatie
> verschillende type objecten mogen niet direct aan de componenten of data van elkaar komen. Hiervoor zijn de methodes van een object.
> A) A language mechanism for restricting direct access to some of the object's components.[Bron](https://en.wikipedia.org/wiki/Encapsulation_(computer_programming))
> B) A language construct that facilitates the bundling of data with the methods (or other functions) operating on that data.[Bron](https://en.wikipedia.org/wiki/Encapsulation_(computer_programming))

Vooral bij Dependency Inversion speelt encapsulatie een rol. Het idee van DI is dat implementaties niet 'uitlekken' naar client-objecten. Bijvoorbeeld een client-object van een e-mail logger wil alleen een write() method en geen setReceiver(), setSubject() (of vergelijkbare properties) etc. Dit komt ook overeen met deel A van encapsulatie
Zoals hierboven (B) geschetst is het bundelen van data met gerelateerde methods het andere deel van encapsulatie. Dit hangt samen met Single Responsibility. Wanneer in een object data is opgeslagen die maar in een deel van de methods gebruikt wordt, kan sprake zijn van meerdere verantwoordelijkheden binnen één object.
Het raakvlak met LS gaat om dat object heer en meester zijn over hun data, maar dat subtypes dit wel consistent met hun superclass moeten doen.

#### Abstractie
> Objects in an OOP language provide an abstraction that hides the internal implementation details. [Stackify.com](https://stackify.com/oop-concept-abstraction/)

Ook hier is de overlap met DI duidelijk. DI is bedoeld om implementatie af te schermen en afhankelijk te zijn van de abstractie.

Abstractie heeft daarnaast ook raakvlakken met IS: bij Interface Segregation gaat het om het kiezen van de juiste abstractie die niets meer of minder bevat dan de client-objecten verwachten of nodig hebben.

#### Overerving (via super-class of interface)
Eigenlijk raakt dit punt alle SOLID-principes:
- SR: aangezien objecten één verantwoordelijk mogen hebben, moeten andere verantwoordelijkheden bijvoorbeeld middels overerving worden verplaatst.
- OC: subclasses zijn een manier om snel functionaliteit toe te voegen, zonder de andere classes aan te moeten passen
- LS: subtypes moeten te vervangen zijn met hun supertype zonder dat de werking wijzigt.
- IS: interfaces zo strak mogelijk gedefinieerd moeten worden
- DI: supertypes/interfaces bevatten abstracties van hun subtypes. Client-objecten zouden van die abstracties afhankelijk moeten zijn ipv de subtypes

#### Polymorfisme
TODO

---

## Architectuur
Een goede architectuur bereikt dat overleg met stakeholders eenvoudiger wordt en fundamentele ontwerpbeslissingen inzichtelijk worden. Daarnaast kunnen elementen uit die architectuur eenvoudig gebruikt worden in andere projecten. [Bron](https://nl.wikipedia.org/wiki/Software-architectuur)

Op verschillende vlakken kun je een architectuur opstellen: software, applicatie, systeem, data enzovoort.

### Software architectuur
Bij onze opleiding leggen wij de nadruk op de volgende architecturen:

- [MVC](Architectuur/Software/MVC)
- MVVM
- TODO...
