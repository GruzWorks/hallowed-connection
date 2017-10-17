

### Opis biznesowy

##### Zadanie oprogramowania

Projektowane oprogramowanie ma na celu ułatwienie znajdywania gniazdek elektrycznych w różnego rodzaju ogólnodostępnych budynkach. Użytkownik powinien mieć możliwość odszukać swoją (lub dowolną inną) lokalizację na mapie, wybrać interesujący go budynek, następnie jego część (jeśli budynek jest na tyle duży aby go dzielić) i zobaczyć schematyczny plan danej części budynku z zaznaczonymi miejscami, w których rozmieszczone są gniazdka elektryczne.

Baza lokalizacji gniazdek wraz ze schematami powinna być powiększana przez użytkowników, bezpośrednio w tej samej aplikacji.

##### Architektura

Pierwszą i podstawową planowaną postacią oprogramowania jest aplikacja mobilna na system operacyjny Android w wersji 4.0 lub nowszej. Projekt zakłada możliwość dobudowania aplikacji przeglądarkowej, na desktopowe systemy operacyjne oraz inne urządzenia mobilne.

Pojedynczy schemat rozmieszczenia gniazdek reprezentowany jest przez nazwę części budynku, którą przedstawia, piętro, które opisuje, przesunięcie lokalizacji na mapie względem głównego węzła budynku, unikalny identyfikator reprezentacji graficznej schematu oraz autora - użytkownika, który dodał schemat do systemu.

Schematy rozmieszczenia gniazdek grupowane są w budynki, które z kolei opisane są przez nazwę, lokalizację geograficzną i opcjonalnie adres.

Niektóre budynki są zbyt małe (lub ich ogólnodostępna część jest zbyt mała), aby dzielić je na części i przechowywać osobne schematy. W takim wypadku do budynku przypisany jest tylko jeden schemat o pustej nazwie, a aplikacja od razu wyświetla ten schemat bezpośrednio po wybraniu budynku.

##### Przepisy

Osoby biorące udział w dodawaniu nowych lokalizacji gniazdek elektrycznych nie będą pociągane do odpowiedzialności prawnej
za nieprawdziwe lub niedokładne informacje.

##### Wymagania funkcjonalne

- Użytkownik musi mieć dostęp do prostych narzędzi rysowania, w celu zaznaczenia przybliżonej lokalizacji gniazdka eletkrycznego.
- Użytkownik powinien być w stanie sprawdzić dostępne gniazdka elektryczne w pobliżu swojej lokalizacji.
- Użytkownik powinien mieć możliwość oceny dodanego już gniazdka oraz dodania komentarza opisującego problem w przypadku
wystawienia negatywnej oceny.
- Użytkownik powinien być w stanie łatwo edytować informacje gniazdka w przypadku zmiany położenia lub też zmiany dostępności
gniazdka.

##### Wymagania niefunkcjonalne 

-System powinien pracować na systemie android z nowoczesnym graficznym interfejsem użytkownika.
-System powinien się rozwijać, docelowo możliwość rozbudowny na aplikację webową.

