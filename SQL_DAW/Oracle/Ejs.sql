/*
EMPLOYEE_ID FIRST_NAME    LAST_NAME     EMAIL       PHONE_NUMBER     HIRE_DATE                 JOB_ID       SALARY COMMISSION_PCT MANAGER_ID DEPARTMENT_ID 
----------- ------------- ------------- ----------- ---------------- ------------------------- ------------ ------ -------------- ---------- ------------- 
100         Steven        King          SKING       1.515.555.0100   06/17/2013, 02:00:00 AM   AD_PRES      24000                            90            
101         Neena         Yang          NYANG       1.515.555.0101   09/21/2015, 02:00:00 AM   AD_VP        17000                 100        90            
102         Lex           Garcia        LGARCIA     1.515.555.0102   01/13/2011, 01:00:00 AM   AD_VP        17000                 100        90            
103         Alexander     James         AJAMES      1.590.555.0103   01/03/2016, 01:00:00 AM   IT_PROG      9000                  102        60            
104         Bruce         Miller        BMILLER     1.590.555.0104   05/21/2017, 02:00:00 AM   IT_PROG      6000                  103        60            
105         David         Williams      DWILLIAMS   1.590.555.0105   06/25/2015, 02:00:00 AM   IT_PROG      4800                  103        60            
106         Valli         Jackson       VJACKSON    1.590.555.0106   02/05/2016, 01:00:00 AM   IT_PROG      4800                  103        60            
107         Diana         Nguyen        DNGUYEN     1.590.555.0107   02/07/2017, 01:00:00 AM   IT_PROG      4200                  103        60            
108         Nancy         Gruenberg     NGRUENBE    1.515.555.0108   08/17/2012, 02:00:00 AM   FI_MGR       12008                 101        100           
109         Daniel        Faviet        DFAVIET     1.515.555.0109   08/16/2012, 02:00:00 AM   FI_ACCOUNT   9000                  108        100           
110         John          Chen          JCHEN       1.515.555.0110   09/28/2015, 02:00:00 AM   FI_ACCOUNT   8200                  108        100           
111         Ismael        Sciarra       ISCIARRA    1.515.555.0111   09/30/2015, 02:00:00 AM   FI_ACCOUNT   7700                  108        100           
112         Jose Manuel   Urman         JMURMAN     1.515.555.0112   03/07/2016, 01:00:00 AM   FI_ACCOUNT   7800                  108        100           
113         Luis          Popp          LPOPP       1.515.555.0113   12/07/2017, 01:00:00 AM   FI_ACCOUNT   6900                  108        100           
114         Den           Li            DLI         1.515.555.0114   12/07/2012, 01:00:00 AM   PU_MAN       11000                 100        30            
115         Alexander     Khoo          AKHOO       1.515.555.0115   05/18/2013, 02:00:00 AM   PU_CLERK     3100                  114        30            
116         Shelli        Baida         SBAIDA      1.515.555.0116   12/24/2015, 01:00:00 AM   PU_CLERK     2900                  114        30            
117         Sigal         Tobias        STOBIAS     1.515.555.0117   07/24/2015, 02:00:00 AM   PU_CLERK     2800                  114        30            
118         Guy           Himuro        GHIMURO     1.515.555.0118   11/15/2016, 01:00:00 AM   PU_CLERK     2600                  114        30            
119         Karen         Colmenares    KCOLMENA    1.515.555.0119   08/10/2017, 02:00:00 AM   PU_CLERK     2500                  114        30            
120         Matthew       Weiss         MWEISS      1.650.555.0120   07/18/2014, 02:00:00 AM   ST_MAN       8000                  100        50            
121         Adam          Fripp         AFRIPP      1.650.555.0121   04/10/2015, 02:00:00 AM   ST_MAN       8200                  100        50            
122         Payam         Kaufling      PKAUFLIN    1.650.555.0122   05/01/2013, 02:00:00 AM   ST_MAN       7900                  100        50            
123         Shanta        Vollman       SVOLLMAN    1.650.555.0123   10/10/2015, 02:00:00 AM   ST_MAN       6500                  100        50            
124         Kevin         Mourgos       KMOURGOS    1.650.555.0124   11/16/2017, 01:00:00 AM   ST_MAN       5800                  100        50            
125         Julia         Nayer         JNAYER      1.650.555.0125   07/16/2015, 02:00:00 AM   ST_CLERK     3200                  120        50            
126         Irene         Mikkilineni   IMIKKILI    1.650.555.0126   09/28/2016, 02:00:00 AM   ST_CLERK     2700                  120        50            
127         James         Landry        JLANDRY     1.650.555.0127   01/14/2017, 01:00:00 AM   ST_CLERK     2400                  120        50            
128         Steven        Markle        SMARKLE     1.650.555.0128   03/08/2018, 01:00:00 AM   ST_CLERK     2200                  120        50            
129         Laura         Bissot        LBISSOT     1.650.555.0129   08/20/2015, 02:00:00 AM   ST_CLERK     3300                  121        50            
130         Mozhe         Atkinson      MATKINSO    1.650.555.0130   10/30/2015, 01:00:00 AM   ST_CLERK     2800                  121        50            
131         James         Marlow        JAMRLOW     1.650.555.0131   02/16/2015, 01:00:00 AM   ST_CLERK     2500                  121        50            
132         TJ            Olson         TJOLSON     1.650.555.0132   04/10/2017, 02:00:00 AM   ST_CLERK     2100                  121        50            
133         Jason         Mallin        JMALLIN     1.650.555.0133   06/14/2014, 02:00:00 AM   ST_CLERK     3300                  122        50            
134         Michael       Rogers        MROGERS     1.650.555.0134   08/26/2016, 02:00:00 AM   ST_CLERK     2900                  122        50            
135         Ki            Gee           KGEE        1.650.555.0135   12/12/2017, 01:00:00 AM   ST_CLERK     2400                  122        50            
136         Hazel         Philtanker    HPHILTAN    1.650.555.0136   02/06/2018, 01:00:00 AM   ST_CLERK     2200                  122        50            
137         Renske        Ladwig        RLADWIG     1.650.555.0137   07/14/2013, 02:00:00 AM   ST_CLERK     3600                  123        50            
138         Stephen       Stiles        SSTILES     1.650.555.0138   10/26/2015, 01:00:00 AM   ST_CLERK     3200                  123        50            
139         John          Seo           JSEO        1.650.555.0139   02/12/2016, 01:00:00 AM   ST_CLERK     2700                  123        50            
140         Joshua        Patel         JPATEL      1.650.555.0140   04/06/2016, 02:00:00 AM   ST_CLERK     2500                  123        50            
141         Trenna        Rajs          TRAJS       1.650.555.0141   10/17/2013, 02:00:00 AM   ST_CLERK     3500                  124        50            
142         Curtis        Davies        CDAVIES     1.650.555.0142   01/29/2015, 01:00:00 AM   ST_CLERK     3100                  124        50            
143         Randall       Matos         RMATOS      1.650.555.0143   03/15/2016, 01:00:00 AM   ST_CLERK     2600                  124        50            
144         Peter         Vargas        PVARGAS     1.650.555.0144   07/09/2016, 02:00:00 AM   ST_CLERK     2500                  124        50            
145         John          Singh         JSINGH      44.1632.960000   10/01/2014, 02:00:00 AM   SA_MAN       14000  0.4            100        80            
146         Karen         Partners      KPARTNER    44.1632.960001   01/05/2015, 01:00:00 AM   SA_MAN       13500  0.3            100        80            
147         Alberto       Errazuriz     AERRAZUR    44.1632.960002   03/10/2015, 01:00:00 AM   SA_MAN       12000  0.3            100        80            
148         Gerald        Cambrault     GCAMBRAU    44.1632.960003   10/15/2017, 02:00:00 AM   SA_MAN       11000  0.3            100        80            
149         Eleni         Zlotkey       EZLOTKEY    44.1632.960004   01/29/2018, 01:00:00 AM   SA_MAN       10500  0.2            100        80            
150         Sean          Tucker        STUCKER     44.1632.960005   01/30/2015, 01:00:00 AM   SA_REP       10000  0.3            145        80            
151         David         Bernstein     DBERNSTE    44.1632.960006   03/24/2015, 01:00:00 AM   SA_REP       9500   0.25           145        80            
152         Peter         Hall          PHALL       44.1632.960007   08/20/2015, 02:00:00 AM   SA_REP       9000   0.25           145        80            
153         Christopher   Olsen         COLSEN      44.1632.960008   03/30/2016, 02:00:00 AM   SA_REP       8000   0.2            145        80            
154         Nanette       Cambrault     NCAMBRAU    44.1632.960009   12/09/2016, 01:00:00 AM   SA_REP       7500   0.2            145        80            
155         Oliver        Tuvault       OTUVAULT    44.1632.960010   11/23/2017, 01:00:00 AM   SA_REP       7000   0.15           145        80            
156         Janette       King          JKING       44.1632.960011   01/30/2014, 01:00:00 AM   SA_REP       10000  0.35           146        80            
157         Patrick       Sully         PSULLY      44.1632.960012   03/04/2014, 01:00:00 AM   SA_REP       9500   0.35           146        80            
158         Allan         McEwen        AMCEWEN     44.1632.960013   08/01/2014, 02:00:00 AM   SA_REP       9000   0.35           146        80            
159         Lindsey       Smith         LSMITH      44.1632.960014   03/10/2015, 01:00:00 AM   SA_REP       8000   0.3            146        80            
160         Louise        Doran         LDORAN      44.1632.960015   12/15/2015, 01:00:00 AM   SA_REP       7500   0.3            146        80            
161         Sarath        Sewall        SSEWALL     44.1632.960016   11/03/2016, 01:00:00 AM   SA_REP       7000   0.25           146        80            
162         Clara         Vishney       CVISHNEY    44.1632.960017   11/11/2015, 01:00:00 AM   SA_REP       10500  0.25           147        80            
163         Danielle      Greene        DGREENE     44.1632.960018   03/19/2017, 01:00:00 AM   SA_REP       9500   0.15           147        80            
164         Mattea        Marvins       MMARVINS    44.1632.960019   01/24/2018, 01:00:00 AM   SA_REP       7200   0.1            147        80            
165         David         Lee           DLEE        44.1632.960020   02/23/2018, 01:00:00 AM   SA_REP       6800   0.1            147        80            
166         Sundar        Ande          SANDE       44.1632.960021   03/24/2018, 01:00:00 AM   SA_REP       6400   0.1            147        80            
167         Amit          Banda         ABANDA      44.1632.960022   04/21/2018, 02:00:00 AM   SA_REP       6200   0.1            147        80            
168         Lisa          Ozer          LOZER       44.1632.960023   03/11/2015, 01:00:00 AM   SA_REP       11500  0.25           148        80            
169         Harrison      Bloom         HBLOOM      44.1632.960024   03/23/2016, 01:00:00 AM   SA_REP       10000  0.2            148        80            
170         Tayler        Fox           TFOX        44.1632.960025   01/24/2016, 01:00:00 AM   SA_REP       9600   0.2            148        80            
171         William       Smith         WSMITH      44.1632.960026   02/23/2017, 01:00:00 AM   SA_REP       7400   0.15           148        80            
172         Elizabeth     Bates         EBATES      44.1632.960027   03/24/2017, 01:00:00 AM   SA_REP       7300   0.15           148        80            
173         Sundita       Kumar         SKUMAR      44.1632.960028   04/21/2018, 02:00:00 AM   SA_REP       6100   0.1            148        80            
174         Ellen         Abel          EABEL       44.1632.960029   05/11/2014, 02:00:00 AM   SA_REP       11000  0.3            149        80            
175         Alyssa        Hutton        AHUTTON     44.1632.960030   03/19/2015, 01:00:00 AM   SA_REP       8800   0.25           149        80            
176         Jonathon      Taylor        JTAYLOR     44.1632.960031   03/24/2016, 01:00:00 AM   SA_REP       8600   0.2            149        80            
177         Jack          Livingston    JLIVINGS    44.1632.960032   04/23/2016, 02:00:00 AM   SA_REP       8400   0.2            149        80            
178         Kimberely     Grant         KGRANT      44.1632.960033   05/24/2017, 02:00:00 AM   SA_REP       7000   0.15           149                      
179         Charles       Johnson       CJOHNSON    44.1632.960034   01/04/2018, 01:00:00 AM   SA_REP       6200   0.1            149        80            
180         Winston       Taylor        WTAYLOR     1.650.555.0145   01/24/2016, 01:00:00 AM   SH_CLERK     3200                  120        50            
181         Jean          Fleaur        JFLEAUR     1.650.555.0146   02/23/2016, 01:00:00 AM   SH_CLERK     3100                  120        50            
182         Martha        Sullivan      MSULLIVA    1.650.555.0147   06/21/2017, 02:00:00 AM   SH_CLERK     2500                  120        50            
183         Girard        Geoni         GGEONI      1.650.555.0148   02/03/2018, 01:00:00 AM   SH_CLERK     2800                  120        50            
184         Nandita       Sarchand      NSARCHAN    1.650.555.0149   01/27/2014, 01:00:00 AM   SH_CLERK     4200                  121        50            
185         Alexis        Bull          ABULL       1.650.555.0150   02/20/2015, 01:00:00 AM   SH_CLERK     4100                  121        50            
186         Julia         Dellinger     JDELLING    1.650.555.0151   06/24/2016, 02:00:00 AM   SH_CLERK     3400                  121        50            
187         Anthony       Cabrio        ACABRIO     1.650.555.0152   02/07/2017, 01:00:00 AM   SH_CLERK     3000                  121        50            
188         Kelly         Chung         KCHUNG      1.650.555.0153   06/14/2015, 02:00:00 AM   SH_CLERK     3800                  122        50            
189         Jennifer      Dilly         JDILLY      1.650.555.0154   08/13/2015, 02:00:00 AM   SH_CLERK     3600                  122        50            
190         Timothy       Venzl         TVENZL      1.650.555.0155   07/11/2016, 02:00:00 AM   SH_CLERK     2900                  122        50            
191         Randall       Perkins       RPERKINS    1.650.555.0156   12/19/2017, 01:00:00 AM   SH_CLERK     2500                  122        50            
192         Sarah         Bell          SBELL       1.650.555.0157   02/04/2014, 01:00:00 AM   SH_CLERK     4000                  123        50            
193         Britney       Everett       BEVERETT    1.650.555.0158   03/03/2015, 01:00:00 AM   SH_CLERK     3900                  123        50            
194         Samuel        McLeod        SMCLEOD     1.650.555.0159   07/01/2016, 02:00:00 AM   SH_CLERK     3200                  123        50            
195         Vance         Jones         VJONES      1.650.555.0160   03/17/2017, 01:00:00 AM   SH_CLERK     2800                  123        50            
196         Alana         Walsh         AWALSH      1.650.555.0161   04/24/2016, 02:00:00 AM   SH_CLERK     3100                  124        50            
197         Kevin         Feeney        KFEENEY     1.650.555.0162   05/23/2016, 02:00:00 AM   SH_CLERK     3000                  124        50            
198         Donald        OConnell      DOCONNEL    1.650.555.0163   06/21/2017, 02:00:00 AM   SH_CLERK     2600                  124        50            
199         Douglas       Grant         DGRANT      1.650.555.0164   01/13/2018, 01:00:00 AM   SH_CLERK     2600                  124        50            
200         Jennifer      Whalen        JWHALEN     1.515.555.0165   09/17/2013, 02:00:00 AM   AD_ASST      4400                  101        10            
201         Michael       Martinez      MMARTINE    1.515.555.0166   02/17/2014, 01:00:00 AM   MK_MAN       13000                 100        20            
202         Pat           Davis         PDAVIS      1.603.555.0167   08/17/2015, 02:00:00 AM   MK_REP       6000                  201        20            
203         Susan         Jacobs        SJACOBS     1.515.555.0168   06/07/2012, 02:00:00 AM   HR_REP       6500                  101        40            
204         Hermann       Brown         HBROWN      1.515.555.0169   06/07/2012, 02:00:00 AM   PR_REP       10000                 101        70            
205         Shelley       Higgins       SHIGGINS    1.515.555.0170   06/07/2012, 02:00:00 AM   AC_MGR       12008                 101        110           
206         William       Gietz         WGIETZ      1.515.555.0171   06/07/2012, 02:00:00 AM   AC_ACCOUNT   8300                  205        110           
*/

