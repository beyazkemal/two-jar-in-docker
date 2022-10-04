FROM ubuntu:20.04
# install jre
RUN apt-get -y update && apt-get -y upgrade
RUN apt -y install openjdk-17-jre
# add and register hello service
ADD hello_service.jar /hello_service.jar
ADD hello_service.sh /hello_service.sh
RUN chmod +x /hello_service.jar
RUN chmod +x /hello_service.sh
# add dummy service :)
ADD ticktacker.jar /ticktacker.jar
ENTRYPOINT ["/hello_service.sh"]
