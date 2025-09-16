public class Retangulo extends FiguraGeometrica{
    private double largura;
    private double altura;

    public Retangulo(String cor, double largura, double altura){
        super(cor);
        this.largura = largura;
        this.altura = altura;
    }
    public double getLargura(){
        return this.largura;
    }
    public void setLargura(double largura){
        this.largura = largura;
    }
    public double getAltura(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        return altura*largura;
    }

    @Override
    public double calcularPerimetro(){
        return 2*(largura+altura);
    }

    @Override
    public String getTipoFigura(){
        return "Retangulo";
    }

    @Override
    public String getDetalhes(){
        return String.format("Largura: %.2f, Altura: %.2f",this.largura, this.altura);
    }
    @Override
    public String getInfo(){
        return String.format("ID: %d, Cor: %s, Tipo: %s, Largura: %.2f, Altura: %.2f, Area: %.2f, Perimetro: %.2f", 
        super.getId(), super.getCor(), this.getTipoFigura(), this.largura, this.altura, this.calcularArea(), this.calcularPerimetro());
    }
}

