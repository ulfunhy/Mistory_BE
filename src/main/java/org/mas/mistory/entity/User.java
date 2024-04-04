package org.mas.mistory.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id; // users 테이블 기본키

    @Column(name = "login_id")
    private String loginId; // 로그인 시 사용하는 id

    @Column(name = "user_pw")
    private String userPw; // 비밀번호

    @Column(name = "user_name")
    private String userName; // 유저 이름
}