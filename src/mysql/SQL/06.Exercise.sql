#1. 2009도에 데뷔한 걸그룹의 힛트송은?
# (걸그룹 이름, 데뷔일자, 힛트송 제목)
SELECT r.name, r.debut, l.title FROM song l
JOIN girl_group r 
ON l.sid=r.hit_song_id   
WHERE year(debut)=2009;
	

# 2. 데뷔일자가 빠른 5개 그룹의 힛트송은?
# (걸그룹 이름, 데뷔일자, 힛트송 제목)
SELECT r.name, r.debut, l.title FROM song l
JOIN girl_group r 
ON l.sid=r.hit_song_id 
ORDER BY debut ASC LIMIT 5; 



# 3. 대륙별로 국가숫자, GNP의 합, 평균 국가별GNP는?
SELECT Continent, COUNT(*) AS CountryCount, SUM(GNP) AS TotalGNP, AVG(GNP) AS AverageGNP FROM country
GROUP BY Continent;


# 4. 아시아 대륙에서 인구가 가장 많은 도시 10개를 내림차순으로 보여줄 것
#   (대륙명, 국가명, 도시명, 인구수)
 SELECT r.Continent 대륙명, r.Name 국가명, l.name 도시명, l.Population 인구수 FROM city l
	JOIN country r
	ON l.CountryCode=r.Code
	WHERE r.Continent='Asia'
	ORDER BY l.Population DESC 
	LIMIT 10;


# 5. 전 세계에서 GNP가 높은 10개 국가에서 사용하는 공식언어는?
#       (국가명, GNP, 언어명)

SELECT r.Name countryName, l.Name cityName, l.Population, o.`Language` FROM city l
	JOIN country r ON l.CountryCode=r.Code
	JOIN countrylanguage o ON l.CountryCode=o.CountryCode
	WHERE r.Continent='GNP' AND o.IsOfficial='T'
	
	LIMIT 10;


