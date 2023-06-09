

-- 2023.04.13

-- JOIN

-- CROSS JOIN
-- 스키마를 붙이고 결과 행은 모든 경우의 수 => n * m
-- emp, dept => 14 * 4 => 56
select *
from emp, dept
;

select * 
from emp cross join dept
;




select *
from emp, dept
where emp.deptno=dept.deptno
;

select *
from emp inner join dept
on emp.deptno=dept.deptno
;
select *
from emp join dept
on emp.deptno=dept.deptno
;

select *
from emp join dept
using(deptno)
;

select *
from emp natural join dept
;

select deptno
from emp natural join dept
;




select e.deptno, e.empno, dname
from emp e, dept d
where e.deptno=d.deptno
;

-- 이름이 SCOTT인 사원의 부서명을 출력해봅시다.
select deptno from emp where ename='SCOTT';
-- 20
select dname from dept where deptno = 20;

-- JOIN으로 해결
select e.ename, d.dname
from emp e, dept d
where e.deptno=d.deptno
      and e.ename='SCOTT'
;

-- 사원별 급여 등급 표현
select * from salgrade;

select e.ename, s.grade , s.losal, e.sal, s.hisal
from emp e, salgrade s
where e.sal between s.losal and hisal
;

-- self Join : 자기 자신의 테이블을 조인하는 경우
-- 각 사원의 이름과 각 사원의 메니저 이름을 출력
select e.ename, m.ename
from emp e, emp m
where e.mgr=m.empno
;

-- outer join : 조건에 만족하지 않는 행도 출력을 하는 JOIN
select e.ename, nvl(m.ename, '없음')
from emp e, emp m
where e.mgr=m.empno(+)
;


select *
from emp e join emp m
on e.mgr=m.empno
;

select *
from emp e left outer join emp m
on e.mgr=m.empno
;


-- 도서 판매 정보 출력
select * from orders;

select o.orderid, c.name, b.bookname, o.saleprice, o.orderdate
from orders o, customer c, book b
where o.custid=c.custid and o.bookid=b.bookid
;

select * 
from orders o join customer c
on o.custid=c.custid
join book b
on b.bookid=o.bookid

;







