package com.vunh.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "Account")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private String id;

    @Column(name = "ho_ten")
    private String fullName;

    @Column(name = "sdt")
    private String phoneNum;

    @Column(name = "email")
    private String email;

    @Column(name = "gioi_tinh")
    private Boolean gender;

    @Column(name = "ngay_sinh")
    private String birthdate;

    @Column(name = "mat_khau")
    private String password;

    @Column(name = "ngay_tao")
    private Date createdDate;

    @Column(name = "trang_thai")
    private String userState;

    @Column(name = "ghi_chu")
    private String note;
}