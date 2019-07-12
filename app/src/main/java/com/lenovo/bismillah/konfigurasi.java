package com.lenovo.bismillah;

public class konfigurasi {
    public static final String URL_ADD="http://192.168.43.116/Android/pegawai/tambah.php";
    public static final String URL_GET_ALL = "http://192.168.43.116/Android/pegawai/tampilsemua.php";
    public static final String URL_GET_EMP = "http://192.168.43.116/Android/pegawai/tampil.php?id=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP

    public static final String KEY_EMP_NIK = "nik";
    public static final String KEY_EMP_NAMA = "nama";
    public static final String KEY_EMP_KELAS = "kelas";
    public static final String KEY_EMP_JAM = "jam";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_NIK = "nik";
    public static final String TAG_NAMA = "nama";
    public static final String TAG_KELAS = "kelas";
    public static final String TAG_JAM = "jam";

    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";
}
