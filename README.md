# IntegriVideoHW
Использовать в проекте параметр scope

Использовать properties для версий зависимостей

Создать в корневой директории проекта integrivideo файл README.md в котором разместить, команды для следующих операций:

#Done
Обновить версии всех библиотек в проекте
mvn versions:use-latest-versions

#Done
Запустить тесты используякоманду в CLI
mvn clean test  

Использовать параметры для запуска конкретных тестов и методов (может быть затык с запуск нескольких методов, здесь документация https://maven.apache.org/surefire/maven-surefire-plugin/examples/single-test.html , для работы необходим обновленный maven-surefire-plugin, как обновить написано здесь http://maven.apache.org/surefire/maven-surefire-plugin/usage.html ) 
Создать альтернативный pom.xml и запустить из него mvn билд
Пробросить параметр из mvn command line внутрь теста
