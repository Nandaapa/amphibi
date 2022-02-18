
package amfibi;

public class hewan extends klasifikasi {

    public void katak() {
        super.setKaki("berselaput");
        System.out.println("Katak memiliki kaki yang " + super.getKaki());
        
        super.setJmlKaki(4);
        System.out.println("dengan jumlah kaki sebanyak " + super.getJmlKaki() + " buah");
        
        super.setKulit("kelenjar dan berlendir");
        System.out.println("Kulitnya juga "+super.getKulit());
        
        super.setDarah("berdarah dingin");
        System.out.println("Sebagai seekor amfibi, hewan ini "+super.getDarah());
        
        super.setReproduksi("bertelur serta pembuahan eksternal");
        System.out.println("Katak berkembangbiak dengan "+super.getReproduksi());
    }
    public void salamander(String habitat, int size) {
        super.setKaki("berselaput");
        System.out.println("Salamander memiliki kaki yang " + super.getKaki());

        super.setJmlKaki(4);
        System.out.println("dengan jumlah kaki sebanyak " + super.getJmlKaki() + " buah");

        super.setKulit("licin dan selalu basah");
        System.out.println("Kulitnya juga " + super.getKulit());

        super.setDarah("berdarah dingin");
        System.out.println("Sebagai seekor amfibi, hewan ini " + super.getDarah());

        super.setReproduksi("bertelur dan melahirkan serta pembuahan eksternal");
        System.out.println("Salamander berkembangbiak dengan " + super.getReproduksi());

        System.out.println("Salamander cenderung hidup di " + habitat);

        System.out.println("Beberapa spesies salamander bisa mencapai " + size + " meter");
    }
  
        
    }

