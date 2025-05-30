import numpy as np
import pandas as pd

from modul import pemilih, calon, voting, statistik, data

def main():

    # Inisialisasi data 
    dataPemilih = data._generate_pemilih()
    # Inisialisasi data calon 
    dataCalon = data._generate_calon()
    while True:
        
        print("\n===== SISTEM E-VOTING =====")
        print("1. Daftar Pemilih")
        print("2. Daftar Calon Ketua")
        print("3. Voting")
        print("4. Tampilkan Hasil Sementara")
        print("5. Statistik Pemilu")
        print("6. Keluar")

        pilihan = input("Pilih menu (1-6): ")

        if pilihan == "1":
            print(dataPemilih)
        elif pilihan == "2":
            print(dataCalon)
        elif pilihan == "3":
            dataPemilih, dataCalon = voting.lakukan_voting(dataPemilih, dataCalon)
        elif pilihan == "4":
            statistik.hasil(dataCalon)
        elif pilihan == "5":
            statistik.tampilkan_statistik(dataCalon)
        elif pilihan == "6":
            print("Terima kasih!")
            break
        else:
            print("Pilihan tidak valid.")

if __name__ == "__main__":
    main()
import numpy as np
import pandas as pd

from modul import pemilih, calon, voting, statistik, data

def main():

    # Inisialisasi data 
    dataPemilih = data._generate_pemilih()
    # Inisialisasi data calon 
    dataCalon = data._generate_calon()
    while True:
        
        print("\n===== SISTEM E-VOTING =====")
        print("1. Daftar Pemilih")
        print("2. Daftar Calon Ketua")
        print("3. Voting")
        print("4. Tampilkan Hasil Sementara")
        print("5. Statistik Pemilu")
        print("6. Keluar")

        pilihan = input("Pilih menu (1-6): ")

        if pilihan == "1":
            print(dataPemilih)
        elif pilihan == "2":
            print(dataCalon)
        elif pilihan == "3":
            dataPemilih, dataCalon = voting.lakukan_voting(dataPemilih, dataCalon)
        elif pilihan == "4":
            statistik.hasil(dataCalon)
        elif pilihan == "5":
            statistik.tampilkan_statistik(dataCalon)
        elif pilihan == "6":
            print("Terima kasih!")
            break
        else:
            print("Pilihan tidak valid.")

if __name__ == "__main__":
    main()
