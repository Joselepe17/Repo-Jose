FROM docker.io/alpine

RUN \
    apk add --no-cache fortune && \
    apk add --no-cache \
        --repository https://dl-cdn.alpinelinux.org/alpine/edge/testing \
        cowsay
    



CMD ["/bin/sh", "-c", "fortune  | cowsay"]