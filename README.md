# REST API приложение
Предметная область: Автомобиль - Заявка

База данных PostgreSQL, работа с базой данных осуществляется с помощью hibernate.

В данной предметной области существуют два основных объекта: "Автомобиль" и "Заявка". Отношение между ними является "один ко многим", то есть одному автомобилю может соответствовать несколько заявок.
Объекты:
1. Автомобиль:
- ID
- Марка
- Модель
- Год выпуска
- Цвет
- Цена
2. Заявка:
- Имя
- Фамилия
- Номер телефона
- Адрес
- ID автомобиля

Инструкция: 
- сделать git clone репозитория
```
git clone https://github.com/knmskln/cars-api
```
- указать свои параметры в `application.properties`
- открыть и запустить проект в Intellij IDEA

## Описание зависимостей проекта

### spring-boot-starter-data-jpa
- **groupId:** org.springframework.boot
- **artifactId:** spring-boot-starter-data-jpa

Зависимость, которая предоставляет стандартные возможности для работы с базой данных через JPA (Java Persistence API) в приложениях на Spring Boot.

### spring-boot-starter-web
- **groupId:** org.springframework.boot
- **artifactId:** spring-boot-starter-web

Зависимость, которая предоставляет стандартные возможности для разработки веб-приложений на Spring Boot, включая поддержку веб-сервера и обработку HTTP-запросов.

### spring-boot-devtools
- **groupId:** org.springframework.boot
- **artifactId:** spring-boot-devtools
- **scope:** runtime
- **optional:** true

Зависимость, которая предоставляет инструменты разработки и автоматическую перезагрузку при изменениях в исходном коде во время разработки приложения.

### postgresql
- **groupId:** org.postgresql
- **artifactId:** postgresql
- **scope:** runtime

Зависимость, которая предоставляет драйвер JDBC для подключения к базе данных PostgreSQL.

### lombok
- **groupId:** org.projectlombok
- **artifactId:** lombok
- **optional:** true

Зависимость, которая предоставляет удобные аннотации и инструменты для сокращения объема кода в проекте.

### spring-boot-starter-test
- **groupId:** org.springframework.boot
- **artifactId:** spring-boot-starter-test
- **scope:** test

Зависимость, которая предоставляет инструменты и фреймворки для написания и запуска автоматических тестов в проекте на Spring Boot.
