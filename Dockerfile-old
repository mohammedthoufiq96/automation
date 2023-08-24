FROM --platform=linux/x86_64 maven:3.8.2-jdk-8

WORKDIR /usr/automation

# add source code into image
COPY src /usr/automation/src/
COPY serenity.properties /usr/automation/
COPY pom.xml /usr/automation/

# Update the package list and install the latest version of chrome drivers as well as set up Personal Package Archives, maven and xvfb to have a virtual screen
RUN apt-get update && \
    apt-get install -y gnupg wget curl unzip --no-install-recommends && \
    wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add - && \
    echo "deb http://dl.google.com/linux/chrome/deb/ stable main" >> /etc/apt/sources.list.d/google.list && \
    apt-get update -y && \
    apt-get install -y google-chrome-stable

# set display port to avoid crash
ENV DISPLAY=:99

# #entry point
CMD mvn clean verify -Dbrowser=chrome