Elapsed: 00:00:00.003
107 rows selected. 


-- Ejercicio 1
SET SERVEROUTPUT ON;

DECLARE
    v_nombre HR.COUNTRIES.COUNTRY_NAME%TYPE;
    v_region HR.REGIONS.REGION_NAME%TYPE;
BEGIN
    SELECT C.COUNTRY_NAME, R.REGION_NAME INTO v_nombre, v_region
    FROM HR.COUNTRIES C
    JOIN HR.REGIONS R ON R.REGION_ID=C.REGION_ID 
    WHERE C.COUNTRY_ID = 'US';

    DBMS_OUTPUT.PUT_LINE('NOMBRE DEL PAÍS:'||v_nombre);
    DBMS_OUTPUT.PUT_LINE('NOMBRE DE LA REGIÓN:'||v_region);
END;

-- Ejercicio 2
SET SERVEROUTPUT ON;

DECLARE
    v_salario HR.EMPLOYEES.SALARY%TYPE;
BEGIN
    SELECT E.SALARY INTO v_salario
    FROM HR.EMPLOYEES E
    WHERE E.EMPLOYEE_ID = 100;

    IF v_salario > 10000 THEN
        DBMS_OUTPUT.PUT_LINE('ERES RICO!! COBRAS:'||v_salario);
    ELSE
        DBMS_OUTPUT.PUT_LINE('ERES RICO!! COBRAS:'||v_salario);
    END IF;
