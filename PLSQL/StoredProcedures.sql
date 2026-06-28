SET SERVEROUTPUT ON;

CREATE OR REPLACE PROCEDURE ShowEmployeeInfo
IS
BEGIN
    DBMS_OUTPUT.PUT_LINE('Employee ID : 1001');
    DBMS_OUTPUT.PUT_LINE('Employee Name : Priya');
    DBMS_OUTPUT.PUT_LINE('Department : IT');
END;
/

BEGIN
    ShowEmployeeInfo;
END;
/