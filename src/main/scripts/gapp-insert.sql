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
