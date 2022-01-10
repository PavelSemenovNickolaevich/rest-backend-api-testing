# API тесты для RESTful веб-сервиса. Данный серви написан в учебных целях и имитирует backend примитвного магазина по продаже авиавбилетов.


## Используемые технологии и инструменты

<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Intelij_IDEA.svg" width="40" height="40"  alt="IDEA"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Java.svg" width="40" height="40"  alt="Java"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Gradle.svg" width="40" height="40"  alt="Gradle"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/JUnit5.svg" width="40" height="40"  alt="JUnit 5"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Github.svg" width="40" height="40"  alt="Github"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Docker.svg" width="40" height="40"  alt="Docker"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://starchenkov.pro/qa-guru/img/skills/Rest-Assured.svg" width="40" height="40"  alt="Rest-Assured"/>
</a>
<a href="https://www.jetbrains.com/idea/">
    <img src="https://www.vectorlogo.zone/logos/springio/springio-icon.svg" width="40" height="40"  alt="Spring"/>
</a>

<img id="image" data-size="512" class="img-responsive" src="https://cdn.icon-icons.com/icons2/2107/PNG/512/file_type_swagger_icon_130134.png" width="40" height="40"  alt="Swagger"/>

IntelliJ IDEA, Java, Gradle, JUnit5, Github, Jenkins, Rest-Assured, Dockers, Spring, Swagger

## Реализованы проверки endpoints:
### API
- [X] - tickets/getAll
- [X] - tickets/getAllDepartures
- [X] - tickets/getAllArrivals
- [X] - tickets/addNewTicket
- [X] - tickets/filterByPrice


    
C помощью Spring создается RESTful web-сервис
Так как подключение базы данных отсутствует, данные создаются синтетически
С помощью подключенной библиотеки REST-ASSURED сервис покрыт API тестами
Сущетсвует два способа запуска сервиса и тестов

1. 
 - Скачать проект с гитхаба и запустить сервис в IDEA
 - Запустить тестовый класс в IDEA или:
```bash
 gradle clean tickets
``` 



2. 
 - Скачать проект и запустить через docker-compose
 - Перейти в папку docker в проекте и ввести:
```bash
docker-compose up --build
``` 


Сервис app смонтирует образ и запустить jar файл с веб-сервисом
Сервис test_runner скачает и запустит образ с тестами, которые обратятся к сервису

После запуска веб-сервиса доступен swagger с описанными методами и атрибутами по адресу :
                  http://localhost:8080/swagger-ui/#/

![Swagger1](src/main/resources/pictures/swagger1.png)


![Swagger2](src/main/resources/pictures/swagger2.png)

Подергать API можно или через swagger или через POSTMAN

![Postman](src/main/resources/pictures/Postman.png)

Запуск двух контейнеров : один с сервисом, другой - с тестами

![result](src/main/resources/pictures/result.png)