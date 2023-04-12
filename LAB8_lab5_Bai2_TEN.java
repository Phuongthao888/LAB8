package LAB5_BAI2;

import java.util.Objects;

public class TEN implements Comparable<TEN>{
    private String HoTen;
    
    public TEN(){
    }
    
    public TEN(String HoTen){
        this.HoTen = HoTen;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }
    
    public String toString(){
        return "\n" + HoTen;
    }

    @Override
    public int compareTo(TEN o) {
        return this.getHoTen().compareTo(o.getHoTen());
    }

    @Override
    public int hashCode() {
        int hash;
        hash = Objects.hashCode(this.HoTen);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TEN other = (TEN) obj;
        return Objects.equals(this.HoTen, other.HoTen);
    }
    
    
}
