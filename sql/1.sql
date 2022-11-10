use linzhuangzhuang ;

create table tb_estate(
    e_id int primary key auto_increment comment '编号',
    e_name varchar(50) not null comment '名称'
);

insert into tb_estate values(default,'通泰国际公园') ;
insert into tb_estate values(default,'经开壹中心') ;
insert into tb_estate values(default,'锋创科技园') ;

create table tb_house(
    hid int primary key auto_increment comment '编号',
    h_title varchar(100) not null comment '标题',
    h_price double not null comment '价格',
    -- 取值是0或1，0表示未卖出，1表示已卖出
    h_sell int(3) not null comment '是否已经售出',
    h_image varchar(200) not null comment '图片路径',
    h_estate int not null comment '所属小区',
    constraint house_estate_fk foreign key (h_estate) references tb_estate(e_id)
);

select * from tb_house where h_estate=1;

insert into tb_house values(default,'通泰国际公馆两居室南北通透装修保持好',550.00,0,'/images/a.png',1);
insert into tb_house values(default,'距离经海路地铁站1100米的两居室(高德地图)距离经海',480.00,1,'/images/b.png',2);
insert into tb_house values(default,'锋创科技园环境优美南向视野采光好',103.00,0,'/images/c.png',3);

select
    e_name,
       sum(case when h_sell=1 then 1 else 0 end ) as '已售',
       sum(case when h_sell=0 then 1 else 0 end) as '在售'
    from tb_house th join tb_estate te on th.h_estate=te.e_id group by e_name;

select
    sum(case when h_sell=1 then 1 else 0 end) as '已售',
    sum(case when h_sell=0 then 1 else 0 end) as '在售',
e_name
    from tb_house  th join tb_estate te on th.h_estate = te.e_id group by e_name;
