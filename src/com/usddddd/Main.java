package com.usddddd;

/**
 * Programming Problem: (125 points)
 This problem involves using crypto libraries/functions for encrypting, hashing and signing data. Use
 existing library routines as opposed to writing your own functions for any crypto algorithms needed. Do
 not download and install 3rd party crypto libraries. Your code must run on the clic machine without
 requiring that the TA install additional libraries. You may use any programming language on the clic
 machines. C/C++ or JAVA may be the easiest. If using C/C++, the openssl library contains the crypto
 functions. (Note: the openssl version on clic does support SHA-256 even if the help message does not
 display it in the list of algorithms.) If using JAVA, the JAVA crypto library has the required functions.
 There is no need to use a 3rd party JAVA library for the crypto.
 Overview:
 There will be a client and a server with regular sockets (no TLS) between the client and server. The client
 will encrypt and sign a file, then send an encrypted key, the encrypted file and the signature to the server.
 The client and server have RSA keys (using 2048 bit modulus) that will be used in this process. The
 server decrypts the file, checks the signature and indicates whether the signature verification failed or
 passed. We will pretend that the server has malware on it that may sometimes replaces the encrypted file
 with another file. A command line argument given to the server will indicate if the file is replaced.
 You are responsible for determining how to generate RSA keys and store the RSA keys so the client and
 server can read the necessary keys. The client and server must not see each other's private key. Note:
 since you will be running both the client and server from your clic account, it is ok if the private keys are
 stored in separate files in the same directory. It is not ok to store an entity's public key and private key in
 a single file that the other entity reads to get to the public key.
 Do no hard code the port numbers the client and server use for the socket. The port numbers should be
 specified on the command line when starting the client and server.
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
