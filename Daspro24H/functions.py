# 1. Fungsi untuk mereverse tiap kata, tapi urutan katanya tetap
def reverse_per_kata(kalimat):
    kata2 = kalimat.split()  
    dibalik = [kata[::-1] for kata in kata2]  
    return ' '.join(dibalik)


# 2. Fungsi untuk mengurutkan kalimat berdasarkan indeks dari list urutan
def urutkan_kalimat(kalimat, urutan):
    kata2 = kalimat.split()  

    hasil = [kata2[i - 1] for i in urutan]
    return ' '.join(hasil)


# 3. Fungsi untuk mengganti huruf vokal dengan simbol tergantung opsi
def ganti_vokal(kalimat, opsi):

    vokal_map_kecil = {'a': '4', 'i': '1', 'u': '|_|', 'e': '3', 'o': '0'}
    vokal_map_besar = {'A': '4', 'I': '1', 'U': '|_|', 'E': '3', 'O': '0'}
    
    hasil = ""
    for huruf in kalimat:
        if opsi == 1 and huruf in vokal_map_kecil:
            hasil += vokal_map_kecil[huruf]
        elif opsi == 2 and huruf in vokal_map_besar:
            hasil += vokal_map_besar[huruf]
        else:
            hasil += huruf
    return hasil


print(reverse_per_kata("AKU CINTA KAMU"))
# Output: "UKA ATNIC UMAK"

print(urutkan_kalimat("HARI INI SEDANG BELAJAR PYTHON", [5, 1, 4, 3, 2]))
# Output: "PYTHON HARI BELAJAR SEDANG INI"

print(ganti_vokal("Aku Cinta Kamu", 1))
# Output: "Ak|_| C1nt4 K4m|_|"

print(ganti_vokal("Aku Cinta Kamu", 2))
# Output: "4ku Cinta Kamu"
