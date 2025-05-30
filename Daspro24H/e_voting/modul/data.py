import numpy as np
import math


first_names = ["Ayu", "Dewi", "Ramdan", "Abi", "Altaf", "Farhan", "Kermit", "Lia", "Rizky", "Siti", "Budi", "Rina"]
last_names = ["Putra", "Sari", "Wijaya", "Saputra", "Pratama", "Utami", "Hidayat", "Santoso", "Rahma", "Fauzi"]

def _generate_pemilih():
    n = 100
    dataPemilih = []
    for i in range(n):
        nama = f"{np.random.choice(first_names)} {np.random.choice(last_names)}"
        data = {
            "id": f"NP{i}",
            "nama": nama,
            "jurusan": np.random.choice(["TI", "SI", "DKV", "PM", "HK"]),
            "sudah_memilih": np.random.choice([True, False])
        }
        dataPemilih.append(data)
    return dataPemilih

def _generate_calon(terpilih):
    n = 3
    dataCalon = []
    suara = math.floor(terpilih / n)
    sisa = terpilih % n
    for i in range(n):
        jumlah_suara = suara + (1 if i < sisa else 0)
        nama = f"{np.random.choice(first_names)} {np.random.choice(last_names)}"
        data = {
            "id": f"NP{i}",
            "nama": nama,
            "Visi": np.random.choice(["Kejayaan", "Ketamakan", "Kebersamaan"]),
            "Jumlah_Suara": jumlah_suara
        }
        dataCalon.append(data)
    return dataCalon


dataPemilih = _generate_pemilih()
terpilih = sum(1 for p in dataPemilih if p["sudah_memilih"])
dataCalon = _generate_calon(terpilih)  


def get_pemilih():
    return dataPemilih

def get_calon():
    return dataCalon

# --- Add these update functions ---
def set_sudah_memilih(id_pemilih):
    for p in dataPemilih:
        if p["id"] == id_pemilih:
            p["sudah_memilih"] = True
            break

def tambah_suara_calon(id_calon):
    for c in dataCalon:
        if c["id"] == id_calon:
            c["Jumlah_Suara"] += 1
            break


