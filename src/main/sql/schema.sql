CREATE DATABASE seckill;
use seckill;
CREATE TABLE seckill
(
`seckill_id` bigint NOT NULL AUTO_INCREMENT COMMENT '商品库存id',
`name` varchar(120) NOT NULL COMMENT '商品名称',
`number` int NOT NULL COMMENT '库存数量',
`start_time` timestamp NOT NULL COMMENT '秒杀开启时间',
`end_time` timestamp NOT NULL COMMENT '秒杀结束时间',
`create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
PRIMARY KEY (seckill_id),
key idx_start_time(start_time),
key idx_end_time(end_time),
key idx_create_time(create_time)
)ENGINE=InnoDB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀库存表';

insert into seckill(name,number,start_time,end_time)
values
('1000元秒杀iphone6',100,'2015-11-01 00:00:00','2018-11-01 00:00:00'),
('500元秒杀ipad2',200,'2015-11-01 00:00:00','2018-11-02 00:00:00');

CREATE TABLE success_killed(
`seckill_id` bigint NOT NULL COMMENT '秒杀商品id',
`user_phone` bigint NOT NULL COMMENT '用户手机号',
`state`      tinyint NOT NULL DEFAULT -1 COMMENT '状态标示:-1:无效 0:成功 1:已付款',
`create_time` timestamp NOT NULL COMMENT '创建时间',
PRIMARY KEY(seckill_id,user_phone),
key idx_create_time(create_time)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='秒杀成功明细表';

CREATE TABLE post_links(
`link_id` bigint NOT NULL AUTO_INCREMENT COMMENT 'id',
`title` varchar(1000) NOT NULL COMMENT '稿件名称',
`link_name` varchar(1000) NOT NULL COMMENT '投稿链接',
`create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
PRIMARY KEY(link_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='投稿链接表';

CREATE DATABASE seckill;
use seckill;


insert into post_links( link_name )
values
('https://my.oschina.net/happyBKs/blog/417032'),
('http://blog.csdn.net/kobejayandy/article/details/12690161');