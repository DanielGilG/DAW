# Funciones lógicas
1. Bucles (WHILE, FOR)
2. Condiciones (IF)

# Uso de _Triggers_ "Cursores"
Se utilizan cursores cuando la automatización devolverá más de una característica.

El uso de elementos como :NEW o :OLD permiten adquirir datos de ANTES o DESPUÉS de la acción que activó al _trigger_.

Este es un ejemplo de un _trigger_ controlando un delete
```sql
CREATE OR REPLACE TRIGGER trg_salario_minimo
BEFORE DELETE ON HR.EMPLOYEES
FOR EACH ROW
BEGIN
	IF :OLD.DEPARTMENT_ID = 90 THEN
		RAISE_APPLICATION_ERROR(-200001,"Rácano");
	END IF;
END;
/
```

# Uso de Funciones o Procedimientos
Dependiendo de el número de variables de salida, utilizamos uno u otro.
Funiones: '1 salida'
Procedimientos: '>=1 salida'

Syntaxis de una FUNCIÓN:
```sql
CREATE OR REPLACE FUNCTION f_blabla (v_in NUMBER)
RETURN BOOLEAN IS
-- Internal variables
v_count NUMBER;

BEGIN
    SELECT COUNT(*) INTO v_a
    FROM HR.EMPLOYEES E
    WHERE E.EMPLOYEE_ID = v_in /*input var*/
    
    IF v_count > 0 THEN
        DBMS_OUTPUT.PUTLINE('Es manager');
    ELSE
        DBMS_OUTPUT.PUTLINE('No es manager');
    END IF;
END;
/
```
