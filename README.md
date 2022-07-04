# ProyectoSO
Proyecto #2 - Sistemas Operativos

Using REST API GET requests to translate from Spanish to English a small set of predefined key words.

# Getting started:

1 - Clone the repository `git clone https://github.com/robles-mar/ProyectoSO.git`.

2 - On your terminal, access the project directory and build the image based on the Dockerfile with `docker build -t <image_name> .`.

3 - Then proceed to create the container with this image with `docker run -p 8080:8080 <image_name>`.

4 - Now you will be able to perform GET requests with the following format `http://127.0.0.1:8080/ProyectoII-1.0-SNAPSHOT/api/translate?palabra={key_word}`.

# List of available 'key_words':

* Amigo

* Servidor

* Tigre

* Rojo

* Verde

* Gato

* Proyecto

* Sistemas Operativos
