# Project Hallowed Connection
## Application design

### Opis biznesowy

##### Zadanie oprogramowania

Projektowane oprogramowanie ma na celu ułatwienie znajdywania gniazdek elektrycznych w różnego rodzaju ogólnodostępnych budynkach. Użytkownik powinien mieć możliwość odszukać swoją (lub dowolną inną) lokalizację na mapie, wybrać interesujący go budynek, następnie jego część (jeśli budynek jest na tyle duży aby go dzielić) i zobaczyć schematyczny plan danej części budynku z zaznaczonymi miejscami, w których rozmieszczone są gniazdka elektryczne.

Baza lokalizacji gniazdek wraz ze schematami powinna być powiększana przez użytkowników, bezpośrednio w tej samej aplikacji.

##### Zasoby ludzkie

Dostęp do funkcjonalności aplikacji powinien być podzielony na poziomy uprawnień, w skład których, według początkowych założeń, mają wchodzić: Użytkownik, Moderator, Administrator.

Użytkownicy to grupa złożona ze wszystkich osób, które korzystają z aplikacji. Po pobraniu i zainstalowaniu aplikacji z oficjalnego repozytorium dla odpowiedniej platformy lub ze strony internetowej twórców, mogą z niej korzystać dowolne osoby, w dowolnym miejscu na świecie. Za dostęp do aplikacji nie są pobierane opłaty.

Moderatorzy są specjalnie wyselekcjonowaną grupą użytkowników, do których twórcy aplikacji mają dostatecznie dużo zaufania, aby powierzyć im moderację treści zamieszczanych przez Użytkowników w systemie aplikacji.

Administratorzy to twórcy aplikacji oraz nieliczne osoby przez nich wyznaczone. Administratorzy mają niemal nieograniczoną kontrolę nad pracą systemu i treściami zamieszczanymi przez Użytkowników.

Podstawowe funkcjonalności aplikacji - przeglądanie mapy oraz schematów lokalizacji gniazdek, dodawanie nowych informacji o lokalizacji gniazdek, modyfikacja istniejących danych, dodawanie opinii nt. istniejących znaczników - mają być dostępne dla wszystkich Użytkowników, z zastrzeżeniem ochrony przed wandalizmem, głównie za pomocą moderacji społecznościowej.

Tylko Moderatorzy i Administratorzy mają mieć możliwość wprowadzania zmian w informacjach przechowywanych w systemie z pominięciem moderacji, a także arbitralnej akceptacji lub odrzucania zmian proponowanych przez Użytkowników.

Tylko Administratorzy mają mieć wpływ na techniczną stronę funkcjonowania systemu (tzw. back end), dostęp Użytkowników do aplikacji (np. blokowanie osób o niepożądanym wpływie na dane) i inne aspekty 'zaplecza' systemu.

##### Przepisy

Uzupełnianie bazy o aktualne informacje ma być zadaniem użytkowników, podobnie jak w przypadku edycji artykułów wiki.

### Architektura

Pierwszą i podstawową planowaną postacią oprogramowania jest aplikacja mobilna na system operacyjny Android w wersji 4.0 lub nowszej. Projekt zakłada możliwość dobudowania aplikacji przeglądarkowej, na desktopowe systemy operacyjne oraz inne urządzenia mobilne. System dostarczający projektowaną funkcjonalność powinien zostać zaimplementowany w architekturze klient-serwer, gdzie serwer jest autorytatywnym punktem dostępu do danych.

Pojedynczy schemat rozmieszczenia gniazdek reprezentowany jest przez nazwę części budynku, którą przedstawia, piętro, które opisuje, przesunięcie lokalizacji na mapie względem głównego węzła budynku, unikalny identyfikator reprezentacji graficznej schematu oraz autora - użytkownika, który dodał schemat do systemu.

Schematy rozmieszczenia gniazdek grupowane są w budynki, które z kolei opisane są przez nazwę, lokalizację geograficzną i opcjonalnie adres.

Niektóre budynki są zbyt małe (lub ich ogólnodostępna część jest zbyt mała), aby dzielić je na części i przechowywać osobne schematy. W takim wypadku do budynku przypisany jest tylko jeden schemat o pustej nazwie, a aplikacja od razu wyświetla ten schemat bezpośrednio po wybraniu budynku.

##### Wymagania funkcjonalne

* Użytkownik może zobaczyć mapę swojego otoczenia lub dowolnego miejsca na świecie, wraz z umieszczonymi na niej znacznikami miejsc z dostępem do gniazdek elektrycznych
* Użytkownik może wyszukać dowolne miejsce na świecie i zobaczyć, czy są tam opisane lokalizacje gniazdek
* Aplikacja umożliwia Użytkownikowi przegląd informacji na temat umieszczonego na mapie znacznika z lokalizacją gniazdek, tj. np. nazwy miejsca (jeśli adekwatne), krótkiego opisu, autorów (osób, które te informacje wprowadziły) oraz schematycznego szkicu rozmiesczenia gniazdek elektrycznych w opisywanym miejscu
* Użytkownik może dodawać nowe informacje o rozmieszczeniu gniazdek oraz edytować istniejące, bezpośrednio w aplikacji
* Aplikacja udostępnia proste narzędzia rysowania w celu zaznaczenia przybliżonych lokalizacji gniazdek eletkrycznych w budynkach i miejscach publicznych
* Użytkownik powinien mieć możliwość pozytywnej lub negatywnej oceny dodanego już znacznika z lokalizacją gniazdek oraz dodania komentarza opisującego ewentualne problemy
* Moderator ma dodatkowo możliwość edytowania informacji o lokalizacji gniazdek z pominięciem konieczności akceptacji
* Moderator może również arbitralnie akceptować lub odrzucać zmiany wprowadzane przez Użytkowników
* Administrator może dodatkowo zarządzać dostępem poszczególnych Użytkowników do systemu

##### Wymagania niefunkcjonalne

* Aplikacja powinien pracować na mobilnym systemie operacyjnym (Android), z nowoczesnym graficznym interfejsem użytkownika
* Aplikacja powinna być rozbudowywalna; docelowo powinna mieć możliwość rozszerzenia o wersję webową

##### Zabezpieczenia

Dane udostępniane przez aplikację powinny być zabezpieczone odpowiednio do swojej istotności w systemie. Dane dostępne dla każdego użytkownika, takie, jak na przykład miejsca z lokalizacją gniazdek, nie wymagają specjalnego traktowania, jednak dane przeznaczone tylko dla administratorów wymagają rygorystycznej kontroli dostępu. Niezależnie od dostępu użytkowników do danych, podczas komunikacji użytkownika (za pośrednictwem aplikacji klienckiej) z serwerem, żadne osoby postronne nie powinny mieć możliwości odczytania ani modyfikacji danych przesyłanych ani odbieranych przez użytkownika. Z tego powodu konieczna jest implementacja szyfrowania kanału wymiany informacji.
