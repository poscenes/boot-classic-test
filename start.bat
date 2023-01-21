call .\gradlew clean build
call docker build -t test_app-1.0.0.jar .
call docker-compose -f .\docker-compose.yml up