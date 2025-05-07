-- Ejercicio 1
CREATE OR REPLACE PROCEDURE mostrar_empleado(p_employee_id IN employees.employee_id%TYPE) IS
    v_nombre  employees.first_name%TYPE;
    v_apellido employees.last_name%TYPE;
    v_salario employees.salary%TYPE;
BEGIN
    -- Intentamos obtener los datos del empleado
    SELECT first_name, last_name, salary
    INTO v_nombre, v_apellido, v_salario
    FROM employees
    WHERE employee_id = p_employee_id;

    -- Si se encuentra, mostramos los datos
    DBMS_OUTPUT.PUT_LINE('Nombre: ' || v_nombre || ' ' || v_apellido);
    DBMS_OUTPUT.PUT_LINE('Salario: ' || v_salario || ' USD');
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        DBMS_OUTPUT.PUT_LINE('El empleado con ID ' || p_employee_id || ' no existe.');

	mostrar_empleado(100);
END;
/

-- Ejercicio 2
