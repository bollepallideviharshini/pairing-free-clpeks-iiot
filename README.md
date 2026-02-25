# pairing-free-clpeks-iiot
Pairing-Free Certificateless Searchable Public Key Encryption (CLPEKS) Scheme for Industrial Internet of Things (IIoT)
# Pairing-Free CLPEKS Scheme for Industrial Internet of Things (IIoT)

## 1. Overview

This project proposes a pairing-free Certificateless Public Key Authenticated Encryption with Keyword Search (CLPEKS) scheme for secure data storage in Industrial Internet of Things (IIoT) environments.

The scheme eliminates the use of bilinear pairing to reduce computational overhead and is designed to resist Inside Keyword Guessing Attacks (IKGA). It provides secure searchable encryption for cloud-assisted IIoT systems while maintaining efficiency and security.

---

## 2. Problem Statement

IIoT systems generate large volumes of data through distributed sensors. This data is often outsourced to cloud servers for storage and processing. Since cloud service providers are not fully trusted, data must be encrypted before storage.

Traditional encryption techniques do not support efficient searching over encrypted data. Existing PEKS and CLPEKS schemes either rely on expensive bilinear pairing or suffer from security vulnerabilities such as IKGA.

This project addresses these limitations by proposing a pairing-free CLPEKS scheme with improved security and computational performance.

---

## 3. Key Features

- Pairing-free cryptographic construction
- Resistance against Inside Keyword Guessing Attacks (IKGA)
- Certificateless public key framework (CLPKC)
- Public verification support
- Efficient user revocation
- Secure cloud data auditing mechanism

---

## 4. System Modules

The system consists of the following modules:

- Data Owner
- User
- Cloud Service Provider (CSP)
- Public Verifier
- User Interface Module

Each module participates in secure data upload, encryption, verification, and searchable retrieval.

---

## 5. Technologies Used

- Java (J2EE)
- JSP and Servlets
- MySQL 5.5
- Eclipse IDE
- Apache Tomcat Server
- Windows Operating System

---

## 6. Security Model

The proposed scheme is based on Certificateless Public Key Cryptography (CLPKC). 

Security is proven in the Random Oracle Model and relies on:

- Computational Diffie-Hellman (CDH) assumption
- Discrete Logarithm (DL) assumption

The scheme ensures confidentiality, integrity, and resistance to keyword guessing attacks.

---

## 7. System Architecture

The architecture follows a cloud-assisted IIoT model where:

1. Data Owner encrypts data and keywords.
2. Encrypted data is uploaded to the Cloud Service Provider.
3. Users generate trapdoors to search encrypted data.
4. Public Verifier performs integrity auditing.
5. CSP handles storage and verification support.

---

## 8. How to Run the Project

1. Import the project into Eclipse as a Dynamic Web Project.
2. Configure MySQL database and update connection settings.
3. Deploy the project on Apache Tomcat Server.
4. Run the application on localhost.

---

## 9. Conclusion

This project presents a pairing-free CLPEKS scheme suitable for resource-constrained IIoT environments. It eliminates the computational cost of bilinear pairing while maintaining strong security guarantees.

The scheme demonstrates improved computational efficiency, secure searchable encryption, and resistance to keyword guessing attacks.

---

## 10. References

This work is based on research in:

- Public Key Encryption with Keyword Search (PEKS)
- Certificateless Public Key Cryptography (CLPKC)
- Remote Data Possession Checking (RDPC)
- Cloud Data Auditing and Integrity Verification