END;

-- Ejercicio 3
SET SERVEROUTPUT ON;

DECLARE
    r_pais HR.COUNTRIES%ROWTYPE;
BEGIN
    SELECT * INTO r_pais
    FROM HR.COUNTRIES C
    WHERE C.COUNTRY_ID = 'CA';

    DBMS_OUTPUT.PUT_LINE('Nombre del pais '||r_pais.COUNTRY_NAME);
    DBMS_OUTPUT.PUT_LINE('ID del pais '||r_pais.COUNTRY_ID);
END;

-- Ejercicio 4
SET SERVEROUTPUT ON;

DECLARE
    v_id1 HR.EMPLOYEES.EMPLOYEE_ID%TYPE:=&v_id1;
    v_id2 HR.EMPLOYEES.EMPLOYEE_ID%TYPE:=&v_id2;
    v_salario1 HR.EMPLOYEES.SALARY%TYPE;
    v_salario2 HR.EMPLOYEES.SALARY%TYPE;
BEGIN
    SELECT E.SALARY INTO v_salario2
    FROM HR.EMPLOYEES E
    WHERE E.EMPLOYEE_ID=v_id2;

    IF v_salario1 > v_salario2 THEN
        DBMS_OUTPUT.PUT_LINE('PRIMERO ES MAYOR');
    ELSE
        DBMS_OUTPUT.PUT_LINE('SEGUNDO ES MAYOR');
    END IF;
