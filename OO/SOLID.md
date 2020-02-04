---
layout: default
---
[SOLID](https://nl.wikipedia.org/wiki/SOLID) als practisch uitgangspunt voor het schrijven van OO. Dit zijn de vijf belangrijkste OO-principes (bedacht door Robert C. Martin).

|   | Toelichting
|---|-------------------------------------------------------------------------------------------------------------------------------------------------------------------------
| S | Single responsibility<br>_een klasse zou maar één reden mogen hebben om te veranderen. 
|   | ![alt text](https://www.christinecarter.com/wp-content/uploads/sites/6/2018/05/unitask_CMYK.jpeg "single task")
| O | Open for extension, closed for modification (Open/closed)<br>_“software-entiteiten … moeten open zijn voor uitbreiding, maar gesloten voor wijziging.”_
| L | Liskov substitution<br>_“objecten in een programma zouden vervangbaar moeten zijn door instanties van hun subtypes zonder dat de juiste werking van het programma beïnvloed wordt.”_
| I | Interface segregation<br>_“veel client-specifieke interfaces zijn beter dan één algemene interface.”_
| D | Dependency Inversion<br>_"men zou afhankelijk moeten zijn van abstracties, niet van concrete implementaties"[[8]](https://nl.wikipedia.org/wiki/SOLID#cite_note-martin-design-principles-8)[Dependency injection](https://nl.wikipedia.org/wiki/Dependency_injection) is een manier om dit principe toe te passen._

#### Single responsibility

> Every class, or similar structure, in your code should have only one job to do. Everything in the class should be related to that single purpose. It does not mean that your classes should only contain one method or property. 
[Bron](http://www.blackwasp.co.uk/SRP.aspx)

[Voorbeeld Java](https://github.com/Avans/PROG-SYNC/tree/master/OO/src/SingleResponsibility)

#### Open/Closed

> "Open to extension" means that you should design your classes so that new functionality can be added as new requirements are generated. "Closed for modification" means that once you have developed a class you should never modify it, except to correct bugs.
[Bron](http://www.blackwasp.co.uk/OCP.aspx)

[Voorbeeld Java](https://github.com/Avans/PROG-SYNC/tree/master/OO/src/OpenClosed)
 
#### Liskov substitution

> "Subtypes must be behaviourally substitutable for the base types" - Barbara Liskov, 1988

> "Functions that use pointers or references to base classes must be able to use objects of derived classes without knowing it" - Robert C. Martin
[Bron](https://drive.google.com/file/d/0BwhCYaYDn8EgNzAzZjA5ZmItNjU3NS00MzQ5LTkwYjMtMDJhNDU5ZTM0MTlh/view)

> The LSP applies to inheritance hierarchies. It specifies that you should design your classes so that client dependencies can be substituted with subclasses without the client knowing about the change. All subclasses must, therefore, operate the same manner as their base classes. The specific functionality of the subclass may be different but must conform to the expected behaviour of the base class. To be a true behavioural subtype, the subclass must not only implement the base class's methods and properties but also conform to its implied behaviour. This requires compliance with several rules:
> - the parameters in subclasses must either be the same types as those in the base class or must be less restrictive
> - the preconditions of a base class must not be strengthened by a subclass and that postconditions cannot be weakened in subclasses.
> - the invariants of a base class must not be changed by a subclass
> - history constraint. Example: if the base class represents an object with a fixed size, the subclass should not permit this size to be modified.
> - a subclass should not throw exceptions that are not thrown by the base class unless they are subtypes of exceptions that may be thrown by the base class.
[Bron](http://www.blackwasp.co.uk/lsp.aspx)

> Circle-ellipse problem: a circle and ellipse are related if you are viewing them through the prism of geometrical theory. But that is not the only domain you can look at.
> Object orientated design deals with behaviour.
[Bron](https://softwareengineering.stackexchange.com/a/314671)

[Voorbeeld Java](https://github.com/Avans/PROG-SYNC/tree/master/OO/src/LiskovSubstitution)

#### Interface segregation

> Clients should not be forced to depend upon interfaces that they do not use. When we have non-cohesive interfaces, the ISP guides us to create multiple, smaller, cohesive interfaces. 
[Bron](http://www.blackwasp.co.uk/ISP.aspx)

[Voorbeeld Java](https://github.com/Avans/PROG-SYNC/tree/master/OO/src/InterfaceSegregation)

#### Dependency inversion

> The DIP makes two statements. 
> - The first is that high level modules should not depend upon low level modules. Both should depend upon abstractions. 
> - The second part of the rule is that abstractions should not depend upon details. Details should depend upon abstractions.
[Bron](http://www.blackwasp.co.uk/DIP.aspx)

[Voorbeeld Java](https://github.com/Avans/PROG-SYNC/tree/master/OO/src/DependencyInversion)

