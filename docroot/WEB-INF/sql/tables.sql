create table UN_WikiIndex (
	nodeId LONG not null primary key,
	content TEXT null,
	companyId LONG,
	groupId LONG,
	auto_ BOOLEAN
);

create table UN_WikiIndexPage (
	wikiPageId LONG not null primary key,
	title VARCHAR(200) null,
	order_ INTEGER,
	parentId LONG
);

create table UN_WikiIndexPages (
	wikiPageId LONG not null primary key,
	title VARCHAR(75) null,
	order_ INTEGER,
	parentId LONG
);