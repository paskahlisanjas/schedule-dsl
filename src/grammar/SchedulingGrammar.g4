grammar SchedulingGrammar;


expression  : command entity ;

command     : BUAT | UBAH | HAPUS | LIHAT ;
entity      : (KELAS | RUANG) nama (DENGAN atribut)?;
nama        : '\'' NAMA_VALUE '\'' ;
atribut     : KODE '=' kode_kelas ;
kode_kelas  : KODE_KELAS;

BUAT        : 'BUAT' ;
UBAH        : 'UBAH' ;
HAPUS       : 'HAPUS' ;
LIHAT       : 'LIHAT' ;
KELAS       : 'KELAS' ;
RUANG       : 'RUANG' ;
DENGAN      : 'DENGAN' ;
KODE        : 'KODE' ;

NAMA_VALUE : [a-zA-Z]+ ;
KODE_KELAS : [a-zA-Z]+ ;

WS : [ \t\r\n]+ -> skip;
