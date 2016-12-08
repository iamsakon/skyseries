create index IX_C207ADBA on apm_building (name[$COLUMN_LENGTH:75$]);
create index IX_163BBF6F on apm_building (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_B13B55B1 on apm_building (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_1DE77EB0 on apm_floor (name[$COLUMN_LENGTH:75$]);
create index IX_42CBCF65 on apm_floor (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_E75AEB27 on apm_floor (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_50D6FC96 on apm_room (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_8401B098 on apm_room (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_31D9FEEF on apm_room_status (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_76637531 on apm_room_status (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_13445EF7 on apm_room_type (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_D1763739 on apm_room_type (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_9F0C5DE3 on legal_entity (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_66C90125 on legal_entity (uuid_[$COLUMN_LENGTH:75$], groupId);