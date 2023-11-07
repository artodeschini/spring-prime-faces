# Gerenciamento de contas

Este sistema foi criado com [spring](https://start.spring.io/) com jsf [primefaces](https://www.primefaces.org/primeflex/)
Para maiores de detalhes com spring veja [help](HELP.md)

## requisitos

* maven
* java 17
* lombok
* h2

## primeflex

Adicionado estivo com CDN [primeflex](https://www.primefaces.org/primeflex/) em [index.html](src/main/resources/META-INF/resources/index.xhtml) para estilizar os componentes como primeface

## primefaces

Guia de componentes do [primefaces](https://www.primefaces.org/)
O tema escuro foi definido em [application,properties](src/main/resources/application.properties)

## Base de dados

Foi utilizada [h2 database](https://www.h2database.com/html/main.html), porém pode ser substituido por qualquer banco de dados relacional que tenha suporte a jdbc4

Para acessar a [console h2](http://localhost:8080/h2-console) voce pode utilizar esse link

## boilerplate

A fim de evitar a `boilerplate` codigo repetitivo foi utilizado [lombok](https://projectlombok.org/) afim de remover codigo como get e set construtores e escrita do metodo toString

[implementado](src/main/java/org/todeschini/intentario/model/Produto.java)

## icon 

Veja todos os icones disponivies [icones](https://www.primefaces.org/diamond/icons.xhtml)


