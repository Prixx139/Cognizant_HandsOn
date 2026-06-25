SET SERVEROUTPUT ON;

DECLARE
    student_score NUMBER := 78;
BEGIN
    IF student_score >= 90 THEN
        DBMS_OUTPUT.PUT_LINE('Grade : A');
    ELSIF student_score >= 75 THEN
        DBMS_OUTPUT.PUT_LINE('Grade : B');
    ELSIF student_score >= 60 THEN
        DBMS_OUTPUT.PUT_LINE('Grade : C');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Grade : D');
    END IF;
END;
/
