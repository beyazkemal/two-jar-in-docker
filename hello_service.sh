#!/bin/sh
java -jar /hello_service.jar
java -jar /ticktacker.jar
exec "$@"
