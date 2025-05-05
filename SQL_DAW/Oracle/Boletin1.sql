-- Ejercicio 1
CREATE OR REPLACE FUNCTION es_jefe (v_id IN HR.EPLOYEES.EMPLOYEE_ID%TYPE) RETURN BOOLEAN 
IS 
v_count NUMBER;

BEGIN
	SELECT COUNT(*) INTO v_count
	FROM HR.EMPLOYEES E
	WHERE E.MANAGER_ID == v_id;

	IF v_count > 0 THEN
		DBMS_OUTPUT.PUT_LINE('Es manager')
	ELSE
		DBMS_OUTPUT.PUT_LINE('No es manager')
	END IF;
END;

-- Ejercicio 2
CREATE OR REPLACE FUNCTION salario_con_bonus(e_id IN HR.EMPLOYEES.EMPLOYEE_ID%TYPE) 
RETURN NUMBER IS 

v_salario NUMBER;
v_com NUMBER;
v_salario VARCHAR2;

BEGIN
	SELECT E.SALARY E.COMMISSION_PCT, E.JOB_ID INTO v_salario, v_com, v_salario
	FROM HR.EMPLOYEES E
	WHERE EM.EMPLOYEE_ID = e_id;

	IF v_com > 0 THEN
		RETURN v_salario:=v_salario*1.10;
	END IF;

	IF SUBSTR(V_JOB,1,2)='SA' THEN
		RETURN v_salario:=v_salario*1.05;
END;

-- Ejercicio 3
CREATE OR REPLACE PROCEDURE p_empl(d_id IN HR.DEPARTMENT.DEPARTMENT_ID%TYPE) 
IS 

v_salario NUMBER;
v_com NUMBER;
v_salario VARCHAR2;

BEGIN
	FOR emp IN (
		SELECT CONCAT(E.FIRST_NAME, E.LAST_NAME)
		FROM HR.DEPARTMENTS D INNER JOIN
		HR.EMPLOYEES E ON D.DEPARTMENT_ID=E.DEPARTMENT_ID
		WHERE D.DEPARTMENT_ID=d.id
	)LOOP
	/*dbms...*/
END LOOP;

END;

-- Ejercicio 5
CREATE OR REPLACE PROCEDURE p_detalles 
IS 
	CURSOR c_detalles IS SELECT first_name, last_name, commission_pct, job_id
	FROM HR.EMPLOYEES;

v_first
v_last
v_com
v_jobid
v_result

BEGIN
	OPEN c_detalles;
	LOOP
		FETCH c_detalles INTO v_first, v_last, v_com, v_jobid, v_result;
		EXIT WHEN c_detalles%NOTFOUND;

		IF SUBSTR(v_jobid,1,2)='SA' THEN
			IF v_com IS NULL THEN
				/*Output*/
			END IF;
		END IF;
	END LOOP;
	CLOSE c_detalles;
END;

/*
NQFKO86Q3HJ82KYU0DM

DE DAN BT N2QO7 D46U4 K009R 5 AR
 */
