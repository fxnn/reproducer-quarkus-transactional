#!/bin/sh
mvn package -DskipTests
cd ./target
mkdir jar
unzip reproducer-quarkus-transactional-1.0-SNAPSHOT-runner.jar -d jar
