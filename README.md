# Gamify

![Build](https://github.com/turovkv/jetbrains-ide-features-gamification/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/PLUGIN_ID.svg)](https://plugins.jetbrains.com/plugin/PLUGIN_ID)

<!-- Plugin description -->
Plugin for gamification of the process of learning IntelliJ IDEA features
<!-- Plugin description end -->

- Плагин для геймификации изучения возможностей Intellij IDEA
- Санкт-Петербургская школа физико-математических и компьютерных наук (НИУ ВШЭ СПб) - 2021
## Содержание
1. [Описание работы](#описание-работы)
2. [Логика начисления баллов](#геймификация)
3. [Используемые библиотеки](#используемые-технологии)
4. [Сборка проекта](#сборка-проекта)

### Описание работы
####  Задача и мотивация
Плагин направлен на улучшение взаимодействия пользователя со средой разработки.

На данный момент в IntelliJ IDEA есть множество дополнительных возможностей, которые помогают разработчику писать код.
Но, к сожалению, пользователи не используют эти возможности в полной мере, про большинство полезных функция среды даже не знают, хотя это было бы им полезно.
#### Решение
Для того чтобы привлечь внимание пользователя к возможностям IntelliJ IDEA,
которые он не использовал ранее, мы создали систему набора баллов и достижений.
С помощью неё пользователь может отслеживать свой прогресс в изучении новых возможностей.

### Геймификация
#### Логика начисления баллов
* Добавление 100 баллов за каждую ранее неиспользованную функцию среды
* Дальнейшие баллы начисляются только за следующие 3 использования 60, 30 и 10 баллов соответственно.
#### Переходы к новым уровням
* Чтобы перейти на следующий уровень, нужно набрать 400 очков
#### Получение достижений
- Для получения достижений нужно изучить 5, 10, 15, 20, 25, 50 новых возможностей идеи соответственно.

### Используемые технологии

* Язык программирования: `Kotlin`
* Взаимодействие с IDE: `IntelliJ Platform`
* Клиент-серверное взаимодействие: `Ktor`
* Хранение данных: `MongoDB`, `KMongo`
* Графический интерфейс: `Swing`, `AWT`

### Сборка проекта

 Загрузите с [latest release](https://github.com/turovkv/jetbrains-ide-features-gamification/releases/latest) и установите с помощью
 <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>


---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
