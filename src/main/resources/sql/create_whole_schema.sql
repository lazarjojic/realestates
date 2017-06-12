CREATE TABLE IF NOT EXISTS agency
  (
    id      INT PRIMARY KEY AUTO_INCREMENT,
    name   VARCHAR (20) NOT NULL,
    pib     VARCHAR (15) NOT NULL,
    director VARCHAR (40) NOT NULL,
    address  VARCHAR (50) NOT NULL,   
    phone VARCHAR (30) NOT NULL
  );
  
insert into agency (name, pib, director, address, phone) values ('ETF', 'ETF', 'Profesor Sale', 'Vukov Spomenik', '064');
  
CREATE TABLE IF NOT EXISTS user
  (
    id             INT PRIMARY KEY AUTO_INCREMENT,
    first_name            VARCHAR (20) NOT NULL,
    last_name        VARCHAR (20) NOT NULL,
    phone        VARCHAR (30) NOT NULL,    
    agency_id    INT NOT NULL,
    status         VARCHAR(15) NOT NULL,
    username VARCHAR (20) NOT NULL,
    password          VARCHAR (15) NOT NULL,
    FOREIGN KEY (agency_id) REFERENCES agency(id)
  );
  
insert into user (first_name, last_name, phone, agency_id, status, username, password) values ('lazar', 'jojic', '064', 1, 'admin', 'lazar', 'lazar');
  
CREATE TABLE IF NOT EXISTS user_image
(
   id INT PRIMARY KEY AUTO_INCREMENT,
   user_id INT NOT NULL,
   image_path VARCHAR (150) NOT NULL,
   FOREIGN KEY (user_id) REFERENCES user(id)
);

INSERT INTO user_image (user_id, image_path) VALUES (1, '/files/profile/photo/lazar_admin');
  

  
CREATE TABLE IF NOT EXISTS real_estate
  (
    id          INT PRIMARY KEY AUTO_INCREMENT,
    agency_id INT,
    user_id INT,
    price DOUBLE(10,2) NOT NULL,
    area DOUBLE NOT NULL,
    structure   VARCHAR(20) NOT NULL,   
    heating    VARCHAR(20) NOT NULL,
    balcony      BIT(1) NOT NULL,
    type         VARCHAR(20) NOT NULL,
    booked BIT(1) NOT NULL,
    status      VARCHAR(20) NOT NULL,
    mode   VARCHAR(20) NOT NULL,
    description        VARCHAR(250) NOT NULL,
    rooms  VARCHAR(100) NOT NULL,
    finance VARCHAR(100) NOT NULL,
    conclusion VARCHAR(20) NOT NULL,
    FOREIGN KEY (agency_id) REFERENCES agency(id),
    FOREIGN KEY (user_id) REFERENCES user(id)
  );
  
CREATE TABLE IF NOT EXISTS real_estate_address
  (
    id          INT PRIMARY KEY AUTO_INCREMENT,
    real_estate_id INT,   
    city       VARCHAR(20) NOT NULL,
    street       VARCHAR(20) NOT NULL,
    number        VARCHAR(5) NOT NULL,
    floor       INT NOT NULL,
    FOREIGN KEY (real_estate_id) REFERENCES real_estate(id)    
  );
  
CREATE TABLE IF NOT EXISTS PHOTOS
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	real_estate_id INT,
	path varchar(150) not null,
	TYPE INT NOT NULL,
	FOREIGN KEY (real_estate_id) REFERENCES real_estate(id)	
);

CREATE TABLE IF NOT EXISTS DOCUMENTS
(
	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(30) NOT NULL,
	TYPE VARCHAR(30) NOT NULL,
	DESCRIPTION VARCHAR(150),
	CREATION_DATE DATE NOT NULL,	
	path varchar(150) not null,	
	real_estate_id INT,
	FOREIGN KEY (real_estate_id) REFERENCES real_estate(id)	
);
  
  