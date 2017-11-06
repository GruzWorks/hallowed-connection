# Project Hallowed Connection
## Database design

### Analiza wymagań

#### Cel projektu
Projektowane oprogramowanie ma na celu ułatwienie znajdywania gniazdek elektrycznych w różnego rodzaju ogólnodostępnych budynkach. Użytkownik powinien mieć możliwość odszukać swoją (lub dowolną inną) lokalizację na mapie, wybrać interesujący go budynek, następnie jego część (jeśli budynek jest na tyle duży aby go dzielić) i zobaczyć schematyczny plan danej części budynku z zaznaczonymi miejscami, w których rozmieszczone są gniazdka elektryczne.

Baza lokalizacji gniazdek wraz ze schematami powinna być powiększana przez użytkowników, bezpośrednio w tej samej aplikacji.

#### Zadania bazy danych

Baza danych dla projektowanej aplikacji musi wydajnie obsługiwać dane geoprzestrzenne, aby możliwe było szybkie przeszukiwanie obszarów mapy w celu znalezienia pasujących do nich encji.

Projekt aplikacji zakłada również przechowywanie graficznych szkiców lokalizacji gniazdek w budynkach, w związku z czym rozwiązanie bazodanowe musi umożliwiać szybki dostęp do danych graficznych.

#### Wymagania funkcjonalne

* Użytkownik może zobaczyć mapę swojego otoczenia lub dowolnego miejsca na świecie, wraz z umieszczonymi na niej znacznikami miejsc z dostępem do gniazdek elektrycznych
* Użytkownik może wyszukać dowolne miejsce na świecie i zobaczyć, czy są tam opisane lokalizacje gniazdek
* Aplikacja umożliwia Użytkownikowi przegląd informacji na temat umieszczonego na mapie znacznika z lokalizacją gniazdek, tj. np. nazwy miejsca (jeśli adekwatne), krótkiego opisu, autorów (osób, które te informacje wprowadziły) oraz schematycznego szkicu rozmiesczenia gniazdek elektrycznych w opisywanym miejscu
* Użytkownik może dodawać nowe informacje o rozmieszczeniu gniazdek oraz edytować istniejące, bezpośrednio w aplikacji
* Aplikacja udostępnia proste narzędzia rysowania w celu zaznaczenia przybliżonych lokalizacji gniazdek eletkrycznych w budynkach i miejscach publicznych
* Użytkownik powinien mieć możliwość pozytywnej lub negatywnej oceny dodanego już znacznika z lokalizacją gniazdek oraz dodania komentarza opisującego ewentualne problemy
* Moderator ma dodatkowo możliwość edytowania informacji o lokalizacji gniazdek z pominięciem konieczności akceptacji
* Moderator może również arbitralnie akceptować lub odrzucać zmiany wprowadzane przez Użytkowników
* Administrator może dodatkowo zarządzać dostępem poszczególnych Użytkowników do systemu

#### Wymagania niefunkcjonalne

* Aplikacja powinien pracować na systemie mobilnym (android), z nowoczesnym graficznym interfejsem użytkownika.
* Aplikacja powinna być rozbudowywalna, docelowo możliwość rozszerzenia o wersję webową.

#### Środowisko produkcyjne

Z przechowywanych danych ma docelowo korzystać aplikacja mobilna i aplikacja webowa. Należy też przewidzieć możliwość rozszerzenia systemu o aplikacje działające w innych środowiskach (np. innych mobilnych systemach operacyjnych, na desktopie). Docelowo zatem komponentem systemu bezpośrednio komunikującym się z bazą danych powinna być aplikacja serwerowa, umożliwiająca klientom dostęp do informacji w zunifikowany i możliwie niezależny od wyboru bazy danych sposób.

#### Szacowane obciążenie

W początkowych fazach rozwoju systemu szacowane jest stosunkowo niewielkie obciążenie, jednak projekt zakłada znaczny wzrost ruchu pochodzącego od użytkowników w miarę upływu czasu. W perspektywie czasu życia bazy danych, tj. 2-4 lat, można oczekiwać zainteresowania ze strony 1000 użytkowników dziennie, co generuje około 10000 żądań aplikacji.

#### Szacowany rozmiar struktury bazy danych

Baza danych musi przechowywać dane geoprzestrzenne z dołączonymi informacjami na temat lokalizacji gniazdek, konta użytkowników, poziomy uprawnień użytkowników, a także odniesienia przechowywanych danych geoprzestrzennych do informacji uzyskanych z API dostawcy map.

Biorąc pod uwagę ewentualne nieprzewidziane tutaj rodzaje przechowywanych informacji, ilość tabel w projekcie bazy danych szacowana jest na około 7. Baza danych powinna poradzić sobie z dziesiątkami lub nawet setkami tysięcy encji danych geoprzestrzennych oraz encji powiązań z API, dziesiątkami tysięcy encji kont użytkowników, a także kilkunastoma encjami poziomów uprawnień.

#### Zabezpieczenia

Dane udostępniane przez aplikację powinny być zabezpieczone odpowiednio do swojej istotności w systemie. Dane dostępne dla każdego użytkownika, takie, jak na przykład miejsca z lokalizacją gniazdek, nie wymagają specjalnego traktowania, jednak dane przeznaczone tylko dla administratorów wymagają rygorystycznej kontroli dostępu. Niezależnie od dostępu użytkowników do danych, podczas komunikacji użytkownika (za pośrednictwem aplikacji klienckiej) z serwerem, żadne osoby postronne nie powinny mieć możliwości odczytania ani modyfikacji danych przesyłanych ani odbieranych przez użytkownika. Z tego powodu konieczna jest implementacja szyfrowania kanału wymiany informacji.

#### Założenia projektowe

Pojedyńcze gniazdko powinno występować jako encja, w przypadku w którym użytkownik chce wyszukać gniazdko ze specyficzymi parametrami, takie jak napięcie czy też ilość miejsc w jednym gniazdku. Jednak w celu ograniczenia rozmiaru bazy danych, encja ta nie będzie zawierała geolokacji, a tylko współrzędne na schemacie, o ile takowe istnieją.
