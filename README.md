# OOP-Crossroads
# Projekt powstał jako praca domowa do przedmiotu Programowanie Obiektowe i prezentuje przykładowe klasy możliwe do użycia w projekcie, wraz z rozpoczęciem implemetowania do niego REST API i początkowo tworzoną logiką aplikacji.

Czas pracy: ok. 6 h
Czas prezentacji: ok. 0,5 h

Użyta technologia: Java, Spring Boot

Poniższy projekt jest przygotowanie programu obsługującego skrzyżowanie, zaimplementowano go przy użyciu REST API
zbudowane API w architekturze REST zawiera obiekty, które implementują jedne z 3 interfejsów: Sign, Vehicle, Road
komunikacja odby się przez 6 zamapaowanych punkty końcowe: 
/sign [GET], /sign [POST], /vehicle [GET], /vehicle [POST], /road [GET], /road [POST]

po uruchomieniu programu aplikacja startuje na procie 8080 (localhost:8080)
folder zawiera plik 'rest-api.drawio' (oraz 'rest-api.png', jeżeli nie można otworzyć tego formatu), który był używany do reprezentacji 3 warstwowej architektury REST API
