package lowonganpekerjaan;

public class Pelamar extends Orang{
	private BerkasLamaran berkas;
        private int idPelamar;

	public Pelamar(String name, String tanggal, int idPelamar){
            super(name, tanggal);
            this.idPelamar = idPelamar;
	}
                
	public void createBerkas(BerkasLamaran bl){
            berkas = bl;
	}
        
        public BerkasLamaran getBerkas()
	{
            return berkas;
	}
        
        public int getId()
        {
            return idPelamar;
        }
}
