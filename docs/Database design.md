# Project Hallowed Connection
## Database design

### Analiza wymagań

#### Zadania bazy danych

Baza danych dla projektowanej aplikacji musi wydajnie obsługiwać dane geoprzestrzenne, aby możliwe było szybkie przeszukiwanie obszarów mapy w celu znalezienia pasujących do nich encji.

Projekt aplikacji zakłada również przechowywanie graficznych szkiców lokalizacji gniazdek w budynkach, w związku z czym rozwiązanie bazodanowe musi umożliwiać szybki dostęp do danych graficznych.

#### Środowisko produkcyjne

Z przechowywanych danych ma docelowo korzystać aplikacja mobilna i aplikacja webowa. Należy też przewidzieć możliwość rozszerzenia systemu o aplikacje działające w innych środowiskach (np. innych mobilnych systemach operacyjnych, na desktopie). Docelowo zatem komponentem systemu bezpośrednio komunikującym się z bazą danych powinna być aplikacja serwerowa, umożliwiająca klientom dostęp do informacji w zunifikowany i możliwie niezależny od wyboru bazy danych sposób.

#### Szacowane obciążenie

W początkowych fazach rozwoju systemu szacowane jest stosunkowo niewielkie obciążenie, jednak projekt zakłada znaczny wzrost ruchu pochodzącego od użytkowników w miarę upływu czasu. W perspektywie czasu życia bazy danych, tj. 2-4 lat, można oczekiwać zainteresowania ze strony 1000 użytkowników dziennie, co generuje około 10000 żądań aplikacji.

#### Szacowany rozmiar struktury bazy danych

Baza danych musi przechowywać dane geoprzestrzenne z dołączonymi informacjami na temat lokalizacji gniazdek, konta użytkowników, poziomy uprawnień użytkowników, a także odniesienia przechowywanych danych geoprzestrzennych do informacji uzyskanych z API dostawcy map.

Biorąc pod uwagę ewentualne nieprzewidziane tutaj rodzaje przechowywanych informacji, ilość tabel w projekcie bazy danych szacowana jest na około 7. Baza danych powinna poradzić sobie z dziesiątkami lub nawet setkami tysięcy encji danych geoprzestrzennych oraz encji powiązań z API, dziesiątkami tysięcy encji kont użytkowników, a także kilkunastoma encjami poziomów uprawnień.
