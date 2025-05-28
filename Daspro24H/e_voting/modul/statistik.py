def tampilkan_statistik(data):
    print("Fungsi ini akan diisi sesuai kebutuhan modul.")
    print(f"total suara : {data["Jumlah_Suara"].sum()}")
    print(f"rata rata suara perkandidat : {data["Jumlah_Suara"].mean()}")
    print(f"total kandidat : {len(data)}")


def hasil(data):
    print(f"Total Pemilih : 100")
    print(data.sort_values(by="Jumlah_Suara", ascending=False))
