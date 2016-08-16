create table user(
    id int primary key auto_increment comment '主键',
    username varchar(40) not null unique comment '用户名',
    password varchar(40) not null comment '密码',
);