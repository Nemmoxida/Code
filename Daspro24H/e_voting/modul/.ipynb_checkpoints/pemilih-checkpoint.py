import numpy as np
import pandas as pd

def tambah_pemilih():
    # print("Fungsi ini akan diisi sesuai kebutuhan modul.")
    n = 100
    number = 0
    id = "NP" + str(number)
    dataPemilih = []

    for i in range(n):
        data = {
        "id" : id,
        "nama" : np.random.choice(["Ayu", "Dewi", "Ramdan", "Abi", "Altaf", "Farhan", "Kermit"]),
        "jurusan" : np.random.choice(["TI", "SI", "DKV", "PM", "HK"]),
        "sudah_memilih" : np.random.choice([True, False])
        }
        number += 1
        id = "NP" + str(number)
        dataPemilih.append(data)

    return dataPemilih