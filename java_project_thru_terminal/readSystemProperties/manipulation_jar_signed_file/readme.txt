--create certificate
keytool -genkeypair -alias jdev_200 -validity 200 -v -keystore jdev_store
keytool -genkeypair -alias jdev_90 -v -keystore jdev_store
keytool -genkeypair -alias jdev_30 -validity 30 -v -keystore jdev_store

--signed jar file
jarsigner -keystore jdev_store -signedjar ./rsp_30.jar ./readSysProp.jar jdev_30 -verbose
jarsigner -keystore jdev_store -signedjar ./rsp_90.jar ./readSysProp.jar jdev_90 -verbose
jarsigner -keystore jdev_store -signedjar ./rsp_200.jar ./readSysProp.jar jdev_200 -verbose

--show by keystore name
keytool -list -keystore ./jdev_store

--show by keystore name with verbose
keytool -list -v -keystore ./jdev_store

--show by keystore name with rfc
keytool -list -rfc -keystore ./jdev_store

--update signed jar file
jar -ufv ./rsp_30.jar ./jdev_store 

--check after update
jarsigner -verify ./rsp_30.jar

--more info about signer
jarsigner -verify -keystore ./jdev_store -verbose -certs ./rsp_30.jar jdev_30