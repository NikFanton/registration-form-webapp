DROP TABLE IF EXISTS user;

CREATE TABLE user (
    id        INT(32) AUTO_INCREMENT PRIMARY KEY,
    login     VARCHAR(64) NOT NULL,
    password  VARCHAR(64) NOT NULL,
    UNIQUE(login));

INSERT INTO user (login, password) VALUES
  ('jack123', '12345'),
  ('mike',    'qwerty'),
  ('peter',   '123'),
  ('nikita',  'qwerty123'),
  ('tom',     'abc555'),
  ('john',     '111');

SELECT * FROM user;