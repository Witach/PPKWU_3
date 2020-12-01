<h1>Mobilny kalendarz WEEIA</h1>
<p>REST API zwracające plik .ics zwierający wydarzenia pobrane z kalendarza na stronie wydziału Politechniki Łódzkiej WEEIA. Zgodnie z podanym przez użytkowinka miesiącem</p>
<hr>
<h3>Endpoint</h3>
<h5>Endpoint zwraca plik .ics dla daty podanej w pramaterach zapytania.</h5>

<em>GET /calendar?year=${year}&month=${month}</em>
<table>
    <thead>
    <tr>
        <td>Nazwa pola</td>
        <td>Opis</td>
        <td>Wymagane</td>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>year</td>
        <td>Liczba oznaczająca rok np. 2020</td>
        <td>TAK</td>
    </tr>
    <tr>
        <td>month</td>
        <td>Liczba oznaczająca miesiąc np. 3 => marzec, 1 => styczeń</td>
        <td>TAK</td>
    </tr>
    </tbody>
</table>
<h5>Przykładowy plik zwrócony przez endpoint.</h5>
<pre>
    BEGIN:VCALENDAR
    BEGIN:VEVENT
    DTSTAMP:20201201T135555Z
    DTSTART;VALUE=DATE:20200309
    SUMMARY:First Step to Fields Medal
    END:VEVENT
    BEGIN:VEVENT
    DTSTAMP:20201201T135555Z
    DTSTART;VALUE=DATE:20200313
    SUMMARY:Finał konkursu InfoSukces
    END:VEVENT
    BEGIN:VEVENT
    DTSTAMP:20201201T135555Z
    DTSTART;VALUE=DATE:20200316
    SUMMARY:Matura próbna Matematyka podstawowa
    END:VEVENT
    BEGIN:VEVENT
    DTSTAMP:20201201T135555Z
    DTSTART;VALUE=DATE:20200317
    SUMMARY:Matura próbna Matematyka rozszerzona
    END:VEVENT
    BEGIN:VEVENT
    DTSTAMP:20201201T135555Z
    DTSTART;VALUE=DATE:20200318
    SUMMARY:Matura próbna Fizyka rozszerzona
    END:VEVENT
    BEGIN:VEVENT
    DTSTAMP:20201201T135555Z
    DTSTART;VALUE=DATE:20200319
    SUMMARY:Matura próbna Chemia rozszerzona
    END:VEVENT
    BEGIN:VEVENT
    DTSTAMP:20201201T135555Z
    DTSTART;VALUE=DATE:20200323
    SUMMARY:Finał konkursu Fascynująca Fizyka - poziom podstawowy
    END:VEVENT
    BEGIN:VEVENT
    DTSTAMP:20201201T135555Z
    DTSTART;VALUE=DATE:20200325
    SUMMARY:Finał konkursu Fascynująca Fizyka - poziom ponadpodstawowy
    END:VEVENT
    BEGIN:VEVENT
    DTSTAMP:20201201T135555Z
    DTSTART;VALUE=DATE:20200327
    SUMMARY:Finał konkursu Piękne doświadczenie\, Fascynujące Wyjaśnienie
    END:VEVENT
    END:VCALENDAR
</pre>
<h5>Instrukcja uruchomienia projektu</h5>
<p>Do uruchomienia projektu jest wymagana instalacja OpenJDK 15 oraz Maven</p>
W celu uruchomienia projektu należy wejść do folderu zawierającego plik <pre>pom.xml</pre> a następnie w terminalu wpisać komendę <pre>mvn spring-boot:run</pre>
