create table apm_building (
	uuid_ VARCHAR(75) null,
	buildingId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	name2 VARCHAR(75) null,
	legalEntityId LONG
);

create table apm_floor (
	uuid_ VARCHAR(75) null,
	floorId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	buildingId LONG
);

create table apm_room (
	uuid_ VARCHAR(75) null,
	roomId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	floorId LONG,
	roomStatusId LONG,
	roomTypeId LONG
);

create table apm_room_status (
	uuid_ VARCHAR(75) null,
	roomStatusId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	code_ VARCHAR(75) null,
	name VARCHAR(75) null
);

create table apm_room_type (
	uuid_ VARCHAR(75) null,
	roomTypeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null,
	description VARCHAR(75) null
);

create table legal_entity (
	uuid_ VARCHAR(75) null,
	legalEntityId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	name VARCHAR(75) null
);