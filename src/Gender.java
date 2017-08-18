public enum Gender {

    MEN(false,true,false), WOMEN(true,false,true);

 private boolean hasLongHair;
 private boolean hasMustage;
 private boolean hasMakup;

    Gender(boolean hasLongHair, boolean hasMustage, boolean hasMakup) {
        this.hasLongHair = hasLongHair;
        this.hasMustage = hasMustage;
        this.hasMakup = hasMakup;
    }

    public boolean isHasLongHair() {
        return hasLongHair;
    }

    public void setHasLongHair(boolean hasLongHair) {
        this.hasLongHair = hasLongHair;
    }

    public boolean isHasMustage() {
        return hasMustage;
    }

    public void setHasMustage(boolean hasMustage) {
        this.hasMustage = hasMustage;
    }

    public boolean isHasMakup() {
        return hasMakup;
    }

    public void setHasMakup(boolean hasMakup) {
        this.hasMakup = hasMakup;
    }
}



