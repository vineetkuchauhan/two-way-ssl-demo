# two-way-ssl-demo

Example client and service code to show how to get two way SSL setup with self signed certificate.

# Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

# Prerequisites
Java 1.8
Spring boot 2.1.5.RELEASE
Java keytool utility

# Create A Self Signed Client Cert:

$ keytool -genkeypair -alias client -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore client-keystore.p12 -validity 3650

# Create Self Signed Server Cert:

$ keytool -genkeypair -alias server -keyalg RSA -keysize 2048 -storetype PKCS12 -keystore server-keystore.p12 -validity 3650

# Create public certificate file from client cert:

$ keytool -export -alias client -file client.crt -keystore client-keystore.p12

# Create Public Certificate File From Server Cert:

$ keytool -export -alias server -file server.crt -keystore server-keystore.p12

# Import Client Cert to server-keystore PKCS12 File:

$ keytool -import -alias client -file client.crt -keystore server-keystore.p12

# Import Server Cert to client-keystore PKCS12 File:

$ keytool -import -alias server -file server.crt -keystore client-keystore.p12

