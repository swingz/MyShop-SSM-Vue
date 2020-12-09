/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2020/12/1 13:58:41                           */
/*==============================================================*/


drop table if exists t_bis_wallet;

drop table if exists t_business;

drop table if exists t_historyprice;

drop table if exists t_order;

drop table if exists t_orderinfo;

drop table if exists t_product;

drop table if exists t_saledproduct;

drop table if exists t_salingproduct;

drop table if exists t_user;

drop table if exists t_user_addr;

drop table if exists t_user_wallet;

/*==============================================================*/
/* Table: t_bis_wallet                                          */
/*==============================================================*/
create table t_bis_wallet
(
   tbw_id               bigint not null auto_increment,
   bis_id               bigint,
   bis_amount           decimal,
   bis_fzamount         decimal,
   primary key (tbw_id)
);

/*==============================================================*/
/* Table: t_business                                            */
/*==============================================================*/
create table t_business
(
   tbs_id               bigint not null auto_increment,
   bis_id               bigint,
   bis_name             varchar(50),
   bis_flag             smallint,
   bis_tel              varchar(20),
   bis_email            varchar(50),
   bis_addr             varchar(100),
   Attribute_19         char(10),
   primary key (tbs_id)
);

/*==============================================================*/
/* Table: t_historyprice                                        */
/*==============================================================*/
create table t_historyprice
(
   th_id                bigint not null auto_increment,
   pid                  bigint,
   price                decimal,
   start_time           datetime,
   end_time             datetime,
   primary key (th_id)
);

/*==============================================================*/
/* Table: t_order                                               */
/*==============================================================*/
create table t_order
(
   to_id                bigint not null auto_increment,
   order_id             bigint,
   user_id              bigint,
   order_price          decimal,
   order_flag           smallint,
   order_user           varchar(12),
   order_tel            varchar(20),
   order_addr           varchar(100),
   created_time         datetime,
   updated_time         datetime,
   primary key (to_id)
);

/*==============================================================*/
/* Table: t_orderinfo                                           */
/*==============================================================*/
create table t_orderinfo
(
   toi_id               bigint not null auto_increment,
   order_id             bigint,
   pid                  bigint,
   primary key (toi_id)
);

/*==============================================================*/
/* Table: t_product                                             */
/*==============================================================*/
create table t_product
(
   tp_id                bigint not null auto_increment,
   pid                  bigint,
   pname                varchar(20),
   price                decimal,
   primary key (tp_id)
);

/*==============================================================*/
/* Table: t_saledproduct                                        */
/*==============================================================*/
create table t_saledproduct
(
   tp_id                bigint not null auto_increment,
   pid                  bigint,
   pname                varchar(20),
   price                decimal,
   saledprice           decimal,
   saledcount           bigint,
   primary key (tp_id)
);

/*==============================================================*/
/* Table: t_salingproduct                                       */
/*==============================================================*/
create table t_salingproduct
(
   tp_id                bigint not null auto_increment,
   pid                  bigint,
   pname                varchar(20),
   price                decimal,
   salingprice          bigint,
   salingcount          bigint,
   primary key (tp_id)
);

/*==============================================================*/
/* Table: t_user                                                */
/*==============================================================*/
create table t_user
(
   tu_id                bigint not null auto_increment,
   user_id              bigint,
   user_nickname        varchar(20),
   user_pwd             varchar(20),
   user_email           varchar(50),
   user_tel             varchar(20),
   primary key (tu_id)
);

/*==============================================================*/
/* Table: t_user_addr                                           */
/*==============================================================*/
create table t_user_addr
(
   tua_id               bigint not null auto_increment,
   user_id              bigint,
   user_addr            varchar(100),
   primary key (tua_id)
);

/*==============================================================*/
/* Table: t_user_wallet                                         */
/*==============================================================*/
create table t_user_wallet
(
   tuw_id               bigint not null auto_increment,
   user_id              bigint,
   user_amount          decimal,
   user_fzamount        decimal,
   primary key (tuw_id)
);

