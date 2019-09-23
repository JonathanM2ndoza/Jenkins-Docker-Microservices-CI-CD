#!/usr/bin/env bash

TAG=2.0
REGISTRY=jm2ndoza/api-customer

docker stop api-customer
docker rm api-customer
docker run -p 8071:8071 --name api-customer -d $REGISTRY:$TAG
