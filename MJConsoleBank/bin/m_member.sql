-- Oracle SQL Developer에서 최초 1회 실행할 초기 설정
-- 이미 테이블이 존재하면 CREATE TABLE은 다시 실행하지 마세요.
CREATE TABLE m_member (
    id VARCHAR2(200) PRIMARY KEY,
    password VARCHAR2(200),
    name VARCHAR2(200),
    email VARCHAR2(200),
    mobile VARCHAR2(20),
    type VARCHAR2(1)
);

INSERT INTO m_member (id, password, name, email, mobile, type)
VALUES ('admin', '1234', 'admin', NULL, NULL, 'A');
COMMIT;

SELECT * FROM m_member;

-- 아래는 Java PreparedStatement에서 실행하는 쿼리 예시입니다.
-- JDBC 문맥이 아닌 SQL Developer에서 ?를 그대로 실행하지 마세요.
-- INSERT INTO m_member (id, password, name, email, mobile, type) VALUES (?, ?, ?, ?, ?, ?);
-- SELECT id, password, name, email, mobile, type FROM m_member WHERE id = ?;
-- UPDATE m_member SET password = ?, name = ?, email = ?, mobile = ?, type = ? WHERE id = ?;
-- DELETE FROM m_member WHERE id = ?;
