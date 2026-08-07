create table fornecedores(
    id_fornecedor serial primary key,
    cnpj varchar(15),
    nome varchar(50) not null
);

create table pratos(
    id_prato serial primary key,
    receita varchar(25) not null,
    valor float not null,
    disponibilidade boolean not null
);

create table clientes(
    id_cliente serial primary key,
    cpf_cliente varchar(15) not null,
    nome varchar(50) not null
);

create table mesas(
    id_mesa serial primary key,
    lugares int not null
);

create table funcoes(
    id_funcao serial primary key,
    nome varchar(50)
);


create table tel_fornecedor(
    id_telefone serial primary key,
    numero varchar(15),
    id_fornecedor int not null,
    FOREIGN KEY (id_fornecedor) REFERENCES fornecedores(id_fornecedor)
);

create table ingredientes(
    id_ingrediente serial primary key,
    nome varchar(50) not null,
    valor float not null,
    disponibilidade boolean not null,
    id_fornecedor int not null,
    FOREIGN KEY (id_fornecedor) REFERENCES fornecedores(id_fornecedor)
);

create table tel_clientes(
    id_telefone serial primary key,
    numero varchar(15),
    id_cliente int not null,
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente)
);

create table pedidos(
    id_pedido serial primary key,
    valor_pedido float not null,
    id_mesa int not null,
    FOREIGN KEY (id_mesa) REFERENCES mesas(id_mesa)
);

create table funcionarios(
    id_funcionario serial primary key,
    cpf varchar(13) not null,
    nome varchar(50) not null,
    id_funcao int not null,
    FOREIGN KEY (id_funcao) REFERENCES funcoes(id_funcao)
);

create table reservas(
    id_reserva serial primary key,
    id_cliente int not null,
    id_mesa int not null,
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente),
    FOREIGN KEY (id_mesa) REFERENCES mesas(id_mesa)
);


create table ingredientes_prato(
    id_prato int not null,
    id_ingrediente int not null,
    primary key(id_prato, id_ingrediente),
    FOREIGN KEY (id_prato) REFERENCES pratos(id_prato),
    FOREIGN KEY (id_ingrediente) REFERENCES ingredientes(id_ingrediente)
);

create table prato_pedido(
    id_prato int not null,
    id_pedido int not null,
    FOREIGN KEY (id_prato) REFERENCES pratos(id_prato),
    FOREIGN KEY (id_pedido) REFERENCES pedidos(id_pedido)
);

create table pagamentos(
    id_pagamento serial primary key,
    forma_pagamento varchar(20) not null,
    data_pagamento date not null,
    id_funcionario int not null,
    id_pedido int not null,
    FOREIGN KEY (id_funcionario) REFERENCES funcionarios(id_funcionario),
    FOREIGN KEY (id_pedido) REFERENCES pedidos(id_pedido)
);

create table funcionario_cliente(
    id_funcionario int not null,
    id_cliente int not null,
    FOREIGN KEY (id_funcionario) REFERENCES funcionarios(id_funcionario),
    FOREIGN KEY (id_cliente) REFERENCES clientes(id_cliente)
);


INSERT INTO fornecedores (cnpj, nome) VALUES 
('2312', 'Bom gosto'),
('3213123', 'Sadia');
create table tel_fornecedor(
    id_telefone serial primary key,
    numero varchar(15),
    id_fornecedor int not null,
    FOREIGN KEY (id_fornecedor) REFERENCES fornecedores(id_fornecedor)
);
INSERT INTO tel_fornecedor(numero, id_fornecedor) values (83988740499, 1)

INSERT INTO fornecedores (id_fornecedor, cnpj, nome) VALUES 
(101, '12345678901234', 'Distribuidora Alimentos SA'),
(102, '98765432109876', 'Hortifruti Frescor');

INSERT INTO ingredientes (id_ingrediente, nome, valor, disponibilidade, id_fornecedor) VALUES 
(101, 'Farinha de Trigo', 6.50, true, 101),
(102, 'Açúcar', 4.00, true, 101),
(103, 'Ovos', 12.00, true, 102),
(104, 'Chocolate Belga', 85.00, true, 101), 
(105, 'Fermento', 3.50, true, 101),
(106, 'Morango', 15.00, true, 102);

INSERT INTO pratos (id_prato, receita, valor, disponibilidade) VALUES 
(101, 'Bolo de Chocolate', 45.00, true),
(102, 'Torta de Morango', 55.00, true),
(103, 'Bolo de Cenoura', 35.00, true);

INSERT INTO ingredientes_prato (id_prato, id_ingrediente) VALUES 
(101, 101), (101, 103), (101, 104),
(102, 101), (102, 103), (102, 106);

INSERT INTO funcoes (id_funcao, nome) VALUES 
(101, 'Caixa'),
(102, 'Garçom'),
(103, 'Gerente');

INSERT INTO funcionarios (id_funcionario, cpf, nome, id_funcao) VALUES 
(101, '11111111111', 'João Silva', 101),
(102, '22222222222', 'Maria Oliveira', 102),
(103, '33333333333', 'Carlos Pereira Silva', 101);

INSERT INTO mesas (id_mesa, lugares) VALUES 
(101, 4), (102, 2), (103, 6), (104, 8);

INSERT INTO pedidos (id_pedido, valor_pedido, id_mesa) VALUES 
(101, 150.00, 101),
(102, 85.50, 101),
(103, 320.00, 103),
(104, 45.00, 102);

INSERT INTO pagamentos (forma_pagamento, data_pagamento, id_funcionario, id_pedido) VALUES 
('Cartão de Crédito', '2026-10-01', 101, 101),
('Dinheiro', '2026-10-01', 103, 102),
('PIX', '2026-10-02', 101, 103);

INSERT INTO clientes (id_cliente, cpf_cliente, nome) VALUES 
(101, '44444444444', 'Ana Costa'),
(102, '55555555555', 'Pedro Souza'),
(103, '66666666666', 'Lucas Fernandes');

INSERT INTO reservas (id_cliente, id_mesa) VALUES 
(101, 101),
(102, 103);
