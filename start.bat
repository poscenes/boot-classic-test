call .\gradlew clean build
call docker build -t test_app.jar .
call docker-compose -f .\docker-compose.yml up