DROP TABLE part;

-- data setup
CREATE TABLE part( 
    p_partkey INT,
    p_name STRING,
    p_mfgr STRING,
    p_brand STRING,
    p_type STRING,
    p_size INT,
    p_container STRING,
    p_retailprice DOUBLE,
    p_comment STRING
);

LOAD DATA LOCAL INPATH '../data/files/part_tiny.txt' overwrite into table part;

drop table over10k;

create table over10k(
           t tinyint,
           si smallint,
           i int,
           b bigint,
           f float,
           d double,
           bo boolean,
           s string,
	   ts timestamp, 
           dec decimal,  
           bin binary)
       row format delimited
       fields terminated by '|';

load data local inpath '../data/files/over10k' into table over10k;

select p_mfgr, p_retailprice, p_size,
round(sum(p_retailprice),2) = round((sum(lag(p_retailprice,1)) - first_value(p_retailprice)) + last_value(p_retailprice),2) 
  over(distribute by p_mfgr sort by p_retailprice),
max(p_retailprice) - min(p_retailprice) = last_value(p_retailprice) - first_value(p_retailprice)
  over(distribute by p_mfgr sort by p_retailprice)
from part
;

select p_mfgr, p_retailprice, p_size,
rank() over (distribute by p_mfgr sort by p_retailprice) as r,
sum(p_retailprice) over (distribute by p_mfgr sort by p_retailprice rows between unbounded preceding and current row) as s2,
sum(p_retailprice) - 5 over (distribute by p_mfgr sort by p_retailprice rows between unbounded preceding and current row) as s1
from part
;

select s, si, f, si - lead(f, 3) over (partition by t order by bo desc) from over10k limit 100;
select s, i, i - lead(i, 3, 0) over (partition by si order by i) from over10k limit 100;
select s, si, d, si - lag(d, 3) over (partition by b order by si) from over10k limit 100;
select s, lag(s, 3, 'fred') over (partition by f order by b) from over10k limit 100;
