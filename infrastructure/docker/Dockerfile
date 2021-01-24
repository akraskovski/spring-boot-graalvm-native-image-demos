FROM alpine:3.13.0

RUN apk --no-cache add curl

ADD ../../target/app /opt/app

EXPOSE 8080

ENTRYPOINT /opt/app
