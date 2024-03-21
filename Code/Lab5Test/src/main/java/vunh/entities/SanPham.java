package vunh.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SanPham {
    private String id;
    private String maSanPham;
    private String tenSanPham;
    private float gia;
    private String mauSac;
    private String kichThuoc;
    private int soLuong;
}
