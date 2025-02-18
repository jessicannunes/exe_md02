INSERT INTO tb_categoria (nome) VALUES ('Curso');
INSERT INTO tb_categoria (nome) VALUES ('Oficina');

INSERT INTO tb_atividade (categoria_id, nome, descricao, preco) VALUES(1, 'Curso de HTML', 'Aprenda HTML de forma prática', 80.00);
INSERT INTO tb_atividade (categoria_id, nome, descricao, preco) VALUES(2, 'Oficina de GitHub', 'Controle versões de seus projetos', 50.00 );

INSERT INTO tb_participante (atividade_id, nome, email) VALUES(1, 'José Silva', 'jose@gmail.com');
INSERT INTO tb_participante (atividade_id, nome, email) VALUES(1, 'Tiago Faria', 'tiago@gmail.com');
INSERT INTO tb_participante (atividade_id, nome, email) VALUES(1, 'Maria Do Rosário', 'maria@gmail.com');
INSERT INTO tb_participante (atividade_id, nome, email) VALUES(2, 'Maria Do Rosário', 'maria@gmail.com');
INSERT INTO tb_participante (atividade_id, nome, email) VALUES(2, 'Teresa Silva', 'teresa@gmail.com');

INSERT INTO tb_bloco (atividade_id, inicio, fim) VALUES (1, '2017-09-25 08:00:00', '2017-09-25 11:00:00');
INSERT INTO tb_bloco (atividade_id, inicio, fim) VALUES (2, '2017-09-25 14:00:00', '2017-09-25 18:00:00');
INSERT INTO tb_bloco (atividade_id, inicio, fim) VALUES (2, '2017-09-26 08:00:00', '2017-09-26 11:00:00');