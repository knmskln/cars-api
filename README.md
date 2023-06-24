# REST API ����������
���������� �������: ���������� - ������

���� ������ PostgreSQL, ������ � ����� ������ �������������� � ������� hibernate.

� ������ ���������� ������� ���������� ��� �������� �������: "����������" � "������". ��������� ����� ���� �������� "���� �� ������", �� ���� ������ ���������� ����� ��������������� ��������� ������.
�������:
1. ����������:
- ID
- �����
- ������
- ��� �������
- ����
- ����
2. ������:
- ���
- �������
- ����� ��������
- �����
- ID ����������

����������: 
- ������� git clone �����������
```
git clone https://github.com/knmskln/cars-api
```
- ������� ���� ��������� � `application.properties`
- ������� � ��������� ������ � Intellij IDEA

## �������� ������������ �������

### spring-boot-starter-data-jpa
- **groupId:** org.springframework.boot
- **artifactId:** spring-boot-starter-data-jpa

�����������, ������� ������������� ����������� ����������� ��� ������ � ����� ������ ����� JPA (Java Persistence API) � ����������� �� Spring Boot.

### spring-boot-starter-web
- **groupId:** org.springframework.boot
- **artifactId:** spring-boot-starter-web

�����������, ������� ������������� ����������� ����������� ��� ���������� ���-���������� �� Spring Boot, ������� ��������� ���-������� � ��������� HTTP-��������.

### spring-boot-devtools
- **groupId:** org.springframework.boot
- **artifactId:** spring-boot-devtools
- **scope:** runtime
- **optional:** true

�����������, ������� ������������� ����������� ���������� � �������������� ������������ ��� ���������� � �������� ���� �� ����� ���������� ����������.

### postgresql
- **groupId:** org.postgresql
- **artifactId:** postgresql
- **scope:** runtime

�����������, ������� ������������� ������� JDBC ��� ����������� � ���� ������ PostgreSQL.

### lombok
- **groupId:** org.projectlombok
- **artifactId:** lombok
- **optional:** true

�����������, ������� ������������� ������� ��������� � ����������� ��� ���������� ������ ���� � �������.

### spring-boot-starter-test
- **groupId:** org.springframework.boot
- **artifactId:** spring-boot-starter-test
- **scope:** test

�����������, ������� ������������� ����������� � ���������� ��� ��������� � ������� �������������� ������ � ������� �� Spring Boot.
