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
