---
layout: page
title: "Model-View-Controller"
permalink: /architectuur/software/mvc
---
# MVC
De Model-View-Controller archituur wordt gebruikt om de GUI, logica en model van elkaar te scheiden.

[Voorbeelden](https://github.com/Avans/AII-Informatica-Essentials/tree/master/Architectuur/Software/MVC/src)

## V(iew): de user interface
- toont models aan de actor
- ontvangt input (keyboard, mouse, touch) van actor
 
## C(ontroller): regelt het verloop van de app
- opstarten en afsluiten
- creërt Views en Models
- toont Views op juiste gewenste moment aan actor
- handelt de ontvangen input uit View af en vertaalt deze eventueel naar een actie in het model
- bevat threads
- regelt ondersteunende diensten zoals
	- soundplayer
	- file I/O
	-  database acces (not the queries, just the access)
	- conversies (bv van relatieve naar absolute coordinaten)
	- exception handling
	- logging

## M(odel): bevat het domein-model
- data + business logica
- domein specifieke enums


## REGELS
- een View weet niets van een model
	- NB: in jaar 1 wordt lezen uit een Model nog toegestaan
- een View mag NIET schrijven in een Model
- een Model bevat GEEN view-informatie zoals
	- schermcoördinaten / -afmetingen
	- plaatjes (png / gif) en sounds
	- imports van JavaFX libraries 
