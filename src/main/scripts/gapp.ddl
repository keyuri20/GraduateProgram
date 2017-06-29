
    create table acedemic_records (
        ac_id int4 not null,
        GPA int4,
        Transcripts int2,
        uid_uid int4,
        primary key (ac_id)
    );

    create table additional_info (
        ad_id int4 not null,
        name varchar(255),
        required boolean,
        type varchar(255),
        d_no_d_no int4,
        primary key (ad_id)
    );

    create table application (
        aid int4 not null,
        term varchar(255),
        d_no_d_no int4,
        p_no_p_no int4,
        sid_sid int4,
        status_id_status_id int4,
        primary key (aid)
    );

    create table degree (
        degree_id int4 not null,
        degree_name varchar(255),
        eid_eid int4,
        primary key (degree_id)
    );

    create table department (
        d_no int4 not null,
        dept_name varchar(255),
        primary key (d_no)
    );

    create table educational_background (
        eid int4 not null,
        clg_name varchar(255),
        duration int4,
        major varchar(255),
        sid_sid int4,
        primary key (eid)
    );

    create table program (
        p_no int4 not null,
        program_name varchar(255),
        d_no_d_no int4,
        primary key (p_no)
    );

    create table role (
        rid int4 not null,
        role_name varchar(255),
        primary key (rid)
    );

    create table status (
        status_id int4 not null,
        LastUpdated timestamp,
        comments varchar(255),
        status_name varchar(255),
        sid_sid int4,
        primary key (status_id)
    );

    create table studentDetails (
        sid int4 not null,
        CIN varchar(255),
        citizenship varchar(255),
        dob timestamp,
        email varchar(255),
        first_name varchar(255),
        gender varchar(255),
        last_name varchar(255),
        ph_no varchar(255),
        uid_uid int4,
        primary key (sid)
    );

    create table userDetails (
        uid int4 not null,
        email varchar(255),
        first_name varchar(255),
        last_name varchar(255),
        password varchar(255),
        rid int4,
        primary key (uid)
    );

    alter table acedemic_records 
        add constraint FK_103s4d8m9inuq5u9rul3uc0gr 
        foreign key (uid_uid) 
        references userDetails;

    alter table additional_info 
        add constraint FK_4ih9b4ascyfb56tg7u8bg2062 
        foreign key (d_no_d_no) 
        references department;

    alter table application 
        add constraint FK_in07bu7ehbej6c1iwn5gsurpr 
        foreign key (d_no_d_no) 
        references department;

    alter table application 
        add constraint FK_mfrb2qrfyoe7gdwx47jlwtvuo 
        foreign key (p_no_p_no) 
        references program;

    alter table application 
        add constraint FK_ct7p8t2ao5vksirscpjym6h8u 
        foreign key (sid_sid) 
        references studentDetails;

    alter table application 
        add constraint FK_8tdiwtm5pbx6u2mcmfn14htke 
        foreign key (status_id_status_id) 
        references status;

    alter table degree 
        add constraint FK_qnilns95u5f97r57gf5ry3se6 
        foreign key (eid_eid) 
        references educational_background;

    alter table educational_background 
        add constraint FK_g3cap6ofavnbvy7k1n0mlumu4 
        foreign key (sid_sid) 
        references studentDetails;

    alter table program 
        add constraint FK_3ye0xlxeb4omcvxy70kfqb8l4 
        foreign key (d_no_d_no) 
        references department;

    alter table status 
        add constraint FK_7bl2e7q1e65ipk6hq0r3ksf3s 
        foreign key (sid_sid) 
        references studentDetails;

    alter table studentDetails 
        add constraint FK_fi29t656hyx58s4mmk14xo49n 
        foreign key (uid_uid) 
        references userDetails;

    create sequence hibernate_sequence;


INSERT INTO role(
            rid, role_name)
    VALUES (1, 'admin');


INSERT INTO role(
            rid, role_name)
    VALUES (2, 'staff');


INSERT INTO role(
            rid, role_name)
    VALUES (3, 'student');


INSERT INTO userdetails(
            uid, email, first_name, last_name, password, rid)
    VALUES (1, 'admin@localhost.localdomain', 'admin', 'def', 'abcd', 1);


INSERT INTO userdetails(
            uid, email, first_name, last_name, password, rid)
    VALUES (2, 'student1@localhost.localdomain', 'student1', 'def', 'abcd', 3);


INSERT INTO userdetails(
            uid, email, first_name, last_name, password, rid)
    VALUES (3, 'student2@localhost.localdomain', 'student2', 'def', 'abcd', 3);


INSERT INTO userdetails(
            uid, email, first_name, last_name, password, rid)
    VALUES (4, 'staff1@localhost.localdomain', 'staff1', 'def', 'abcd', 2);


INSERT INTO userdetails(
            uid, email, first_name, last_name, password, rid)
    VALUES (5, 'staff2@localhost.localdomain', 'staff2', 'def', 'abcd', 2);

INSERT INTO studentdetails(
            sid, cin, citizenship, dob, email, first_name, gender, last_name, 
            ph_no, uid_uid)
    VALUES (1, '100', 'indian', '01/02/1991', 'student1@localhost.localdomain', 'student1', 'female', 'def', 
            3236849192, 2);

INSERT INTO studentdetails(
            sid, cin, citizenship, dob, email, first_name, gender, last_name, 
            ph_no, uid_uid)
    VALUES (2, '101', 'indian', '02/02/1991', 'student2@localhost.localdomain', 'student2', 'female', 'def', 
            3236849192, 3);

INSERT INTO department(
            d_no, dept_name)
    VALUES (1, 'Accounting');

INSERT INTO department(
            d_no, dept_name)
    VALUES (2, 'Computer Science');


INSERT INTO program(
            p_no, program_name, d_no_d_no)
    VALUES (1, 'MS in Accounting', 1);


INSERT INTO program(
            p_no, program_name, d_no_d_no)
    VALUES (2, 'MS in Computer Science', 2);

INSERT INTO status(
            status_id, lastupdated, comments, status_name, sid_sid)
    VALUES (1, '01/01/2016', 'We have accepted your application', 'Accepted', 1);

INSERT INTO application(
            aid, term, d_no_d_no, p_no_p_no, sid_sid, status_id_status_id)
    VALUES (1, 'Fall 2016', 1, 1, 1, 1);
