Kotlin REST api kód SPRING devtools-al JPE MySQL adatbázison

Endpontok:
GET http://localhost:8080/threads - visszaadja a Threadek listáját
POST http://localhost:8080/threads - létrehoz egy új threadet aminek a nevét a RequestBody-ból stringként veszi ki, az adatbázisban auto-inkremens id van
GET http://localhost:8080/threads/{id} - az {id} id-jű thread üzeneteit adja vissza
POST http://localhost:8080/threads/{id} - az {id} id-jű threadhez ad üzenetet amit a RequestBody-ból stringként vesz ki.

Adatbázis konfigurálásához ezt használtam: https://www.youtube.com/watch?v=P8Y4VxR1UtA
