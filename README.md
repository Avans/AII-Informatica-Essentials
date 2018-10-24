# PROG-SYNC

Inhoud
1. [Probleemanalyse](#Probleemanalyse)
2. [Code](#Code)
3. [Architectuur](#Architectuur)

## Probleemanalyse

Probleem: verschillende interpretaties/uitleg van OO/MVC/MVVM?? door docenten
<br>Doel: afstemming onder programmeerdocenten over gehanteerde vorm van OO/MVC

## Code

### Object Oriented Programming

[SOLID](https://nl.wikipedia.org/wiki/SOLID) als practisch uitgangspunt voor het schrijven van OO. Dit zijn de vijf belangrijkste OO-principes (bedacht door Robert C. Martin).

|   | Toelichting
|---|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
| S | Single responsibility<br>_een klasse zou maar één reden mogen hebben om te veranderen._
| O | Open for extension, closed for modification (Open/closed)<br>_“software-entiteiten … moeten open zijn voor uitbreiding, maar gesloten voor wijziging.”_
| L | Liskov substitution<br>_“objecten in een programma zouden vervangbaar moeten zijn door instanties van hun subtypes zonder dat de juiste werking van het programma beïnvloed wordt.”_
| I | Interface segregation<br>_“veel client-specifieke interfaces zijn beter dan één algemene interface.”_
| D | Dependency Inversion<br>_"men zou afhankelijk moeten zijn van abstracties, niet van concrete implementaties"[[8]](https://nl.wikipedia.org/wiki/SOLID#cite_note-martin-design-principles-8)[Dependency injection](https://nl.wikipedia.org/wiki/Dependency_injection) is een manier om dit principe toe te passen._

[https://github.com/Avans/PROG-SYNC/blob/master/OO/SOLID.md](https://github.com/Avans/PROG-SYNC)


#### De vier principes van OO als theoretische basis
http://codebetter.com/raymondlewallen/2005/07/19/4-major-principles-of-object-oriented-programming/

### Encapsulatie

verschillende type objecten mogen niet direct aan de componenten of data van elkaar komen. Hiervoor zijn de methodes van een object.
- A language mechanism for restricting direct access to some of the object's components.[Bron](https://en.wikipedia.org/wiki/Encapsulation_(computer_programming))
- A language construct that facilitates the bundling of data with the methods (or other functions) operating on that data.[Bron](https://en.wikipedia.org/wiki/Encapsulation_(computer_programming))

### Abstractie
TODO

### Overerving (via super-class of interface)
TODO

### Polymorfisme
TODO

#### Concrete handvatten voor docenten

Suggesties zijn welkom!

##### Jaar 1
- Elke klasse heeft één verantwoordelijkheid (ABSTRACTIE/OVERERVING)
- Klassen modelleren naar gedrag, niet naar data (ENCAPSULATIE)
```Java
// Wrong
Car.setSpeed(30);

// Right
Car.accelerate()
```
- Polymorfisme en delegatie worden gebruikt (POLYMORFISME)

##### Jaar 2
- Type switching is verboden (oa Liskov Substution)
  - Polymorfisme en delegatie worden gebruikt waar mogelijk

##### Jaar 3
- TODO

## Architectuur

### Model-View-Controller
TODO

### Hexagonal Architecture | Onion Architecture | DDD etc.
TODO
