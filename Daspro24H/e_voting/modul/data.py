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

import math

def tambah_calon(terpilih):
    print("Fungsi ini akan diisi sesuai kebutuhan modul.")

    n = 3
    number = 0
    id = "NP" + str(number)
    
    dataCalon = []
    suara = math.floor(terpilih/n)
    sisa = terpilih % n
    for i in range(n):
        if i == 2:
            suara +=1
        data = {
        "id" : id,
        "nama" : np.random.choice(["Ayu", "Dewi", "Ramdan", "Abi", "Altaf", "Farhan", "Kermit"]),
        "Visi" : np.random.choice(["Kejayaan", "Ketamakan", "Kebersamaan",]),
        "Jumlah_Suara" : suara
        }
        number += 1
        id = "NP" + str(number)
        dataCalon.append(data)
    return dataCalon

    
