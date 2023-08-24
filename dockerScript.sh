docker build -t mydockerimage .

docker pull selenium/standalone-chrome

docker images

docker run -d -p 4444:4444 -v /dev/shm:/dev/shm selenium/standalone-chrome

docker run -d --network="host" mydockerimage mvn -f /usr/automation/pom.xml clean verify -Dbrowser="chrome"

