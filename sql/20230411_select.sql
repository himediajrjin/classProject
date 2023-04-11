
-- 2023.04.11
-- select

-- 로그인 한 사용자가 소유하고 있는 테이블의 정보
select * from tab;

-- 테이블 정보 확인
desc emp;
desc dept;

-- 테이터 추출하는 질의어 : select
-- select 컬럼이름, 컬럼이름, 컬럼이름 ... from 테이블 이름(VIEW 사용 가능) ;
-- select * from 테이블이름;

select * from dept;
SELECT * FROM DEPT;

-- 특정 컬럼의 데이터만 검색
select dname -- , deptno, loc
from dept
;


-- select 구문의 프리젠테이션영역에 테이블이 가지는 컴럼 뿐 아니라 연산(함수)의 결과를 새로운 컬럼으로 출력
select sal, sal+100, sal-100, sal*10, sal/2 from emp;
select sal + 100 from emp;
select sal - 100 from emp;
select sal * 10 from emp;
select sal / 2 from emp;


-- 사원테이블에서 사원의 이름과 급여, 연봉계산 결과를 출력. 
-- 연봉의 계산은 급여*12+상여금500
select ename, sal, sal*12+500
from emp;

-- 상여금 계산 => sal*12+comm
select sal, comm, nvl(comm, 0), sal*12+nvl(comm, 0)  from emp;


-- 컬럼의 이름에 별칭 부여
-- 컬럼 뒤에 as 키워드를 쓰고 별칭을 작성
select sal, comm, nvl(comm, 0) as comm1, sal*12+nvl(comm, 0) as yearSal  from emp;


-- 문자열의 연산 문자열을 붙여준다 => 문자열 || 문자열
select ename || ' is a ' || job
from emp;

-- select [distinct] from ...
-- => 중복 값을 제거하고 값을 하나만 출력
select deptno from emp;
select distinct deptno from emp;
select distinct job from emp;
