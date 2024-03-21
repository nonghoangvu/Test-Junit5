package com.vunh.repositories;

import com.vunh.entities.Account;
import com.vunh.utils.JPAUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;
import java.util.Optional;

public class AccountResp {
    private final EntityManager em = JPAUtil.getEntityManager();

    public List<Account> findAll() {
        return this.em.createQuery("SELECT a FROM Account a", Account.class).getResultList();
    }

    public Account login(String numberPhone, String password) {
        if (numberPhone.length() < 10 || numberPhone.length() > 13) {
            throw new IllegalArgumentException("Invalid number phone!");
        } else if (password.length() < 6 || password.length() > 20) {
            throw new IllegalArgumentException("Invalid password!");
        } else {
            TypedQuery<Account> query = this.em.createQuery("SELECT a FROM Account a WHERE a.phoneNum = :phoneNum AND a.password = :password", Account.class);
            query.setParameter("phoneNum", numberPhone);
            query.setParameter("password", password);
            List<Account> resultList = query.getResultList();
            if (!resultList.isEmpty()) {
                return resultList.get(0);
            } else {
                return null;
            }
        }
    }
}
