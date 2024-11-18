package Tugas5;

class Musik {
    private String judul;
    private String artis;

    public Musik(String judul, String artis) {
        this.judul = judul;
        this.artis = artis;
    }

    public String getJudul() {
        return judul;
    }

    public String getArtis() {
        return artis;
    }

    @Override
    public String toString() {
        return "Judul: " + judul + ", Artis: " + artis;
    }
}
