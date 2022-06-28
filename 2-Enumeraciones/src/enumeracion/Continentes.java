package enumeracion;

public enum Continentes {
    AFRICA(53), EUROPA(30), ASIA(46), AMERICA(20), OCEANIA(1);
    
    private final int paises;
    
    Continentes(int paises){
        this.paises=paises;
    }
    
    public int getPaises(){
        return this.paises;
    }
}
