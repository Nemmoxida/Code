import numpy as np
import pandas as pd
import dataGen

def tambah_calon():
    print("List Calon :")
    dataCalon = data.get_calon()
    df = pd.DataFrame(dataCalon)
    print(df.to_string(index=False))

    
