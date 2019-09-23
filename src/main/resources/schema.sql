create sequence user_seq;
create sequence employee_seq;
create sequence customer_seq;
create sequence category_seq;
create sequence product_seq;
create sequence photo_seq;
create sequence order_seq;
create sequence order_product_seq;

create table user
(
    user_id bigint primary key,
    email varchar(255) not null unique,
    password varchar(60) not null,
    role varchar(16) not null,
    active boolean not null,
    temporary_uuid uuid
);

create table employee
(
    employee_id bigint primary key,
    user_id bigint not null references user(user_id),
    firstname varchar(30) not null,
    lastname varchar(30) not null,
    job_title varchar(60) not null
);

create table customer
(
    customer_id bigint primary key,
    user_id bigint not null references user(user_id),
    firstname varchar(30) not null,
    lastname varchar(30) not null,
    phone varchar(9) not null,
    address varchar(30) not null,
    city varchar(30) not null,
    postal_code varchar(6) not null,
);

create table category
(
    category_id bigint primary key,
    name varchar(30) not null unique,
    icon varchar(30) not null
);

create table product
(
    product_id bigint primary key,
    category_id bigint not null references category(category_id),
    name varchar(60) not null,
    price numeric(8,2) not null,
    special_price numeric(8,2),
    description text not null,
    quantity_in_stock integer not null
);

create table photo
(
    photo_id bigint primary key,
    product_id bigint not null references product(product_id),
    filename varchar(30) not null unique,
    sort_number integer not null
);

create table orders -- 'order' is not valid table name in H2 :/
(
    order_id bigint primary key,
    customer_id bigint not null references customer(customer_id),
    status varchar(30) not null,
    order_date timestamp,
    comments varchar(255),
    payment_date timestamp,
    invoice_filename varchar(30) unique
);

create table order_product
(
    order_product_id bigint primary key,
    order_id bigint not null references orders(order_id),
    product_id bigint not null references product(product_id),
    quantity integer not null,
    price numeric(8,2) not null
);
