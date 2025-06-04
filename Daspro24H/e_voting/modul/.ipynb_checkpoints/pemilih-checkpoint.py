import numpy as np
import pandas as pd
import dataGen

def tambah_pemilih():
    print("List Pemilih :")
    dataPemilih = data.get_pemilih()
    df = pd.DataFrame(dataPemilih)
    print(df.to_string(index=False))