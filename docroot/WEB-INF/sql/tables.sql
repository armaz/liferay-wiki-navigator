create table UN_WikiIndex (
	nodeId LONG not null primary key,
	content TEXT null,
	companyId LONG,
	groupId LONG,
	auto_ BOOLEAN
);