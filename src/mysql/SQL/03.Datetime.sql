###################
# 날짜/시간 조작
###################

/*
 * 1. 테이블 생성
 */
CREATE TABLE if NOT EXISTS dateTable(
    id INT PRIMARY KEY AUTO_INCREMENT, 
    regDate DATE DEFAULT (CURRENT_DATE),
    modTime DATETIME DEFAULT CURRENT_TIMESTAMP 
);                 
/* CREATE TABLE if NOT EXISTS dateTable: 이 부분은 dateTable이라는 테이블을 생성하는 명령입니다. if NOT EXISTS는 이미 테이블이 존재하는 경우 다시 만들지 않도록 하는 옵션입니다.

(id INT PRIMARY KEY AUTO_INCREMENT,: 테이블의 첫 번째 열인 id를 정의합니다. 이 열은 정수형(INT)이며 주키(PRIMARY KEY) 역할을 합니다. AUTO_INCREMENT는 각 행이 삽입될 때마다 자동으로 1씩 증가하는 값을 할당하도록 하는 속성입니다.

regDate DATE DEFAULT (CURRENT_DATE),: 두 번째 열인 regDate를 정의합니다. 이 열은 날짜형(DATE)이며, DEFAULT (CURRENT_DATE)는 새로운 행이 삽입될 때 현재 날짜로 기본값을 설정하도록 하는 옵션입니다.

modTime DATETIME DEFAULT CURRENT_TIMESTAMP );: 세 번째 열인 modTime을 정의합니다. 이 열은 날짜와 시간형(DATETIME)이며, DEFAULT CURRENT_TIMESTAMP는 새로운 행이 삽입될 때 현재 날짜와 시간으로 기본값을 설정하도록 하는 옵션입니다.

따라서, 이 코드는 dateTable이라는 테이블을 생성하며, 해당 테이블은 세 개의 열로 구성됩니다. 첫 번째 열은 자동으로 증가하는 주 키 열이고, 두 번째 열은 날짜를 나타내며 기본값은 현재 날짜입니다. 세 번째 열은 날짜와 시간을 나타내며 기본값은 현재 날짜와 시간입니다.*/

/*
 * 2. 데이터 입력
 */ 
INSERT INTO dateTable VALUES (default, default, DEFAULT);
INSERT INTO datetable(id) VALUES (DEFAULT);
INSERT INTO datetable(regDate, modTime)VALUES
    ('2024-01-01', '2024-01-31 10:25:00'),
    ('2024-02-01', '2024-02-02 10:45:00');       --UPDATE datetable SET modTime='2024-02-02 16:45:00' WHERE id=4; 로 시간 바꿔줌
SELECT * FROM dateTable;   -- 위 코드드를 입력하고 결과값을 출력해주는 코드

/*
 * 3. 데이터 조회
 */
# 2024-02-02 형식
SELECT regDate, DATE_FORMAT (modTime, '%y-%m-%d') FROM dateTable;    --date_format 함수

# 10:45:00 AM 형식
SELECT DATE_FORMAT(modTime, '%h:%i:%s %p') FROM dateTable;   --'%시간%분%초 %AM OR PM

#24-02-02 16:45 형식
SELECT DATE_FORMAT(modTime, '%y-%m-%d-%H:%i:%s %p') FROM dateTable;   -- 24시간 형식일때는 h를 대문자로

# 날짜 조회 함수
SELECT NOW(), CURDATE(), CURTIME();

/*
 * 4. 데이터 수정
 */

SELECT * FROM datetable; --날짜 테이블 조회
# 날짜 수정
UPDATE datetable SET regDate=CURDATE() WHERE id=3;
UPDATE datetable SET regDate=CURDATE(), modTime=NOW() WHERE id=3; 

/*
 * 5. 날짜 계산
 */
 # 날짜 더하기/빼기
 SELECT DATE_ADD(NOW(), INTERVAL 40 DAY);

 SELECT DATE_SUB(NOW(), INTERVAL 3 MONTH);

 SELECT DATE_SUB(CURDATE(), INTERVAL 3 MONTH);  --2023-11-02

 # D-Day 계산
 SELECT TO_DAYS ('2024-11-14') - TO_DAYS (CURDATE());  --286

 # 요일: 1 - 일요일
 SELECT DAYOFWEEK(regDate) FROM datetable;



