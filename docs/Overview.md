

### Opis biznesowy

##### Zadanie oprogramowania

Projektowane oprogramowanie ma na celu ułatwienie znajdywania gniazdek elektrycznych w różnego rodzaju ogólnodostępnych budynkach. Użytkownik powinien mieć możliwość odszukać swoją (lub dowolną inną) lokalizację na mapie, wybrać interesujący go budynek, następnie jego część (jeśli budynek jest na tyle duży aby go dzielić) i zobaczyć schematyczny plan danej części budynku z zaznaczonymi miejscami, w których rozmieszczone są gniazdka elektryczne.

Baza lokalizacji gniazdek wraz ze schematami powinna być powiększana przez użytkowników, bezpośrednio w tej samej aplikacji.

##### Zasoby ludzkie

Aplikacja ma być dostępna do powszechnego użytku przez dowolne osoby, w dowolnym miejscu na świecie. Zwykli użytkownicy nie mogą mieć dostępu do administracyjnych funkcjonalności aplikacji - te mają być zarezerwowane dla twórców i osób specjalnie przez nich wyznaczonych.

Na dalszym etapie rozwoju aplikacji przewidywana jest konieczność zastosowania pewnego rodzaju systemu moderacji danych wprowadzanych przez użytkowników, co prawdopodobnie zaowocuje utworzeniem dodatkowych poziomów dostępu.

##### Architektura

Pierwszą i podstawową planowaną postacią oprogramowania jest aplikacja mobilna na system operacyjny Android w wersji 4.0 lub nowszej. Projekt zakłada możliwość dobudowania aplikacji przeglądarkowej, na desktopowe systemy operacyjne oraz inne urządzenia mobilne.

Pojedynczy schemat rozmieszczenia gniazdek reprezentowany jest przez nazwę części budynku, którą przedstawia, piętro, które opisuje, przesunięcie lokalizacji na mapie względem głównego węzła budynku, unikalny identyfikator reprezentacji graficznej schematu oraz autora - użytkownika, który dodał schemat do systemu.

Schematy rozmieszczenia gniazdek grupowane są w budynki, które z kolei opisane są przez nazwę, lokalizację geograficzną i opcjonalnie adres.

Niektóre budynki są zbyt małe (lub ich ogólnodostępna część jest zbyt mała), aby dzielić je na części i przechowywać osobne schematy. W takim wypadku do budynku przypisany jest tylko jeden schemat o pustej nazwie, a aplikacja od razu wyświetla ten schemat bezpośrednio po wybraniu budynku.

##### Przepisy

Uzupełnianie bazy o aktualne informacje ma być zadaniem użytkowników, podobnie jak wiki.

##### Wymagania funkcjonalne

* Użytkownik może zobaczyć mapę swojego otoczenia lub dowolnego miejsca na świecie, wraz z umieszczonymi na niej znacznikami miejsc z dostępem do gniazdek elektrycznych
* Użytkownik może wyszukać dowolne miejsce na świecie i zobaczyć, czy są tam opisane lokalizacje gniazdek
* Aplikacja umożliwia użytkownikowi przegląd informacji na temat umieszczonego na mapie znacznika z lokalizacją gniazdek, tj. np. nazwy miejsca (jeśli adekwatne), krótkiego opisu, autorów (osób, które te informacje wprowadziły) oraz schematycznego szkicu rozmiesczenia gniazdek elektrycznych w opisywanym miejscu
* Użytkownik może dodawać nowe informacje o rozmieszczeniu gniazdek oraz edytować istniejące, bezpośrednio w aplikacji
* Aplikacja udostępnia proste narzędzia rysowania w celu zaznaczenia przybliżonych lokalizacji gniazdek eletkrycznych w budynkach i miejscach publicznych
* Użytkownik powinien mieć możliwość pozytywnej lub negatywnej oceny dodanego już znacznika z lokalizacją gniazdek oraz dodania komentarza opisującego ewentualne problemy

##### Wymagania niefunkcjonalne

* Aplikacja powinien pracować na systemie mobilnym (android), z nowoczesnym graficznym interfejsem użytkownika.
* Aplikacja powinna być rozbudowywalna, docelowo możliwość rozszerzenia o wersję webową.
