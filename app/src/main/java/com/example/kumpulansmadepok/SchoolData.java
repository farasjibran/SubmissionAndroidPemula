package com.example.kumpulansmadepok;

import java.util.ArrayList;

public class SchoolData {
    private static String[] schoolNames = {
            "SMA NEGERI 2 DEPOK",
            "SMA NEGERI 3 DEPOK",
            "SMA NEGERI 4 DEPOK",
            "SMA NEGERI 6 DEPOK",
            "SMA NEGERI 7 DEPOK",
            "SMA NEGERI 8 DEPOK",
            "SMA NEGERI 9 DEPOK",
            "SMA NEGERI 11 DEPOK",
            "SMA NEGERI 12 DEPOK",
            "SMA NEGERI 13 DEPOK"
    };

    private static String[] schoolDetails = {
            "SMA Negeri 2 Depok adalah sekolah menengah atas di Kota Depok, provinsi Jawa Barat, Indonesia. Saat ini SMA Negeri 2 Depok menggunakan kurikulum 2013, sebelumnya SMA Negeri 2 Depok merupakan Rintisan Sekolah Berstandar Internasional. SMA Negeri 2 Depok merupakan salah satu sekolah unggulan dan favorit di Kota Depok, yang terkenal berkat prestasinya dibidang akademik dan non-akademik.",
            "SMA Negeri 3 Depok adalah sebuah Sekolah Menengah Atas Negeri Sekolah Standar Nasional di Kota Depok, Jawa Barat. Sejak tahun 2007, SMA Negeri 3 Depok dipimpin oleh Dra.Hj.Jasni Evawati,M.M sebagai Kepala sekolahnya menggantikan Drs.M.Achmadi yang sejak dimutasi ke SMA Negeri I Depok.",
            "Sejarah SMA Negeri 4 Depok berawal dari tahun 1992, SMA Negeri 1 Cimanggis didirikan sebagai filial dari SMA Negeri 2 Depok. Pada tahun 1994 tepatnya tanggal 22 Desember 1994, melalui Surat Keputusan Pemerintah Jawa Barat No. 0260/0/1994, secara resmi berdirilah SMA Negeri 1 Cimanggis.",
            "SMA Negeri 6 Depok, merupakan salah satu Sekolah Menengah Atas Negeri yang ada di Depok, yang beralamat di Jl. Raya Limo No. 30 Kec. Limo - Depok, Jawa Barat. Sama dengan SMA pada umumnya di Indonesia masa pendidikan sekolah di SMA Negeri 6 Depok ditempuh dalam waktu tiga tahun pelajaran, mulai dari Kelas X sampai Kelas XII.",
            "SMA Negeri 7 Depok, merupakan salah satu Sekolah Menengah Atas Negeri yang ada di Depok, yang beralamat di Leuwinanggun, Tapos - Depok, Jawa Barat. Sekolah ini didirikan pada 24 Juni 2010, dan mulai proses belajar mengajar pada tahun ajaran 2010/2011. Karena bangunan sekolah belum selesai, maka proses belajar mengajar untuk sementara masih menumpang di SMAN 4 dengan jam belajar sore hari.",
            "SMA Negeri 8 Depok, merupakan salah satu Sekolah Menengah Atas Negeri yang ada di Depok, yang beralamat di Jalan H.M. Natsir, Cilodong - Depok, Jawa Barat. SMA ini baru didirikan tahun 2011. Pada tanggal 13 Februari 2012, gedung baru SMA Negeri 8 Depok selesai dibangun dan diresmikan oleh Walikota Depok H.Nur Mahmudi Ismail.",
            "SMA Negeri 9 Depok, merupakan salah satu Sekolah Menengah Atas Negeri yang ada di Depok, yang beralamat di Jalan Bali Blok H RW 13, Perumahan Megapolitan Estate, Kel. Cinere, Kec. Cinere, - Depok, Jawa Barat. Sama dengan SMA pada umumnya di Indonesia masa pendidikan sekolah di SMA Negeri 9 Depok ditempuh dalam waktu tiga tahun pelajaran, mulai dari Kelas X sampai Kelas XII.",
            "SMA Negeri 11 Depok adalah sebuah sekolah menengah atas negeri yang berada di Kota Depok, yang beralamat di Jl. Margonda Raya no. 182 - Depok, Jawa Barat. Sama dengan SMA pada umumnya di Indonesia masa pendidikan sekolah di SMA Negeri 11 Depok ditempuh dalam waktu tiga tahun pelajaran.",
            "SMA Negeri 12 Depok, merupakan salah satu Sekolah Menengah Pertama Negeri yang ada di Depok, yang beralamat di JL.Cipayung No.27 Kec. Cipayung - Depok, Jawa Barat. Sama dengan SMA pada umumnya di Indonesia masa pendidikan sekolah di SMA Negeri 12 Depok ditempuh dalam waktu tiga tahun pelajaran, mulai dari Kelas X sampai Kelas XII.",
            "SMA Negeri 13 Depok, merupakan salah satu Sekolah Menengah Atas Negeri yang ada di Depok, yang beralamat di Jl. Pedurenan Kec. Cimanggis - Depok, Jawa Barat. Sama dengan SMA pada umumnya di Indonesia masa pendidikan sekolah di SMA Negeri 13 Depok ditempuh dalam waktu tiga tahun pelajaran, mulai dari Kelas X sampai Kelas XII."
    };

    private static int[] schoolImages = {
            R.drawable.sma2,
            R.drawable.sma3,
            R.drawable.sma4,
            R.drawable.sma6,
            R.drawable.sma7,
            R.drawable.sma8,
            R.drawable.sma9,
            R.drawable.sma11,
            R.drawable.sma12,
            R.drawable.sma13
    };

    static ArrayList<School> getListData() {
        ArrayList<School> list = new ArrayList<>();
        for (int position = 0; position < schoolNames.length; position++) {
            School school = new School();
            school.setName(schoolNames[position]);
            school.setDetail(schoolDetails[position]);
            school.setPhoto(schoolImages[position]);
            list.add(school);
        }
        return list;
    }
}

