#!/usr/bin/env bash

eval "$(docker-machine env default)"

docker stop $(docker ps -a -q)
docker-compose stop

docker-compose -p ${artifactId.toLowerCase().replace("-", "")} up -d