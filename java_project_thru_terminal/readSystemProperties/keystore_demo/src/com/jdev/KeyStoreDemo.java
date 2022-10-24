package com.jdev;

import java.io.File;
import java.io.IOException;
import java.security.*;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.interfaces.DSAPrivateKey;
import java.util.Enumeration;

public class KeyStoreDemo {

    public static void main(String[] args) throws KeyStoreException, CertificateException, IOException,
            NoSuchAlgorithmException, UnrecoverableEntryException {
        final char[] keyStorePassword = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        final char[] password = "123456789".toCharArray();
        File keyStoreFile = new File("/home/java_dev/projects/github/java_basic/java_se/java_project_thru_terminal/readSystemProperties/jdev_store");
        KeyStore keyStore = KeyStore.getInstance(keyStoreFile, keyStorePassword);
        System.out.println("keyStore.size() - " + keyStore.size());
        System.out.println("keyStore.getType() - " + keyStore.getType());
        System.out.println("keyStore.getProvider() - " + keyStore.getProvider().getName());
        Enumeration<String> aliases = keyStore.aliases();
        System.out.println("\naliases: ");
        while (aliases.hasMoreElements()) {
            System.out.println("_____________________________________________________________________________________");
            System.out.println("_____________________________________________________________________________________");
            String alias = aliases.nextElement();
            System.out.println("\t" + alias + "\t\t creation date - " + keyStore.getCreationDate(alias));
            Key key = keyStore.getKey(alias, password);
            System.out.println("\n\tkey.getFormat() - " + key.getFormat());
            System.out.println("\tkey.getAlgorithm() - " + key.getAlgorithm());
            System.out.println("\tkey.getEncoded() - " + key.getEncoded().length + "\n\tcontent - " +
                    new String(key.getEncoded()));
            DSAPrivateKey dsaPrivateKey = (DSAPrivateKey) key;
            System.out.println("\tdsa private key x - " + dsaPrivateKey.getX());
            Certificate certificate = keyStore.getCertificate(alias);
            System.out.println("\n\tCERTIFICATE :" + certificate);
            System.out.println("\n\tCheck certificate owner - " + keyStore.getCertificateAlias(certificate));
            Certificate[] certificateChain = keyStore.getCertificateChain(alias);
            for (int i = 0; i < certificateChain.length; i++) {
                System.out.println("\n\tCERTIFICATE {" + (i + 1) + "} :" + certificate);
            }
            KeyStore.Entry entry = keyStore.getEntry(alias, new KeyStore.PasswordProtection(password));
            System.out.println("entry - " + entry);
            System.out.println("*************************************************************************************");
            System.out.println("*************************************************************************************");
        }

    }
}
