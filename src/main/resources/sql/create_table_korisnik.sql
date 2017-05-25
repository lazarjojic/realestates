CREATE TABLE korisnik
  (
    id             INT PRIMARY KEY AUTO_INCREMENT,
    ime            VARCHAR (20) NOT NULL,
    prezime        VARCHAR (20) NOT NULL,
    telefon        VARCHAR (30) NOT NULL,
    agencija       VARCHAR (20) NOT NULL,
    agencija_ID    INT NOT NULL,
    status         VARCHAR(15) NOT NULL,
    korisnicko_ime VARCHAR (20) NOT NULL,
    sifra          VARCHAR (15) NOT NULL,
    FOREIGN KEY (agencija_ID) REFERENCES agencija(id)
  );
