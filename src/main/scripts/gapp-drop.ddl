
    alter table acedemic_records 
        drop constraint FK_103s4d8m9inuq5u9rul3uc0gr;

    alter table additional_info 
        drop constraint FK_4ih9b4ascyfb56tg7u8bg2062;

    alter table application 
        drop constraint FK_in07bu7ehbej6c1iwn5gsurpr;

    alter table application 
        drop constraint FK_mfrb2qrfyoe7gdwx47jlwtvuo;

    alter table application 
        drop constraint FK_ct7p8t2ao5vksirscpjym6h8u;

    alter table application 
        drop constraint FK_8tdiwtm5pbx6u2mcmfn14htke;

    alter table degree 
        drop constraint FK_qnilns95u5f97r57gf5ry3se6;

    alter table educational_background 
        drop constraint FK_g3cap6ofavnbvy7k1n0mlumu4;

    alter table program 
        drop constraint FK_3ye0xlxeb4omcvxy70kfqb8l4;

    alter table status 
        drop constraint FK_7bl2e7q1e65ipk6hq0r3ksf3s;

    alter table studentDetails 
        drop constraint FK_fi29t656hyx58s4mmk14xo49n;

    drop table if exists acedemic_records cascade;

    drop table if exists additional_info cascade;

    drop table if exists application cascade;

    drop table if exists degree cascade;

    drop table if exists department cascade;

    drop table if exists educational_background cascade;

    drop table if exists program cascade;

    drop table if exists role cascade;

    drop table if exists status cascade;

    drop table if exists studentDetails cascade;

    drop table if exists userDetails cascade;

    drop sequence hibernate_sequence;
