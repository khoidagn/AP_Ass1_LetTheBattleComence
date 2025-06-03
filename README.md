# Bài Tập Lớn 1 - Lập Trình Nâng Cao (HK242)

## 🔰 Thông tin chung
- **Học phần:** Lập trình nâng cao (Advanced Programming - AP)
- **Kỳ học:** HK242 - Trường Đại học Bách Khoa TP.HCM (HCMUT)
- **Họ tên:** Võ Công Đăng Khôi    
- **Đề bài:** Let the Battle Commence

## Cấu trúc thư mục
|
├── class/          # File bytecode được cung cấp
├── source/         # Các class chính cần cài đặt (Knight, Paladin, ...)
├── util/           # Các class tiện ích (Complex, Utility, TeamMaker)
├── Main.class      # Hàm main khởi chạy chương trình
└── README.md       

## 📄 Mô tả bài toán
Chương trình mô phỏng hệ thống chiến đấu giữa các nhân vật và quái vật theo quy tắc cho trước.  
Dựa trên sơ đồ lớp và bytecode ban đầu:
- Cài đặt các lớp như `Knight`, `Warrior`, `Paladin`, `DeathEater`
- Tính toán chỉ số **CombatScore** tùy loại nhân vật và điều kiện trận đấu (số nguyên tố, số chính phương...)
- Cấu trúc và thuật toán cần đảm bảo đúng mô hình hướng đối tượng và nguyên lý kế thừa

## 🛠 Cách build & chạy chương trình

### ⚙️ Biên dịch
Dùng terminal tại thư mục gốc:
```bash
javac source/*.java util/*.java
