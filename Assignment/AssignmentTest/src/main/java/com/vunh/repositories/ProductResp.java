package com.vunh.repositories;

import com.vunh.entities.SanPham;
import com.vunh.utils.JPAUtil;
import jakarta.persistence.EntityManager;

public class ProductResp {
    private final EntityManager em = JPAUtil.getEntityManager();

    public Boolean insert(SanPham sp) {
        if (sp.getId().length() < 5 || sp.getId().length() > 10) {
            throw new IllegalArgumentException("");
        } else if (sp.getTen_san_pham().length() < 10 || sp.getTen_san_pham().length() > 30) {
            throw new IllegalArgumentException("");
        } else if (sp.getMo_ta().length() < 10 || sp.getMo_ta().length() > 50) {
            throw new IllegalArgumentException("");
        } else {
            try {
                return true;
            } catch (Exception e) {
                return false;
            }
        }
    }

    public Boolean update() {
        return null;
    }
}
