package com.usddddd;

/**
 * Created by adam on 2/6/16.
 *
 * Client:
 The client accepts a 16 character password and a filename (full path if needed) as input parameters. the
 client will encrypt the file with AES in CBC mode. It also signs the plaintext of the file by hashing the
 plaintext file with SHA-256 then encrypting the hash with RSA using its private key. The client sends the
 encrypted data and signature to the server. The file may be any format so make no assumptions about the
 format. If necessary, you may assume the programs will not be tested with any file over 1 MB. The client
 also encrypts the password used as the AES key with the server's public RSA key and sends it to the
 server. The client disconnects from the server after sending the password, file and signature.
 Inputs:
 The following information should be input in the command line when executing the client.
 · Password: The 16 character password may contain any alphanumeric character (i.e. lowercase,
 uppercase and digits). Note: special characters are not included in order to simplify the input.
 · filename: Clearly indicate in your README file if the path of the file provided as input must be the
 full path or relevant to the directory containing the executable. You may just require that the file be in
 the same directory as the executable.
 · server IP address or name
 · port number to use when contacting the server
 · Necessary RSA key components: any inputs (filenames) to provide the client the necessary
 information for the RSA keys . Key components should be read from files and not have to be typed
 by the user.
 */
public class Client {
}
