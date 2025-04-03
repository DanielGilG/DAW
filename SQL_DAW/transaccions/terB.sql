SET AUTOCOMMIT = 0;

-- 1. Seleccionamos la base de datos
USE test;

-- 2. Configuramos que en esta sesión vamos a utilizar el nivel de aislamiento READ UNCOMMITTED
SET SESSION TRANSACTION ISOLATION LEVEL READ UNCOMMITTED;
-- SET SESSION TRANSACTION ISOLATION LEVEL READ COMMITTED;
-- SET SESSION TRANSACTION ISOLATION LEVEL REPEATABLE READ;
-- SET SESSION TRANSACTION ISOLATION LEVEL SERIALIZABLE;

-- 3. Iniciamos una transacción y atualizamos los datos de la tabla cuentas
START TRANSACTION;
UPDATE cuentas SET saldo = saldo - 100 WHERE id = 1;

-- 4. Finalizamos la transacción con COMMIT
COMMIT;
