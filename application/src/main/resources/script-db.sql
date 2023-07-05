create table compte
(id INT PRIMARY KEY NOT NULL,
 numCompte INT,
 solde INT,
 refTransaction INT);

create table transactions
(id INT PRIMARY KEY NOT NULL,
 refTransaction INT,
 numCompte INT,
 date_transaction date,
 solde INT);

insert into transactions values(
1,1,1,CURDATE(),500
);

insert into compte values(
1,1,1000,1
);
