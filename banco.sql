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