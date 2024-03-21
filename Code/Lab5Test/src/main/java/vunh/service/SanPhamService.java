package vunh.service;

import vunh.entities.SanPham;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SanPhamService {
    private List<SanPham> list;

    public SanPhamService() {
        this.list = new ArrayList<>();
        this.list.add(new SanPham("1", "SP001", "Product 1", 10.5f, "Red", "Large", 100));
        this.list.add(new SanPham("2", "SP002", "Product 2", 20.75f, "Blue", "Medium", 50));
        this.list.add(new SanPham("3", "SP003", "Product 3", 15.0f, "Green", "Small", 80));
    }

    public Boolean add(SanPham sp) {
        if (!sp.getMaSanPham().startsWith("SP")) {
            throw new IllegalArgumentException("Invalid product code!");
        } else if (sp.getSoLuong() < 0 || sp.getSoLuong() > 100) {
            throw new IllegalArgumentException("Invalid quantity!");
        }
        this.list.forEach(code -> {
            if (sp.getMaSanPham().equalsIgnoreCase(code.getMaSanPham())) {
                throw new IllegalArgumentException("Product code already exists!");
            } else if (sp.getId().equalsIgnoreCase(code.getId())) {
                throw new IllegalArgumentException("Product id already exists!");
            }
        });
        this.list.add(sp);
        return true;
    }

    public Boolean update(SanPham sp) {
        if (this.list.stream().noneMatch(data -> data.getId().equals(sp.getId()))) {
            throw new IllegalArgumentException("Id not found!");
        } else if (!sp.getMaSanPham().startsWith("SP")) {
            throw new IllegalArgumentException("Invalid product code!");
        } else if (sp.getSoLuong() < 0 || sp.getSoLuong() > 100) {
            throw new IllegalArgumentException("Invalid quantity!");
        } else if (!this.list.stream().filter(data -> data.getMaSanPham().equalsIgnoreCase(sp.getMaSanPham())).collect(Collectors.toList()).isEmpty()) {
            throw new IllegalArgumentException("Product code already exists!");
        }
        this.list.stream().filter(data -> data.getId().equals(sp.getId())).collect(Collectors.toList()).forEach(edit -> {
            edit.setMaSanPham(sp.getMaSanPham());
            edit.setTenSanPham(sp.getTenSanPham());
            edit.setGia(sp.getGia());
            edit.setMauSac(sp.getMauSac());
            edit.setKichThuoc(sp.getKichThuoc());
            edit.setSoLuong(sp.getSoLuong());
        });
        return true;
    }

    public Boolean delete(String id) {
        if (this.list.stream().noneMatch(data -> data.getId().equals(id))) {
            throw new IllegalArgumentException("Id not found!");
        }
        this.list.removeIf(data -> data.getId().equals(id));
        return true;
    }
}
