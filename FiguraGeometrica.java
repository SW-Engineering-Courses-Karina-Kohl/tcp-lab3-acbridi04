public abstract class FiguraGeometrica implements CalculosGeometricos{
    private String cor;
    private int id;
    private static int totalFiguras = 0;


    public FiguraGeometrica(String cor) {
        totalFiguras++;
        this.cor = cor;
        this.id = totalFiguras;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public int getId(){
        return id;
    }

    public static int getTotalFiguras(){
        return totalFiguras;
    }
    
    public abstract String getInfo(); //nao ha necessidade de getInfo nao ser abstrata
    public abstract String getDetalhes();
}
