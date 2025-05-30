from .data import get_pemilih, get_calon, set_sudah_memilih, tambah_suara_calon
import pandas as pd

def lakukan_voting():
    pemilih = pd.DataFrame(get_pemilih())
    calon = pd.DataFrame(get_calon())
    print("Silakan melakukan voting.")

    while True:
        idPemilih = input("Masukkan ID pemilih: ")
        if idPemilih in pemilih["id"].values:
            if pemilih.loc[pemilih["id"] == idPemilih, "sudah_memilih"].values[0] == True:
                print("Pemilih ini sudah memilih sebelumnya")
                continue

            idCalon = input("Masukkan ID calon: ")
            if idCalon in calon["id"].values:
                set_sudah_memilih(idPemilih)
                tambah_suara_calon(idCalon)
                print("Voting berhasil!")
                return  
            else:
                print("ID calon tidak ditemukan")
        else:
            print("ID pemilih tidak ditemukan")
