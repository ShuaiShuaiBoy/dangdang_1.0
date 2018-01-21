-- 用户表
create sequence d_user_seq start with 00001;
create table d_user(
	id number primary key,
	email varchar(30),
	nickname varchar(30),
	password varchar(30),
	state varchar(30),
	register_date date,
	last_date date,
	code varchar(30)
);

--地址表
create sequence d_address_seq start with 00001;
create table d_address(
	id number primary key,
	user_id number,
	rec_name varchar(30),
	address varchar(200),
	post_code number,
	telphone varchar(20),
	mobile varchar(20),
	default_address varchar(10),
	address_state varchar(10)
);

--图书表
create sequence d_book_seq start with 00001;
create table d_book(
	id number primary key,
	book_name varchar(150),
	author varchar(50),
	press varchar(100),
	edition number,
	print_date date,
	print_number number,
	isbn number,
	word_number number,
	page_number number,
	style varchar(30),
	paper varchar(30),
	packages varchar(30),
	recommend varchar(200),
	synopsis varchar(300),
	au_synopsis varchar(200),
	directory varchar(300),
	comments varchar(300),
	stock number,
	picture varchar(100),
	plate varchar(100),
	new_date date,
	sales number,
	price number(5,2),
	d_price number(5,2),
	state varchar(30),
	category_id number
);

--类别表
create sequence d_category_seq start with 00001;
create table d_category(
	id number primary key,
	name varchar(30),
	cLevel number,
	book_number number,
	c_id number
);

--订单表
create sequence d_order_seq start with 00001;
create table d_order(
	id number primary key,
	order_id number,
	total number(5,2),
	order_date date,
	order_state varchar(30),
	address_id number,
	user_id number
);

--订单项表
create sequence d_orderitem_seq start with 00001;
create table d_orderitem(
	id number primary key,
	item_id number,
	count number,
	summary number(5,2),
	book_id number,
	order_id number
);
