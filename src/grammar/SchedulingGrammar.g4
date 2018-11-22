grammar SchedulingGrammar;

expression  : command entity ';';

command     : BUAT | UBAH | HAPUS | LIHAT ;
entity      : (KELAS | RUANG) kode (DENGAN atribut)?;
kode        : '\'' KODE_VALUE '\'' ;
atribut     :  ( FASILITAS '=' meta_fasilitas
                | SKS '=' sks
                | KEBUTUHAN '=' meta_kebutuhan
                | PREFERENSI '=' preferensi
                | KAPASITAS '=' kapasitas
               )+;

meta_kebutuhan : ('\'' kebutuhan '\'' ','?)+ ;
meta_fasilitas : ('\'' fasilitas '\'' ','?)+ ;

kebutuhan   : TEXT ;
fasilitas   : TEXT ;
sks         : NUMBER ;
kapasitas   : NUMBER ;
preferensi  : HARI hari JAM jam ;
hari        : ('SENIN' | 'SELASA' | 'RABU' | 'KAMIS' | 'JUMAT') ;
jam         : NUMBER ;

BUAT        : 'BUAT' ;
UBAH        : 'UBAH' ;
HAPUS       : 'HAPUS' ;
LIHAT       : 'LIHAT' ;

KELAS       : 'KELAS' ;
RUANG       : 'RUANG' ;

DENGAN      : 'DENGAN' ;

FASILITAS   : 'FASILITAS' ;
KAPASITAS   : 'KAPASITAS' ;
KEBUTUHAN   : 'KEBUTUHAN' ;
PREFERENSI  : 'PREFERENSI' ;
SKS         : 'SKS' ;
HARI        : 'HARI' ;
JAM         : 'JAM KE' ;

NUMBER      : [0-9]+;
KODE_VALUE  : [a-zA-Z]*('0'..'9')+ ;
TEXT        : ([a-zA-Z]|('0'..'9')|'-')+ ;

WS          : [ \t\r\n]+ -> skip;