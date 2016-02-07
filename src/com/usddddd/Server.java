package com.usddddd;

/**
 * Created by adam on 2/6/16.
 *
 * The server will be run in one of two modes, trusted or untrusted. In trusted mode, the server receives the
 encrypted password, encrypted file and signature from the server, decrypts the file and verifies the
 signature, writing the result (”Verification Passed” or ”Verification Failed”) to standard out (the terminal
 window). The server writes the unencrypted file received from the server to disk in the same directory
 from which the server application was executed. It names the file ”decryptedfile” (no file extension in the
 name).
 In untrusted mode, we pretend that malware has replaced the received file with one called "fakefile" (no
 file extension in the name). The server performs the same steps as in trusted mode, except it uses fakefile
 instead of the file it received from the client.
 You may have the server always write the file received from the client to disk and have the server read the
 received file or fakefile, as appropriate based on the mode.
 The file decryptedfile will be compared to the original file when grading the program so it is
 recommended you diff the result with the original file when testing your programs. There should be no
 differences, including no differences for end-of-file.
 You are responsible for determining the proper RSA key components the server uses for decrypting the
 password and for verifying the signature.
 */
public class Server {
}
