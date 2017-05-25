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
  
CREATE TABLE IF NOT EXISTS real_estate
  (
    id          INT PRIMARY KEY AUTO_INCREMENT,
    agency_id INT,
    user_id INT,
    price DOUBLE(10,2) NOT NULL,
    area DOUBLE NOT NULL,
    structure   VARCHAR(20) NOT NULL,
    city       VARCHAR(20) NOT NULL,
    street       VARCHAR(20) NOT NULL,
    number        VARCHAR(5) NOT NULL,
    floor       INT NOT NULL,
    heating    VARCHAR(20) NOT NULL,
    balcony      INT NOT NULL,
    type         VARCHAR(20) NOT NULL,
    booked INT NOT NULL,
    status      VARCHAR(20) NOT NULL,
    variant   VARCHAR(20) NOT NULL,
    description        VARCHAR(250) NOT NULL,
    rooms  VARCHAR(100) NOT NULL,
    conclusion VARCHAR(20) NOT NULL,
    FOREIGN KEY (agency_id) REFERENCES agency(id),
    FOREIGN KEY (user_id) REFERENCES user(id)
  );
  
  