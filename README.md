# Video-management-system
视频管理系统

create database videodata;

create table video
(
	id int auto_increment,
	videoName varchar(64) not null,
	episode int not null comment '集数',
	type varchar(64) not null,
	detail varchar(64) not null,
	score float not null,
	constraint video_pk
		primary key (id)
);
