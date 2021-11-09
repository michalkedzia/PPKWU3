# String API
API umozliwiające uzysaknie indormacji o Stringu przekazanym
w parametrze zapytania GET.W odpowiedzi dostajemy informacje o ilości
wielkich i małych liter, ilości liczb itp. Odpowiedź możemy uzyskac w 4 formatach: text,json,csv i xml.
Api to odwołuje sie do innego zewnętrznego API, które zwraca jedunie informacje o danym Stringu.
Aplikacja jest uruchamiana na porcie 8081


## Składnia
```
api_path/{format}/{parameter_text} 
```
## Przykład
```
http://localhost:8081/api/v1/csv/ABCabc123@!@
http://localhost:8081/api/v1/text/ABCabc123@!@
http://localhost:8081/api/v1/json/ABCabc123@!@
http://localhost:8081/api/v1/xml/ABCabc123@!@
```
## Wynik
Odpwiedź w formacie JSON:
```json
{
  "parameter": "ABCabc123@!@",
  "length" : 12, 
  "digits": 3,
  "upperCase": 3,
  "lowerCase": 3,
  "whitespace": 0,
  "specialCharacters": 3
}
```

Odpwiedź w formacie XML:
```xml
<StringResponse>
<parameter>ABCabc123@!@</parameter>
<length>12</length>
<digits>3</digits>
<upperCase>3</upperCase>
<lowerCase>3</lowerCase>
<whitespace>0</whitespace>
<specialCharacters>3</specialCharacters>
</StringResponse>
```
Odpwiedź w formacie text:
```text
parameter: ABCabc123@!@ digits: 3 upperCase: 3 lowerCase: 3 whitespace: 0 specialCharacters: 3
```

Odpwiedź w formacie CSV:
```csv
parameter,digits,upperCase,lowerCase,whitespace,specialCharacters
ABCabc123@!@,3,3,3,0,3
```