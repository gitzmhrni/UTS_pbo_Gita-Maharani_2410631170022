/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpus;

public abstract class Item {
    private String id;
    private String judul;
    private boolean tersedia = true;

    public Item(String id, String judul) {
        this.id = id;
        this.judul = judul;
    }

    public String getId() { return id; }
    public String getJudul() { return judul; }
    public boolean isTersedia() { return tersedia; }
    public void setTersedia(boolean tersedia) { this.tersedia = tersedia; }

    public abstract String getInfo();
}

