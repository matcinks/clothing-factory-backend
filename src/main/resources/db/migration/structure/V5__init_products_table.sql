drop table if exists products;

create table products
(
--     id                     bigint primary key auto_increment,
    id                     bigserial primary key,
    name                   varchar(255) not null,
    description            varchar(255) not null,
    additional_information varchar(255),
    category               varchar(255) not null,
    material_usage         double precision,
    unit_usage             varchar(255),
    price                  decimal(19, 2),
    version                bigint,
    created_at             timestamp
);