CREATE TABLE tb_for_you (
                            fy_id BIGINT PRIMARY KEY AUTO_INCREMENT,
                            user_id CHAR(36),
                            content VARCHAR(255),
                            creation_timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                            CONSTRAINT fk_user_id FOREIGN KEY (user_id) REFERENCES tb_users(user_id)
);