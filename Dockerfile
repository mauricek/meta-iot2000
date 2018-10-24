FROM kasproject/kas:latest

RUN useradd -ms /bin/bash builder
USER builder

WORKDIR /home/builder
RUN mkdir -p iot2040
WORKDIR /home/builder/iot2040

RUN git clone https://github.com/mauricek/meta-iot2000.git --branch qt5

WORKDIR /home/builder/iot2040/meta-iot2000

RUN kas build meta-iot2000-example/kas.yml
