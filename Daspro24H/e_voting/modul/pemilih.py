import numpy as np
import pemilih
import pandas as pd

def tambah_pemilih():
    print("List Pemilih :")
    dataPemilih = pemilih.get_pemilih()
    df = pd.DataFrame(dataPemilih)
    print(df.to_string(index=False))