END;

-- Ejercicio 5
SET SERVEROUTPUT ON;

DECLARE
    v_id1 HR.COUNTRIES.COUNTRIE_ID%TYPE:=&v_id1;
    v_nombre HR.COUNTRIES.COUNTRY_NAME%TYPE;
    v_region HR.REGIONS.REGION_NAME%TYPE;
BEGIN
	

END;

-- Ejercicio 6
SET SERVEROUTPUT ON;

DECLARE
    v_id1 HR.COUNTRIES.COUNTRY_ID%TYPE:=&v_id1;
    v_nombre HR.COUNTRIES.COUNTRY_NAME%TYPE;
    v_region HR.REGIONS.REGION_NAME%TYPE;
BEGIN
    SELECT C.COUNTRY_NAME, R.REGION_NAME INTO v_nombre, v_region
    FROM HR.COUNTRIES C
    JOIN HR.REGIONS R ON R.REGION_ID = C.REGION_ID
    WHERE C.COUNTRY_ID = v_id1;

    DBMS_OUTPUT.PUT_LINE('nombre '||v_nombre);
    DBMS_OUTPUT.PUT_LINE('region '||v_region);
END;

-- Ejercicio 7
DECLARE
	v_cont HR.COUNTRY_ID%TYPE:='&v_cont';
	v_reg HR.REGIONS.REGION_NAME%TYPE:='&v_reg';
BEGIN
	SELECT HR.REGIONS.REGION_NAME INTO v_reg
	FROM HR.COUNTRIES INNER JOIN HR.REGIONS 
	ON HR.COUNTRIES.REGION_ID=HR.REGIONS.REGION_ID
	WHERE HR.COUNTRIES.COUNTRY_ID=v_cont;

	CASE v_reg
		WHEN 'EUROPE' THEN ;
		WHEN 'AMERICAS' THEN ;
	END CASE;

END;

-- Ejercicio ??
DECLARE
	v_name HR.COUNTRY_NAME%TYPE:='&v_name';
	v_id HR.COUNTRIES.COUNTRY_ID%TYPE:='&v_id';
	v_loc HR.LOCATION.LOCATION_ID%TYPE:='&v_loc';
BEGIN
	SELECT COUNTRY_ID INTRO v_id
	FROM HR.COUNTRIES
	WHERE HR.COUNTRIES.COUNTRY_NAME = v_name;

	SELECT LOCATION_ID INTO v_loc
	FROM HR.LOCATIONS L
	WHERE L.COUNTRY_ID = v_id;

	/* ... Sigue el ejercicio*/
END;
