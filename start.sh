#!/usr/bin/env bash
./gradlew clean build
docker build -t test_app.jar .
docker-compose -f docker-compose.yml up