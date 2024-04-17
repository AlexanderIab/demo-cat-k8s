create
extension if not exists "uuid-ossp";
create table cats
(
    id         uuid default uuid_generate_v4() primary key,
    name       varchar(255) not null,
    dob        date         not null,
    created_at timestamp    not null
);