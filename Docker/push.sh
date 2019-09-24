#!/usr/bin/env bash

TAG=2.0
REGISTRY=jm2ndoza/api-customer

#docker rmi $REGISTRY:$TAG
docker push $REGISTRY:$TAG