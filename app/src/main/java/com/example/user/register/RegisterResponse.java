package com.example.user.register;

public class RegisterResponse {

    String nama, email, noWa, noTlp, alamat;

    public RegisterResponse(String nama, String email, String noWa, String noTlp, String alamat) {
        this.nama = nama;
        this.email = email;
        this.noWa = noWa;
        this.noTlp = noTlp;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNoWa() {
        return noWa;
    }

    public void setNoWa(String noWa) {
        this.noWa = noWa;
    }

    public String getNoTlp() {
        return noTlp;
    }

    public void setNoTlp(String noTlp) {
        this.noTlp = noTlp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

//    public int isValidData() {
//        if (TextUtils.isEmpty(getNama()) && TextUtils.isEmpty(getEmail()) && TextUtils.isEmpty(getNoWa())
//                && TextUtils.isEmpty(getNoTlp()) && TextUtils.isEmpty(getAlamat())) {
//            return 0;
//        } else if (TextUtils.isEmpty(getNama())) {
//            return 1;
//        } else if (TextUtils.isEmpty(getEmail())) {
//            return 2;
//        } else if (TextUtils.isEmpty(getNoWa())) {
//            return 3;
//        } else if (TextUtils.isEmpty(getNoTlp())) {
//            return 4;
//        } else if (TextUtils.isEmpty(getAlamat())) {
//            return 5;
//        } else {
//            return -1;
//        }
//    }
//
//    public int isDataOffline() {
//        if (TextUtils.isEmpty(getNama()) && TextUtils.isEmpty(getEmail()) && TextUtils.isEmpty(getNoWa())
//                && TextUtils.isEmpty(getNoTlp()) && TextUtils.isEmpty(getAlamat())) {
//            return 0;
//        } else if (TextUtils.isEmpty(getNama())) {
//            return 1;
//        } else if (TextUtils.isEmpty(getEmail())) {
//            return 2;
//        } else if (TextUtils.isEmpty(getNoWa())) {
//            return 3;
//        } else if (TextUtils.isEmpty(getNoTlp())) {
//            return 4;
//        } else if (TextUtils.isEmpty(getAlamat())) {
//            return 5;
//        } else {
//            return -1;
//        }
//    }
}
