CREATE TABLE tb_users (
                          user_id CHAR(36) PRIMARY KEY,
                          username VARCHAR(255) NOT NULL UNIQUE,
                          password VARCHAR(255) NOT NULL
);