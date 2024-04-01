package com.vunh.service;

import com.vunh.entities.BaiHat;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BaiHatService {
    private List<BaiHat> list;

    public BaiHatService() {
        this.list = new ArrayList<>();
    }

    public boolean delete(String id) {
        try {
            BaiHat baiHat = this.list.stream().filter(s -> s.getId().equals(id)).collect(Collectors.toList()).get(0);
            if(baiHat.getId() == null){
                return false;
            }
            this.list.remove(baiHat);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean add(BaiHat baiHat) {
        try {
            if (baiHat.getId() == null) {
                return false;
            } else if (baiHat.getDoDai() < 0) {
                return false;
            }
            this.list.add(baiHat);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
