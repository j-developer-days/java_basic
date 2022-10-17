1)
--compule java
javac -verbose -d ./output/ src/com/jdev/*

2)
--run app
java -cp ./output/ com.jdev.ReadSystemProperties

3)
--run app with verbose
java -verbose -cp ./output/ com.jdev.ReadSystemProperties

4)
--run app with verbose and with 2 system properties
java -verbose -cp ./output/ com.jdev.ReadSystemProperties -Dprop1="this is properties 1" -Dprop2=199

5)
--run app with verbose and with 2 system properties and find via grep comand(but we can't see our properties)
java -verbose -cp ./output/ com.jdev.ReadSystemProperties -Dprop1="this is properties 1" -Dprop2=199 | grep prop

6)
--run app with verbose and with 2 system properties and find via grep comand(now we can see, because we changed place our properties in command)
java -verbose -Dprop1="this is properties 1" -Dprop2=199 -cp ./output/ com.jdev.ReadSystemProperties | grep prop
java -verbose -cp ./output/ -Dprop1="this is properties 1" -Dprop2=199 com.jdev.ReadSystemProperties | grep prop

java -cp ./output/ -Dprop1="this is properties 1" -Dprop2=199 com.jdev.ReadSystemProperties prop1

java -cp ./output/ -Dprop1="this is properties 1" -Dprop2=199 com.jdev.ReadSystemProperties prop1 prop2 prop3

7)
--create jar file without manifest file user defined
jar -cfve ./jar/readSystemProperties.jar com.jdev.ReadSystemProperties -C ./output .

8)
--run jar file
java -jar ./jar/readSystemProperties.jar

--run with property
java -jar ./jar/readSystemProperties.jar -Dprop1=199 | grep prop1

java -Dprop1=199 -jar ./jar/readSystemProperties.jar | grep prop1

java -verbose -Dprop1=199 -jar ./jar/readSystemProperties.jar

9)
--see content of jar file
jar -tfv ./jar/readSystemProperties.jar

10)
--get list out keys in keystore
keytool -list

11)
--create certificate
keytool -genkeypair -alias jdev -validity 150 -v -keystore jdev_store

keytool -genkeypair -alias jdev30 -validity 30 -v -keystore jdev_store

12)
--signed jar file
jarsigner -keystore jdev_store -signedjar ./jar/s_readSystemProperties.jar ./jar/readSystemProperties.jar jdev -verbose

13)
--verify if jar file is signed
jarsigner -verify ./jar/s_readSystemProperties.jar -verbose

jarsigner -verify ~/../java_dev/Downloads/spring-core-5.3.22.jar

14)
--export public key
keytool -exportcert -keystore jdev_store -alias jdev -file ./jdev_certificate.cer

keytool -exportcert -keystore jdev_store -alias jdev30 -file ./jdev30_certificate.cer

15)
--run executeable jar
java -cp ./jar/readSystemProperties.jar com.jdev.ReadSystemProperties
java -jar ./jar/readSystemProperties.jar

16)
--extract signed jar file
jar -xfv ../jar/s_readSystemProperties.jar

17)
--import certificate
keytool -import -alias jdev -file ../jdev_certificate.cer -keystore jdev_store

18)
--verify signed jar file
jarsigner -verify -verbose -keystore jdev_store -certs ./s_readSystemProperties.jar

19)
--check exported certificate
keytool -printcert -file ../jdev_certificate.cer