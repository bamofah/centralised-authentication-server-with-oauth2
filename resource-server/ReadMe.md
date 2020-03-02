# Resource Server Talking to CAS Server

To decode the JWT token it will be nessary to use the `public key` from the self-signed
cerficate used by the CAS Server to sign the token.

**Command to export public key**

```
keytool -list -rfc --keystore keystore.jks | openssl x509 -inform pem -pubkey -noout
```
