CREATE TABLE tb_users_roles (
                                user_id CHAR(36),
                                role_id BIGINT,
                                PRIMARY KEY (user_id, role_id),
                                FOREIGN KEY (user_id) REFERENCES tb_users(user_id) ON DELETE CASCADE,
                                FOREIGN KEY (role_id) REFERENCES tb_roles(role_id) ON DELETE CASCADE
);