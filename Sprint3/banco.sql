-- LOGIN BANCO DE DADOS
--USERNAME=RM99545
--PASSWORD=160205

CREATE TABLE Usuario (
    id_usuario NUMBER(5) PRIMARY KEY,
    nome VARCHAR2(100),
    endereco VARCHAR2(200),
    idade NUMBER(3)
);

CREATE TABLE Consultora (
    id_consultora NUMBER(5),
    pontuacao_consultora NUMBER(5),
    PRIMARY KEY (id_consultora),
    CONSTRAINT FK_Consultora_Usuario FOREIGN KEY (id_consultora) REFERENCES Usuario(id_usuario)
);

CREATE TABLE Cliente (
    id_cliente NUMBER(5),
    PRIMARY KEY (id_cliente),
    CONSTRAINT FK_Cliente_Usuario FOREIGN KEY (id_cliente) REFERENCES Usuario(id_usuario)
);

SELECT * FROM Cliente;
SELECT * FROM Usuario;

CREATE TABLE Categoria (
    id_categoria NUMBER(5) PRIMARY KEY,
    nome_categoria VARCHAR2(100)
);

SELECT * FROM Categoria;

CREATE TABLE Produto (
    id_produto NUMBER(5) PRIMARY KEY,
    nome_produto VARCHAR2(255),
    descricao_produto VARCHAR2(255),
    preco_produto NUMBER(10, 2) NOT NULL,
    id_categoria NUMBER(5),
    estoque NUMBER(5),
    CONSTRAINT FK_Produto_Categoria FOREIGN KEY (id_categoria) REFERENCES Categoria(id_categoria)
);

SELECT * FROM Produto;




