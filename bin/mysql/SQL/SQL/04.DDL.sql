####################################################
#
# 데이터 정의 언어 (DML: Data Manipulation Languge)
#
####################################################

/*
 * 1. 테이블 생성
 *       ERMaster 활용
 */
# 주소록 테이블 생성 
CREATE TABLE addrBook(
	aid int NOT NULL AUTO_INCREMENT,
	name varchar(16) NOT NULL,
	tel varchar(16),
	email varchar(32),
	birthDay date,
	PRIMARY KEY (aid)
);

# 사용자 테이블 생성
CREATE TABLE users(
	uid varbinary(12) NOT NULL,
	pwd char(60) NOT NULL,
	uname varchar(16) NOT NULL,
	email varchar(32),
	regDate date DEFAULT (CURRENT_DATE),
	isDeleted int DEFAULT 0,
	PRIMARY KEY (uid)
);

/*
 * 2. 테이블 조회
 */

# 데이터 베이스내의 테이블 목록
SHOW TABLES;

# 테이블 구조
DESC users;         # describe

/*
 *3. 테이블 삭제
 */
# largeCity view largeCity;
Drop view largeCity;

# dateTable 삭제
DROP TABLE dateTable;

# kcity 테이블의 모든 데이터 삭제  -- 추천은 하지 않음
truncate kcity;          

/*
 * 4. 테이블 이름 변경
 */
RENAME TABLE kcity TO korCity;

/*
 * 5. 테이블 구조 변경
 */

# users 테이블에서 email 뒤에 tel 추가
ALTER TABLE users  
    ADD tel VARCHAR(16) NOT NULL AFTER email;

# users 테이블에서 tel 필드의 not null 제거  -- 텔에 새로운 타입을 부여한다고 생각 --
ALTER TABLE users 
    CHANGE tel tel VARCHAR(16);


