use jwd_task_03;
CREATE TABLE users(
  id INTEGER PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(20),surname VARCHAR(20),
  phone VARCHAR(20),email VARCHAR(30)
)
INSERT INTO users(name,surname,phone,email)
VALUES ('liza','grshkina','+375-29-230-78-37','l.grishkina@mail.ru');
INSERT INTO users(name,surname,phone,email)
VALUES ('daenarys','targaryen','+375-33-178-89-56','dragonqween@targaryen.com');
INSERT INTO users(name,surname,phone,email)
VALUES ('arya','stark','+375-44-567-98-32','notBoy@stark.com');
INSERT INTO users(name,surname,phone,email)
VALUES ('john','snow','+375-29-154-76-78','j.snow@stark.com');