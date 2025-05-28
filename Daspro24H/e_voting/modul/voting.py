def lakukan_voting(pemilih, calon):
    print("Silakan melakukan voting.")

    while True:
        idPemilih = input("Masukkan ID pemilih: ")
        if idPemilih in pemilih["id"].values:
            if pemilih.loc[pemilih["id"] == idPemilih, "sudah_memilih"].values[0] == True:
                print("Pemilih ini sudah memilih sebelumnya")
                continue

            idCalon = input("Masukkan ID calon: ")
            if idCalon in calon["id"].values:
                pemilih.loc[pemilih["id"] == idPemilih, "sudah_memilih"] = True

                calon.loc[calon["id"] == idCalon, "Jumlah_Suara"] += 1

                print("Voting berhasil!")
                return pemilih, calon  
            else:
                print("ID calon tidak ditemukan")
        else:
            print("ID pemilih tidak ditemukan")
