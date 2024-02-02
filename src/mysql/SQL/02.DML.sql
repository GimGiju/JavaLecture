####################################################
#
# 데이터 조작 언어 (DML: Data Manipulation Languge)
#
####################################################

/*
 * 1. Update 
 *
 *      UPDATE 테이블
 *          SET 필드명1 = 값1, 필드명2= 값2,..., 필드명n=값n
 *          WHERE 조건;   이게 없으면 테이블 전체가 바뀌기 때문에 조심   # 조건 - 프라이머리 키 = 값
 */

UPDATE kcity SET name='수원', population=1200000 WHERE id=2340; # 필드명은 대소문자 구문 안함
SELECT * FROM kcity;  -- 위에 입력한 값을 출력해주는 코드

UPDATE kcity SET name='용인', population=1100000 WHERE id=2362;
SELECT * FROM kcity;

# ID가 2391 이상인 도시의 인구를 10만 추가
UPDATE kcity SET population=population+100000 WHERE id>2390;
SELECT * FROM kcity;

# ID 값 변경하는 방법 -- 절대 하지 말것!
UPDATE kcity SET id=id+100 WHERE id=2400;

/*
 * 2. Insert
 *
 *      INSERT INTO 테이블(필드명1, 필드명2, ..., 필드명 N)
 *          VALUES (값1, 값2, ... 값n)[(값1, 값2, ... 값n];  -- ,를 통해서 값이 계속 올 수 있음
 *      INSERT INTO 테이블 VALUES (모든 필드의 값)[, (모든 필드의 값)];
 */

# 경기도 화성시, 의정부시 추가
INSERT INTO kcity
    VALUES (default, '화성', 'KOR', 'Kyonggi', 900000),                       
            (default, '의정부', 'KOR', 'Kyonggi', 200000);                     -- (id, name, countrycode, district, population)

# 강원도 속초시 추가 - default value 활용(auto_increment 포함)
INSERT INTO kcity(name, countrycode, district) VALUES('속초', 'KOR', 'Kang-won');

# 경기도 광주시 추가 - auto_increment 속성이 설정되어 있어도 ID 값을 임의로 부여 가능
INSERT INTO kcity VALUES (2600, '광주', 'KOR', 'Kyonggi', 300000);
SELECT * FROM kcity ORDER BY id DESC;

/*
 * 3. DELETE FROM 테이블명 WHERE 조건;          # 조건 - primary key = value
 */

 # 강원도 속초시 삭제
DELETE FROM kcity WHERE id=2400;






